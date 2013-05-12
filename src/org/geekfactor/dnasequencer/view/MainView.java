/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.view;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import org.geekfactor.dnasequencer.controller.MainController;
import org.geekfactor.dnasequencer.model.DNASequence;

/**
 *
 * The "dumb" mainView. The GUI-logic is located in its controller.
 * 
 * @author Christoph Schmidl
 */
public class MainView extends javax.swing.JFrame implements Observer {

    private DNASequence model;
    private MainController controller;

    /**
     * Creates new form MainView
     */
    public MainView() {
        super();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        initComponents();
        this.setAllEnabled(false);
    }

    public MainView(DNASequence model) {
        this();
        this.model = model;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sequenceTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        regExSearchTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        regExResultTextArea = new javax.swing.JTextArea();
        findRegExButton = new javax.swing.JButton();
        clearRegExResultButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        outputArea = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        startAnalysisButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DNA Sequencer");
        setPreferredSize(new java.awt.Dimension(800, 555));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DNA Sequence"));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        sequenceTextArea.setEditable(false);
        sequenceTextArea.setColumns(20);
        sequenceTextArea.setLineWrap(true);
        sequenceTextArea.setRows(5);
        jScrollPane1.setViewportView(sequenceTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Regular Expression"));

        jLabel7.setText("Results");

        regExResultTextArea.setEditable(false);
        regExResultTextArea.setColumns(20);
        regExResultTextArea.setLineWrap(true);
        regExResultTextArea.setRows(5);
        jScrollPane2.setViewportView(regExResultTextArea);

        findRegExButton.setText("Find");

        clearRegExResultButton.setText("Clear");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regExSearchTextField)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 118, Short.MAX_VALUE)
                        .addComponent(findRegExButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearRegExResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regExSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearRegExResultButton)
                    .addComponent(findRegExButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Analysis Results"));

        outputTextArea.setEditable(false);
        outputTextArea.setColumns(20);
        outputTextArea.setLineWrap(true);
        outputTextArea.setRows(5);
        outputArea.setViewportView(outputTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputArea, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        startAnalysisButton.setText("Start Analysis");

        clearButton.setText("Clear All");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openFileMenuItem.setMnemonic('o');
        openFileMenuItem.setText("Open DNA file");
        openFileMenuItem.setName(""); // NOI18N
        fileMenu.add(openFileMenuItem);

        saveFileMenuItem.setMnemonic('s');
        saveFileMenuItem.setText("Save Analysis");
        fileMenu.add(saveFileMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startAnalysisButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startAnalysisButton)
                            .addComponent(clearButton)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearRegExResultButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton findRegExButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openFileMenuItem;
    private javax.swing.JScrollPane outputArea;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JTextArea regExResultTextArea;
    private javax.swing.JTextField regExSearchTextField;
    private javax.swing.JMenuItem saveFileMenuItem;
    private javax.swing.JTextArea sequenceTextArea;
    private javax.swing.JButton startAnalysisButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // ---------------- Add Listener Methods ----------------
    public void addLoadFileListener(ActionListener loadFile) {
        this.openFileMenuItem.addActionListener(loadFile);
    }

    public void addWriteFileListener(ActionListener writeFile) {
        this.saveFileMenuItem.addActionListener(writeFile);
    }

    public void addExecuteRegularExpressionListener(ActionListener regEx) {
        this.findRegExButton.addActionListener(regEx);
    }
    
    public void addClearAllListener(ActionListener clearAll){
        this.clearButton.addActionListener(clearAll);
    }
    
    public void addStartAnalysisListener(ActionListener startAnalysis){
        this.startAnalysisButton.addActionListener(startAnalysis);
    }
    
    public void addShowAboutListener(ActionListener showAbout){
        this.aboutMenuItem.addActionListener(showAbout);
    }
    
    public void addClearRegExResultListener(ActionListener clearRegEx){
        this.clearRegExResultButton.addActionListener(clearRegEx);
    }

    // ---------------- Helper Methods ----------------
    public void setAllEnabled(boolean state) {
        this.findRegExButton.setEnabled(state);
        this.startAnalysisButton.setEnabled(state);
        this.clearButton.setEnabled(state);
        this.saveFileMenuItem.setEnabled(state);
        this.clearRegExResultButton.setEnabled(state);
    }
    
    public void clearAllInputs(){
        this.sequenceTextArea.setText("");
        this.regExResultTextArea.setText("");
        this.regExSearchTextField.setText("");
        this.outputTextArea.setText("");
    }
    
    public void clearRegExResults(){
        this.regExResultTextArea.setText("");
    }

    public void writeToOutputTextArea(String text) {
        this.outputTextArea.append(text + "\n");
    }

    public void setSequenceTextArea(String text) {
        this.sequenceTextArea.setText(text);
    }

    public String getRegExTextFieldContent() {
        return this.regExSearchTextField.getText();
    }

    public void setRegExResultTextArea(String text) {
        this.regExResultTextArea.setText(text);
    }

    public void addRegExTextFieldContent(String text) {
        this.regExResultTextArea.append(text + "\n\n");
    }
    
    public String getOutputTextAreaContent(){
        return this.outputTextArea.getText();
    }
}
