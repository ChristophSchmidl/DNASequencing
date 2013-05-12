/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model;

import java.util.ArrayList;
import org.geekfactor.dnasequencer.model.exception.InvalidDNASequenceException;
import org.geekfactor.dnasequencer.model.queries.Query;

/**
 *
 * Simple container class for DNA sequences.
 * It automatically checks, if the given dna string/sequence is valid.
 * Valid character = c,g,a,t
 * It also contains the occurences of the different nucleobases
 * 
 * @author Christoph Schmidl
 */
public class DNASequence {

    private String sequenceString;
    private int amountOfAdenine = 0;
    private int amountOfGuanine = 0;
    private int amountOfCytosine = 0;
    private int amountOfThymine = 0;
    private int amountOfPurines = 0;
    private int amountOfPyrimidines = 0;
    private ArrayList<Query> queries = null;

    
    /**
     * Constructor takes a DNA sequence and validates it. It also 
     * counts the different occurences of nucleobases
     * 
     * @param sequence The string which contains the DNA sequence
     * @throws InvalidDNASequenceException 
     */
    public DNASequence(String sequence) throws InvalidDNASequenceException {
        this.validateAndInitialize(sequence);
    }

    /**
     * Simple no-arg Constructor. The DNA sequence has to be provided later
     * by calling setSequenceString(String sequence)
     */
    public DNASequence() {
        queries = new ArrayList<Query>();
    }

    /**
     * Sets the DNA sequence and validates it.
     * 
     * @param sequence The string which contains the DNA sequence
     * @throws InvalidDNASequenceException 
     */
    public void setSequenceString(String sequence) throws InvalidDNASequenceException {
        this.validateAndInitialize(sequence);
    }

    /**
     * 
     * Private Helper method. It validates the DNA sequence, if the
     * given characters are valid and then initializes the different fields
     * of the class. It counts the amount of the different nucleobases
     * 
     * @param sequence The string which contains the DNA sequence
     * @throws InvalidDNASequenceException 
     */
    private void validateAndInitialize(String sequence) throws InvalidDNASequenceException {
        if (this.isValidDNASequence(sequence)) {
            System.out.println("Is valid DNA sequence!");
            this.sequenceString = sequence;
            queries = new ArrayList<Query>();
            this.processSequence();
        } else {
            throw new InvalidDNASequenceException();
        }
    }

    /**
     * 
     * @return amount of Adenine in the given sequence
     */
    public int getAmountOfAdenine() {
        return amountOfAdenine;
    }

    /**
     * 
     * @return amount of Guanine in the given sequence
     */
    public int getAmountOfGuanine() {
        return amountOfGuanine;
    }
    
    /**
     * 
     * @return amount of Cytosine in the given sequence
     */
    public int getAmountOfCytosine() {
        return amountOfCytosine;
    }

    /**
     * 
     * @return amount of Thymine in the given sequence
     */
    public int getAmountOfThymine() {
        return amountOfThymine;
    }

    /**
     * 
     * @return the given Sequence string
     */
    public String getSequenceString() {
        return sequenceString;
    }

    /**
     * 
     * @return amount of Purines in the given sequence
     */
    public int getAmountOfPurines() {
        return amountOfPurines;
    }

    /**
     * 
     * @return amount of Pyrimidines in the given sequence
     */
    public int getAmountOfPyrimidines() {
        return amountOfPyrimidines;
    }

    /**
     * 
     * @return length of the sequence
     */
    public int getSequenceLength() {
        return this.sequenceString.length();
    }

    /**
     * 
     * @param sequence The string which contains the DNA sequence
     * @return boolean if the sequence is valid
     */
    private boolean isValidDNASequence(String sequence) {

        sequence = sequence.toLowerCase();

        for (int i = 0; i < sequence.length(); i++) {
            if (!isValidNucleobase(sequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * @param c character which has to be validted if c,g,a,t
     * @return boolean if the character is valid
     */
    private boolean isValidNucleobase(char c) {

        for (Nucleobase base : Nucleobase.values()) {
            if (base.toString().equals(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Simple helper method which counts the amounts of different
     * nucleobases
     */
    private void processSequence() {

        for (int i = 0; i < this.sequenceString.length(); i++) {
            if (String.valueOf(this.sequenceString.charAt(i)).equals(Nucleobase.Cytosine.toString())) {
                this.amountOfCytosine++;
                this.amountOfPyrimidines++;
                continue;
            } else if (String.valueOf(this.sequenceString.charAt(i)).equals(Nucleobase.Adenine.toString())) {
                this.amountOfAdenine++;
                this.amountOfPurines++;
                continue;
            } else if (String.valueOf(this.sequenceString.charAt(i)).equals(Nucleobase.Guanine.toString())) {
                this.amountOfGuanine++;
                this.amountOfPurines++;
                continue;
            } else if ((String.valueOf(this.sequenceString.charAt(i)).equals(Nucleobase.Thymine.toString()))) {
                this.amountOfThymine++;
                this.amountOfPyrimidines++;
                continue;
            }
        }
    }
}
