/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20161bsi0527
 */
public class LojaTest {
    
    public LojaTest() {
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
     * Test of Webscrap method, of class Loja.
     */
    @Test
    public void testWebscrap() {
        System.out.println("Webscrap");
        Loja instance = new Loja();
        String expResult = "";
        String result = instance.Webscrap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeLoja method, of class Loja.
     */
    @Test
    public void testGetNomeLoja() {
        System.out.println("getNomeLoja");
        Loja instance = new Loja();
        String expResult = "";
        String result = instance.getNomeLoja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeLoja method, of class Loja.
     */
    @Test
    public void testSetNomeLoja() {
        System.out.println("setNomeLoja");
        String nomeLoja = "";
        Loja instance = new Loja();
        instance.setNomeLoja(nomeLoja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrl method, of class Loja.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        Loja instance = new Loja();
        String expResult = "";
        String result = instance.getUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUrl method, of class Loja.
     */
    @Test
    public void testSetUrl() {
        System.out.println("setUrl");
        String url = "";
        Loja instance = new Loja();
        instance.setUrl(url);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstcartaloja method, of class Loja.
     */
    @Test
    public void testGetLstcartaloja() {
        System.out.println("getLstcartaloja");
        Loja instance = new Loja();
        List<CartaLoja> expResult = null;
        List<CartaLoja> result = instance.getLstcartaloja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstcartaloja method, of class Loja.
     */
    @Test
    public void testSetLstcartaloja() {
        System.out.println("setLstcartaloja");
        List<CartaLoja> lstcartaloja = null;
        Loja instance = new Loja();
        instance.setLstcartaloja(lstcartaloja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Loja.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Loja instance = new Loja();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Loja.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Loja instance = new Loja();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pingLoja method, of class Loja.
     */
    @Test
    public void testPingLoja() {
        System.out.println("pingLoja");
        Loja instance = new Loja();
        Boolean expResult = null;
        Boolean result = instance.pingLoja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
