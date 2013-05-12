/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.exception.InvalidDNASequenceException;
import org.geekfactor.dnasequencer.model.io.FileReader;
import org.geekfactor.dnasequencer.model.queries.Query;
import org.geekfactor.dnasequencer.model.queries.diseases.FromingensDischrypsiaQuery;
import org.geekfactor.dnasequencer.model.queries.diseases.TyberiusSyndromeQuery;
import org.geekfactor.dnasequencer.model.queries.features.BrownEyesQuery;
import org.geekfactor.dnasequencer.model.queries.general.ComplementarySequenceQuery;
import org.geekfactor.dnasequencer.model.queries.general.NucleobaseQuery;
import org.geekfactor.dnasequencer.model.queries.regex.RegExPositionFindingsQuery;
import org.geekfactor.dnasequencer.view.MainView;

/**
 *
 * This class contains all the logic which is necessary to have a valid
 * state of the GUI at all times. It wires together every components and
 * has access to the view and the model
 * 
 * @author Christoph Schmidl
 */
public class MainController {

    private DNASequence model = null;
    private MainView view = null;

    /**
     * 
     * @param model DNASequence
     * @param view MainView
     */
    public MainController(DNASequence model, MainView view) {
        this.model = model;
        this.view = view;

        // ---------- Add listeners to the view ----------
        view.addLoadFileListener(new LoadFileListener());
        view.addWriteFileListener(new WriteFileListener());
        view.addExecuteRegularExpressionListener(new ExecuteRegularExpressionListener());
        view.addClearAllListener(new ClearAllListener());
        view.addStartAnalysisListener(new StartAnalysisListener());
        view.addShowAboutListener(new ShowAboutListener());
        view.addClearRegExResultListener(new ClearRegExResultListener());
    }


    class ShowAboutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(view, "            DNA Sequencer\n\n Written by Christoph Schmidl \n "
                    + "Radboud University Nijmegen\n\n c.schmidl@student.ru.nl\n christoph.schmidl@gmx.net", "About", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    class ClearRegExResultListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.clearRegExResults();
        }
    }

    class LoadFileListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            final JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(view);
            String sequence = "";

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                try {
                    // open file and put it into DNASequence
                    sequence = FileReader.readFile(file.getAbsolutePath());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(view, "alert", "aler", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    model.setSequenceString(sequence);
                    view.clearAllInputs();
                    view.setSequenceTextArea(model.getSequenceString());
                    JOptionPane.showMessageDialog(view, "Valid DNA Sequence.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    view.setAllEnabled(true);
                } catch (InvalidDNASequenceException ex) {
                    JOptionPane.showMessageDialog(view, "Not a valid DNA Sequence!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }

        }
    }

    class StartAnalysisListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String sep = System.getProperty("line.separator");
            
            // Ininitialize all queries

            Query nucleoBases = new NucleobaseQuery(model);
            Query complementary = new ComplementarySequenceQuery(model);
            Query fromingen = new FromingensDischrypsiaQuery(model);
            Query tyberius = new TyberiusSyndromeQuery(model);
            Query brownEyes = new BrownEyesQuery(model);

            view.writeToOutputTextArea("*** General Information about sequence ***" + sep + sep);

            view.writeToOutputTextArea(nucleoBases.getResult() + sep);
            view.writeToOutputTextArea(complementary.getName() + ": " + sep + sep + complementary.getResult() + sep);

            view.writeToOutputTextArea(sep + "*** Diseases ***" + sep + sep);

            view.writeToOutputTextArea(fromingen.getName() + ": " + fromingen.getResult()+ sep);
            view.writeToOutputTextArea(tyberius.getName() + ": " + tyberius.getResult()+ sep);

            view.writeToOutputTextArea(sep + "*** Features ***" + sep + sep);

            view.writeToOutputTextArea(brownEyes.getName() + ": " + brownEyes.getResult()+ sep);
        }
    }

    class ClearAllListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setAllEnabled(false);
            view.clearAllInputs();
        }
    }

    class ExecuteRegularExpressionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Query executeRegEx = new RegExPositionFindingsQuery(model, view.getRegExTextFieldContent().toLowerCase());
            String result = executeRegEx.getName() + ": " + executeRegEx.getResult();
            view.addRegExTextFieldContent(result);
        }
    }

    class WriteFileListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser save = new JFileChooser();
            Writer fw = null;

            int returnVal = save.showSaveDialog(view);


            if (returnVal == JFileChooser.APPROVE_OPTION) {

                File toSave = save.getSelectedFile();
                try {
                    fw = new FileWriter(toSave.getAbsolutePath());
                    String stringToSave = view.getOutputTextAreaContent();
                    fw.write(stringToSave.replace("\\n", System.getProperty("line.separator")));
                    System.out.println(stringToSave);
                } catch (IOException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    if (fw != null) {
                        try {
                            fw.close();
                        } catch (IOException ex2) {
                            ex2.printStackTrace();
                        }
                    }
                }
            }
        }

        class ClearListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
    }
}
    
