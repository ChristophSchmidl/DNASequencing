/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.view;

import org.geekfactor.dnasequencer.controller.MainController;
import org.geekfactor.dnasequencer.model.DNASequence;

/**
 * The main class. It wires all things together and constructs the
 * mvc architecure
 * 
 * @author Christoph Schmidl
 */
public class Main {

    public static void main(String[] args) {

        DNASequence model = new DNASequence();
        MainView view = new MainView(model);
        MainController controller = new MainController(model, view);
        view.setVisible(true);
    }
}
