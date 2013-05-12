/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.diseases;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.queries.Query;

/**
 * Concrete Implementation of a query.
 * 
 * It looks for a specific pattern in the DNA sequence and indicates, 
 * if there is a risk for Tyberius Syndrome
 * 
 * @author Christoph Schmidl
 */
public class TyberiusSyndromeQuery implements Query {

    private DNASequence sequence;

     /**
     * Constructor which takes a DNASequence object as argument.
     * @param queryTarget DNASeqence object to be inspected
     */
    public TyberiusSyndromeQuery(DNASequence queryTarget) {
        this.sequence = queryTarget;
    }

    @Override
    public String getResult() {

        int counter = 0;
        Matcher matcher = Pattern.compile("ggg").matcher(this.sequence.getSequenceString());
        while (matcher.find()) {
            counter++;
        }

        if (counter >= 3) {
            return "positive";
        } else {
            return "negative";
        }
    }

    @Override
    public String getName() {
        return "Risk for Tyberius Syndrome";
    }

    @Override
    public String getCategory() {
        return "diseases";
    }
}
