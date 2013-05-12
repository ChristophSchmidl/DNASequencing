/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.queries.Query;

/**
 * Concrete Implementation of a query.
 * 
 * It returns the Positions of a given pattern in the sequence
 * 
 * @author Christoph Schmidl
 */
public class RegExPositionFindingsQuery implements Query {

    private DNASequence sequence;
    private String regEx;

    /**
     * Constructor which takes a DNASequence object and a 
     * String with an regular expression as argument.
     * 
     * @param queryTarget DNASeqence object to be inspected
     * @param regEx Regular expression
     */
    public RegExPositionFindingsQuery(DNASequence queryTarget, String regEx) {
        this.sequence = queryTarget;
        this.regEx = regEx;
    }

    @Override
    public String getResult() {

        String result = "";
        StringBuilder builder = new StringBuilder(result);
        Matcher matcher = Pattern.compile(this.regEx).matcher(this.sequence.getSequenceString());
        while (matcher.find()) {
            builder.append((matcher.start() + 1) + ", ");
        }

        if (builder.length() != 0) {
            builder.delete(builder.length() - 2, builder.length() - 1);
        }


        result = builder.toString();
        return result;
    }

    @Override
    public String getName() {
        return "Found Positions for RegEx " + "'" + this.regEx + "'";
    }

    @Override
    public String getCategory() {
        return "regex";
    }
}
