/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.features;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.queries.Query;

/**
 * Concrete Implementation of a query.
 * 
 * @author Christoph Schmidl
 */
public class BrownEyesQuery implements Query {

    private DNASequence sequence;

    public BrownEyesQuery(DNASequence queryTarget) {
        this.sequence = queryTarget;
    }

    @Override
    public String getResult() {

        Matcher cagMatcher = Pattern.compile("cag[cg][acg[^t]][acg[^t]]").matcher(this.sequence.getSequenceString());
        if (cagMatcher.find()) {
            return "positive";
        }
        return "negative";
    }

    @Override
    public String getName() {
        return "Brown eyes";
    }

    @Override
    public String getCategory() {
        return "features";
    }
}
