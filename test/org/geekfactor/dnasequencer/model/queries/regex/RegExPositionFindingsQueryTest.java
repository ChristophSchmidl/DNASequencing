/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.regex;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.exception.InvalidDNASequenceException;
import org.geekfactor.dnasequencer.model.queries.general.NucleobaseQuery;
import org.geekfactor.dnasequencer.model.queries.general.NucleobaseQueryTest;
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
public class RegExPositionFindingsQueryTest {

    public RegExPositionFindingsQueryTest() {
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
     * Test of getResult method, of class RegExPositionFindingsQuery.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        RegExPositionFindingsQuery instance = null;
        DNASequence sequence = null;
        try {
            sequence = new DNASequence("cagt");
            instance = new RegExPositionFindingsQuery(sequence, "ca");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(NucleobaseQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String expResult = "1";
        String result = instance.getResult().charAt(0) + "";
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class RegExPositionFindingsQuery.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        RegExPositionFindingsQuery instance = null;
        DNASequence sequence = null;
        try {
            sequence = new DNASequence("cagt");
            instance = new RegExPositionFindingsQuery(sequence, "ca");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(NucleobaseQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String expResult = "Found Positions for RegEx " + "'" + "ca" + "'";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class RegExPositionFindingsQuery.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        RegExPositionFindingsQuery instance = null;
        DNASequence sequence = null;
        try {
            sequence = new DNASequence("cagt");
            instance = new RegExPositionFindingsQuery(sequence, "ca");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(NucleobaseQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String expResult = "regex";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }
}