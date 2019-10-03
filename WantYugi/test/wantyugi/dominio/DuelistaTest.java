/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;

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
public class DuelistaTest {
    
    public DuelistaTest() {
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
     * Test of getEmail method, of class Duelista.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Duelista instance = new Duelista();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Duelista.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Duelista instance = new Duelista();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Duelista.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Duelista instance = new Duelista();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Duelista.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Duelista instance = new Duelista();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of favoritarCarta method, of class Duelista.
     */
    @Test
    public void testFavoritarCarta() {
        System.out.println("favoritarCarta");
        Carta carta = null;
        Duelista instance = new Duelista();
        instance.favoritarCarta(carta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
