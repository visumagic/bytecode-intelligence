/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcintell.analyzer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raghu
 */
public class PackageAnalyzerTest {

    public PackageAnalyzerTest() {
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
     * Test of main method, of class PackageAnalyzer.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;

        String jarFile1 = "../project-inception/target/project-inception-0.1.jar";
        try {
            String cool = PackageAnalyzer.packageAnalyzer(jarFile1);
        } catch (Exception e) {

        }
       
    }

}
