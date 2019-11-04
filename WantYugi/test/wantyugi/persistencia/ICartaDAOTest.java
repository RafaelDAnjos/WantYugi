/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.persistencia;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import wantyugi.dominio.Carta;

/**
 *
 * @author 20161BSI0527
 */
public class ICartaDAOTest {
    
    public ICartaDAOTest() {
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
     * Test of buscaCartaApartirDoNome method, of class ICartaDAO.
     */
    @Test
    public void testBuscaCartaApartirDoNome() {
        System.out.println("buscaCartaApartirDoNome");
        Carta carta = null;
        ICartaDAO instance = (ICartaDAO) new ICartaDAO();
        List<Carta> expResult = null;
        List<Carta> result = instance.buscaCartaApartirDoNome(carta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICartaDAO {

        public List<Carta> buscaCartaApartirDoNome(Carta carta) {
            return null;
        }


    }
    
}
