/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package vista;

import java.util.ArrayList;
import modelo.Jugador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lazaro
 */
public class ConsolaTest {
    
    public ConsolaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of pideString method, of class Consola.
     */
    @Test
    public void testPideString() {
        System.out.println("pideString");
        String mensaje = "";
        Consola instance = new Consola();
        String expResult = "";
        String result = instance.pideString(mensaje);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pideInt method, of class Consola.
     */
    @Test
    public void testPideInt() {
        System.out.println("pideInt");
        String mensaje = "";
        Consola instance = new Consola();
        int expResult = 0;
        int result = instance.pideInt(mensaje);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class Consola.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        String mensaje = "";
        Consola instance = new Consola();
        instance.mostrar(mensaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarResultados method, of class Consola.
     */
    @Test
    public void testMostrarResultados() {
        System.out.println("mostrarResultados");
        ArrayList<Jugador> lista = null;
        String palabra = "";
        Consola instance = new Consola();
        instance.mostrarResultados(lista, palabra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
