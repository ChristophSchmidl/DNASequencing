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
 *
 * Concrete Implementation of a query.
 * 
 * It looks for a specific pattern in the DNA sequence and indicates, 
 * if there is a risk for Fromingens Dischrypsia
 * 
 * @author Christoph Schmidl
 */
public class FromingensDischrypsiaQuery implements Query {

    private DNASequence sequence;

    /**
     * Constructor which takes a DNASequence object as argument.
     * @param queryTarget DNASeqence object to be inspected
     */
    public FromingensDischrypsiaQuery(DNASequence queryTarget) {
        this.sequence = queryTarget;
    }

    
    @Override
    public String getResult() {

        Matcher matcher = Pattern.compile("[ag][ag][ag][ag][ct][ct][ct][ct]").matcher(this.sequence.getSequenceString());
        if (matcher.find()) {
            return "positive";
        }
        return "negative";
    }

    @Override
    public String getName() {
        return "Risk for Fromingens Dischrypsia";
    }

    @Override
    public String getCategory() {
        return "diseases";
    }
}
