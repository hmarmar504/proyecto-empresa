/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyecto_empresa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author marti
 */
public class ProductoTest {
    
    public ProductoTest() {
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

    @Test
    public void testCalcularPrecioConDescuento() {
        Producto producto = new Producto("Miniatura Goblin", 20.0, 10, "Miniaturas");
        double resultado = producto.calcularPrecioConDescuento(25);  // 25% de descuento
        assertEquals(15.0, resultado, 0.01); // Esperamos 15.0 con margen de 0.01
    }
    
}
