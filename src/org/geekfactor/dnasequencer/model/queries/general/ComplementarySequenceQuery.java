/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.general;

import java.util.HashMap;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.queries.Query;

/**
 * Concrete Implementation of a query.
 * 
 * Simply gives the complementary sequence of a given DNA sequence
 *  
 * @author Christoph Schmidl
 */
public class ComplementarySequenceQuery implements Query {

    private static HashMap<Character, Character> complements;

    static {
        complements = new HashMap<Character, Character>();
        complements.put('a', 't');
        complements.put('t', 'a');
        complements.put('c', 'g');
        complements.put('g', 'c');
        complements.put('r', 'y');
        complements.put('y', 'r');
    }
    private DNASequence sequence;
    
    /**
     * Constructor which takes a DNASequence object as argument.
     * @param queryTarget DNASeqence object to be inspected
     */
    public ComplementarySequenceQuery(DNASequence queryTarget) {
        this.sequence = queryTarget;
    }

    @Override
    public String getResult() {

        String reverseSequence = sequence.getSequenceString().toLowerCase();

        String complement = "";
        StringBuilder complementBuilder = new StringBuilder(complement);
        StringBuilder builder = new StringBuilder(reverseSequence);
        reverseSequence = builder.reverse().toString();

        for (int i = 0; i < reverseSequence.length(); i++) {
            complementBuilder.append(ComplementarySequenceQuery.complements.get(reverseSequence.charAt(i)));
        }
        complement = complementBuilder.toString();

        return complement;
    }

    @Override
    public String getName() {
        return "Complementary Sequence";
    }

    @Override
    public String getCategory() {
        return "general";
    }
}
