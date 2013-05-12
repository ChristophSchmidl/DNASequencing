/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.io;

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
public class FileReaderTest {
    
    public FileReaderTest() {
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
     * Test of readFile method, of class FileReader.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        String path = "test//org//geekfactor//dnasequencer//model//io//test.txt";
        String expResult = "test";
        String result = FileReader.readFile(path);
        assertEquals(expResult, result);
    }
}