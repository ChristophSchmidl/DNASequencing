/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.exception;

/**
 * Is used by DNASequence if the provided sequence String contains
 * invalid characters or is simply not valid at all.
 * 
 * @author Christoph Schmidl
 */
public class InvalidDNASequenceException extends Exception {

    /**
     * Creates a new instance of
     * <code>InvalidDNASequenceException</code> without detail message.
     */
    public InvalidDNASequenceException() {
    }

    /**
     * Constructs an instance of
     * <code>InvalidDNASequenceException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidDNASequenceException(String msg) {
        super(msg);
    }
}
