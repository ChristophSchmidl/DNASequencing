/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.general;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.exception.InvalidDNASequenceException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christoph Schmidl
 */
public class NucleobaseQueryTest {

    public NucleobaseQueryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getResult method, of class NucleobaseQuery.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        String sep = System.getProperty("line.separator");
        StringBuilder builder = new StringBuilder();
        NucleobaseQuery instance = null;
        DNASequence sequence = null;
        try {
            sequence = new DNASequence("cagt");
            instance = new NucleobaseQuery(sequence);
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(NucleobaseQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        builder.append("Amount of Adenine: " + 1 + sep);
        builder.append("Amount of Guanine: " + 1 + sep);
        builder.append("Amount of Cytosine: " + 1 + sep);
        builder.append("Amount of Thymine: " + 1 + sep);
        builder.append("Amount of Purines: " + 2 + sep);
        builder.append("Amount of Pyrimidines: " + 2 + sep);


        String expResult = null;
        expResult = builder.toString();
        String result = instance.getResult();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class NucleobaseQuery.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        NucleobaseQuery instance = null;
        DNASequence sequence = null;
        try {
            sequence = new DNASequence("cagt");
            instance = new NucleobaseQuery(sequence);
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(NucleobaseQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String expResult = "Nucleobase Information";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class NucleobaseQuery.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        NucleobaseQuery instance = null;
        DNASequence sequence = null;
        try {
            sequence = new DNASequence("cagt");
            instance = new NucleobaseQuery(sequence);
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(NucleobaseQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String expResult = "general";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }
}