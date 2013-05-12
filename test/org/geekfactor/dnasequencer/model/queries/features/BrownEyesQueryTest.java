/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.features;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.geekfactor.dnasequencer.model.DNASequence;
import org.geekfactor.dnasequencer.model.exception.InvalidDNASequenceException;
import org.geekfactor.dnasequencer.model.queries.diseases.FromingensDischrypsiaQueryTest;
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
public class BrownEyesQueryTest {
    
    public BrownEyesQueryTest() {
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
     * Test of getResult method, of class BrownEyesQuery.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        DNASequence pass = null;
        DNASequence fail = null;
        BrownEyesQuery instancePass = null;
        BrownEyesQuery instanceFail = null;

        try {
            pass = new DNASequence("cagcgg");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(FromingensDischrypsiaQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fail = new DNASequence("cagctt");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(FromingensDischrypsiaQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        instancePass = new BrownEyesQuery(pass);
        instanceFail = new BrownEyesQuery(fail);

        assertEquals("positive", instancePass.getResult());
        assertEquals("negative", instanceFail.getResult());
    }

    /**
     * Test of getName method, of class BrownEyesQuery.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BrownEyesQuery instance = new BrownEyesQuery(new DNASequence());
        String expResult = "Brown eyes";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class BrownEyesQuery.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        BrownEyesQuery instance = new BrownEyesQuery(new DNASequence());
        String expResult = "features";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }
}