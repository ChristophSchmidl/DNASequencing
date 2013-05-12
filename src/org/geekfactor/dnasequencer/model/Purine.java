/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model;

/**
 * Simple enum class which contains the two different
 * Purines and their character representation
 * @author Christoph Schmidl
 */
public enum Purine {

    Guanine {
        @Override
        public String toString() {
            return "g";
        }
    },
    Adenine {
        @Override
        public String toString() {
            return "a";
        }
    };
}
