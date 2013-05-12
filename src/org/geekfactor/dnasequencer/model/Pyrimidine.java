/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model;

/**
 * Simple enum class which contains the two different
 * Pyrimidines and their character representation
 * @author Christoph Schmidl
 */
public enum Pyrimidine {

    
    
    Cytosine {
        @Override
        public String toString() {
            return "c";
        }
    },
    Thymine {
        @Override
        public String toString() {
            return "t";
        }
    };
}
