/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model;

/**
 * Simple enum class which contains the four different
 * nucleobases and their character representation
 * 
 * @author Christoph Schmidl
 */
public enum Nucleobase {
    
    Cytosine {
        @Override
        public String toString() {
            return "c";
        }
    },
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
    },
    Thymine {
        @Override
        public String toString() {
            return "t";
        }
    };
}
