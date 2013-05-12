/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model;

import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DNASequenceTest {
    
    public DNASequenceTest() {
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
     * Test of setSequenceString method, of class DNASequence.
     */
    @Test
    public void testSetSequenceString() throws Exception {
        System.out.println("setSequenceString");
        String sequencePass = "acgt";
        String sequenceFail = "hgfjf";
        DNASequence instancePass = new DNASequence();
        DNASequence instanceFail = new DNASequence();
        
        instancePass.setSequenceString(sequencePass);
        
        assertEquals(instancePass.getSequenceString(), sequencePass);
        
        try {
            instanceFail.setSequenceString(sequenceFail);
        } catch (InvalidDNASequenceException e){
            assertEquals(instanceFail.getSequenceString(), null);
        }
    }

    /**
     * Test of getAmountOfAdenine method, of class DNASequence.
     */
    @Test
    public void testGetAmountOfAdenine() {
        System.out.println("getAmountOfAdenine");
        DNASequence instance = null;
        try {
            instance = new DNASequence("agctaa");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(DNASequenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 3;
        int result = instance.getAmountOfAdenine();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountOfGuanine method, of class DNASequence.
     */
    @Test
    public void testGetAmountOfGuanine() {
        System.out.println("getAmountOfGuanine");
        DNASequence instance = null;
        try {
            instance = new DNASequence("agctaa");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(DNASequenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 1;
        int result = instance.getAmountOfGuanine();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountOfCytosine method, of class DNASequence.
     */
    @Test
    public void testGetAmountOfCytosine() {
        System.out.println("getAmountOfCytosine");
        DNASequence instance = null;
        try {
            instance = new DNASequence("agctaa");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(DNASequenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 1;
        int result = instance.getAmountOfCytosine();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountOfThymine method, of class DNASequence.
     */
    @Test
    public void testGetAmountOfThymine() {
        System.out.println("getAmountOfThymine");
        DNASequence instance = null;
        try {
            instance = new DNASequence("agctaa");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(DNASequenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 1;
        int result = instance.getAmountOfThymine();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSequenceString method, of class DNASequence.
     */
    @Test
    public void testGetSequenceString() {
        System.out.println("getSequenceString");
        DNASequence instance = null;
        try {
            instance = new DNASequence("agctaa");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(DNASequenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String expResult = "agctaa";
        String result = instance.getSequenceString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountOfPurines method, of class DNASequence.
     */
    @Test
    public void testGetAmountOfPurines() {
        System.out.println("getAmountOfPurines");
        DNASequence instance = null;
        try {
            instance = new DNASequence("agctaa");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(DNASequenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 4;
        int result = instance.getAmountOfPurines();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountOfPyrimidines method, of class DNASequence.
     */
    @Test
    public void testGetAmountOfPyrimidines() {
        System.out.println("getAmountOfPyrimidines");
        DNASequence instance = null;
        try {
            instance = new DNASequence("agctaa");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(DNASequenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 2;
        int result = instance.getAmountOfPyrimidines();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSequenceLength method, of class DNASequence.
     */
    @Test
    public void testGetSequenceLength() {
        System.out.println("getSequenceLength");
        DNASequence instance = null;
        try {
            instance = new DNASequence("agctaa");
        } catch (InvalidDNASequenceException ex) {
            Logger.getLogger(DNASequenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 6;
        int result = instance.getSequenceLength();
        assertEquals(expResult, result);
    }
}