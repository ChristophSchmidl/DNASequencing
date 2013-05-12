/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.general;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.exception.InvalidDNASequenceException;
import org.geekfactor.dnasequencer.model.queries.diseases.FromingensDischrypsiaQueryTest;
import org.geekfactor.dnasequencer.model.queries.features.BrownEyesQuery;
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
public class ComplementarySequenceQueryTest {
    
    public ComplementarySequenceQueryTest() {
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
     * Test of getResult method, of class ComplementarySequenceQuery.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        DNASequence pass = null;
        DNASequence fail = null;
        ComplementarySequenceQuery instancePass = null;
        ComplementarySequenceQuery instanceFail = null;

        try {
            pass = new DNASequence("cag");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(FromingensDischrypsiaQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fail = new DNASequence("ggtt");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(FromingensDischrypsiaQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        instancePass = new ComplementarySequenceQuery(pass);
        instanceFail = new ComplementarySequenceQuery(fail);

        assertEquals("ctg", instancePass.getResult());
        assertEquals("aacc", instanceFail.getResult());
    }

    /**
     * Test of getName method, of class ComplementarySequenceQuery.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ComplementarySequenceQuery instance = 
                new ComplementarySequenceQuery(new DNASequence());
        String expResult = "Complementary Sequence";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class ComplementarySequenceQuery.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        ComplementarySequenceQuery instance = 
                new ComplementarySequenceQuery(new DNASequence());
        String expResult = "general";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }
}