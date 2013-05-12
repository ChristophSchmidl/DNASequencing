/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries;


/**
 * Interface for all queries. A query is just a "question" for a
 * DNASequence. The algorithm to retrieve wanted information from the DNA
 * Sequence, has to be implemented in the getResult() method.
 * 
 * Another approach would be, to implement this as a generic, where the return
 * type of getResult() would be the type of the given generic. 
 * 
 * It would also be an improvement, when each query would be implemented 
 * as a thread, because there is no interaction between the queries.
 * 
 * This current implementation is just a quick solution.
 * 
 * @author Christoph Schmidl
 */
public interface Query {

    /**
     * 
     * @return the result of the query
     */
    public String getResult();
    /**
     * 
     * @return the description of the task
     */
    public String getName();
    /**
     * 
     * @return the category like: features, disease, general...
     */
    public String getCategory();
}
