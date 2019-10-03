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
public class CartaLojaTest {
    
    public CartaLojaTest() {
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
     * Test of getValor method, of class CartaLoja.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        CartaLoja instance = new CartaLoja();
        float expResult = 0.0F;
        float result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class CartaLoja.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        float valor = 0.0F;
        CartaLoja instance = new CartaLoja();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataEntrada method, of class CartaLoja.
     */
    @Test
    public void testGetDataEntrada() {
        System.out.println("getDataEntrada");
        CartaLoja instance = new CartaLoja();
        String expResult = "";
        String result = instance.getDataEntrada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataEntrada method, of class CartaLoja.
     */
    @Test
    public void testSetDataEntrada() {
        System.out.println("setDataEntrada");
        String dataEntrada = "";
        CartaLoja instance = new CartaLoja();
        instance.setDataEntrada(dataEntrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarta method, of class CartaLoja.
     */
    @Test
    public void testGetCarta() {
        System.out.println("getCarta");
        CartaLoja instance = new CartaLoja();
        Carta expResult = null;
        Carta result = instance.getCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarta method, of class CartaLoja.
     */
    @Test
    public void testSetCarta() {
        System.out.println("setCarta");
        Carta carta = null;
        CartaLoja instance = new CartaLoja();
        instance.setCarta(carta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularValorMaximo method, of class CartaLoja.
     */
    @Test
    public void testCalcularValorMaximo() {
        System.out.println("calcularValorMaximo");
        CartaLoja instance = new CartaLoja();
        float expResult = 0.0F;
        float result = instance.calcularValorMaximo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularValorMedio method, of class CartaLoja.
     */
    @Test
    public void testCalcularValorMedio() {
        System.out.println("calcularValorMedio");
        CartaLoja instance = new CartaLoja();
        float expResult = 0.0F;
        float result = instance.calcularValorMedio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
