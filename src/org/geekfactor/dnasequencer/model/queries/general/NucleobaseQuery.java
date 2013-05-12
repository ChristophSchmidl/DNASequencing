/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.general;

import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.queries.Query;

/**
 * Concrete Implementation of a query.
 * 
 * Currently, the DNASequence object itself holds all the information
 * about its amount of nucleobases. To be consistent, it would make
 * sense to transfer the whole counting behaviour in this class. But on the
 * other hand, that would mean that we are iterating the sequence string
 * one more time.
 * 
 * This query just invokes the getter-methods of the DNASequence about
 * the nucleobases
 * 
 * @author Christoph Schmidl
 */
public class NucleobaseQuery implements Query {

    private DNASequence sequence;

    /**
     * Constructor which takes a DNASequence object as argument.
     * 
     * @param queryTarget DNASeqence object to be inspected
     */
    public NucleobaseQuery(DNASequence queryTarget) {
        this.sequence = queryTarget;
    }

    @Override
    public String getResult() {
        
        String sep = System.getProperty("line.separator");
        String result = "";

        StringBuilder builder = new StringBuilder(result);
        
        builder.append("Amount of Adenine: " + sequence.getAmountOfAdenine() + sep);
        builder.append("Amount of Guanine: " + sequence.getAmountOfGuanine() + sep);
        builder.append("Amount of Cytosine: " + sequence.getAmountOfCytosine() + sep);
        builder.append("Amount of Thymine: " + sequence.getAmountOfThymine() + sep);
        builder.append("Amount of Purines: " + sequence.getAmountOfPurines() + sep);
        builder.append("Amount of Pyrimidines: " + sequence.getAmountOfPyrimidines() + sep);
        
        return builder.toString();
    }

    @Override
    public String getName() {
        return "Nucleobase Information";
    }

    @Override
    public String getCategory() {
        return "general";
    }
}
