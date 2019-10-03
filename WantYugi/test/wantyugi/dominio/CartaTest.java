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
public class CartaTest {
    
    public CartaTest() {
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
     * Test of getNome method, of class Carta.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Carta instance = new Carta();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Carta.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Carta instance = new Carta();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificador method, of class Carta.
     */
    @Test
    public void testGetIdentificador() {
        System.out.println("getIdentificador");
        Carta instance = new Carta();
        String expResult = "";
        String result = instance.getIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificador method, of class Carta.
     */
    @Test
    public void testSetIdentificador() {
        System.out.println("setIdentificador");
        String identificador = "";
        Carta instance = new Carta();
        instance.setIdentificador(identificador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularValorMinimo method, of class Carta.
     */
    @Test
    public void testCalcularValorMinimo() {
        System.out.println("calcularValorMinimo");
        Carta instance = new Carta();
        float expResult = 0.0F;
        float result = instance.calcularValorMinimo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaridade method, of class Carta.
     */
    @Test
    public void testGetRaridade() {
        System.out.println("getRaridade");
        Carta instance = new Carta();
        String expResult = "";
        String result = instance.getRaridade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRaridade method, of class Carta.
     */
    @Test
    public void testSetRaridade() {
        System.out.println("setRaridade");
        String raridade = "";
        Carta instance = new Carta();
        instance.setRaridade(raridade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesc method, of class Carta.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Carta instance = new Carta();
        String expResult = "";
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesc method, of class Carta.
     */
    @Test
    public void testSetDesc() {
        System.out.println("setDesc");
        String desc = "";
        Carta instance = new Carta();
        instance.setDesc(desc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCondicao method, of class Carta.
     */
    @Test
    public void testGetCondicao() {
        System.out.println("getCondicao");
        Carta instance = new Carta();
        String expResult = "";
        String result = instance.getCondicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCondicao method, of class Carta.
     */
    @Test
    public void testSetCondicao() {
        System.out.println("setCondicao");
        String condicao = "";
        Carta instance = new Carta();
        instance.setCondicao(condicao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCartaLoja method, of class Carta.
     */
    @Test
    public void testGetListaCartaLoja() {
        System.out.println("getListaCartaLoja");
        Carta instance = new Carta();
        List<CartaLoja> expResult = null;
        List<CartaLoja> result = instance.getListaCartaLoja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaCartaLoja method, of class Carta.
     */
    @Test
    public void testSetListaCartaLoja() {
        System.out.println("setListaCartaLoja");
        List<CartaLoja> listaCartaLoja = null;
        Carta instance = new Carta();
        instance.setListaCartaLoja(listaCartaLoja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
