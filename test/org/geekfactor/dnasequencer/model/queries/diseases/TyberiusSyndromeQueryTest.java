/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.queries.diseases;

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
public class TyberiusSyndromeQueryTest {

    public TyberiusSyndromeQueryTest() {
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
     * Test of getResult method, of class TyberiusSyndromeQuery.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        DNASequence pass = null;
        DNASequence fail = null;
        TyberiusSyndromeQuery instancePass = null;
        TyberiusSyndromeQuery instanceFail = null;

        try {
            pass = new DNASequence("gggtgggtggg");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(FromingensDischrypsiaQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fail = new DNASequence("ggggg");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(FromingensDischrypsiaQueryTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        instancePass = new TyberiusSyndromeQuery(pass);
        instanceFail = new TyberiusSyndromeQuery(fail);

        assertEquals("positive", instancePass.getResult());
        assertEquals("negative", instanceFail.getResult());
    }

    /**
     * Test of getName method, of class TyberiusSyndromeQuery.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TyberiusSyndromeQuery instance =
                new TyberiusSyndromeQuery(new DNASequence());
        String expResult = "Risk for Tyberius Syndrome";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class TyberiusSyndromeQuery.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        TyberiusSyndromeQuery instance =
                new TyberiusSyndromeQuery(new DNASequence());
        String expResult = "diseases";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }
}