package org.flondono.junitbasic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ExampleTest {

    private Example exampleTest;

    @BeforeEach
    void init() {
        this.exampleTest = new Example();
    }

    @Test
    void testSumar() {

        // Given - Teniendo
        int a = 3;
        int b = 5;

        // When - Cuándo
        int result = exampleTest.sumar(a, b);

        // Then - Entonces
        assertEquals(8, result);
        assertNotNull(exampleTest);
        assertInstanceOf(Integer.class, result);

        // assertEquals()
        // assertTrue() siempre espera verdadero
        // assertFalse()  siempre espera falso
        // assertNotNull() espera que no sea null
        // assertInstanceOf(Integer.class,result) una instancia de..
        // assertThrows() validar excepciones
    }

    @Test
    void testCheckPositivo() {
        //Given
        int a = 4;

        //When
        boolean result = exampleTest.checkPositivo(a);

        //Then
        assertTrue(result);
        //assertInstanceOf(Boolean.class, result);
    }

    @Test
    void testCheckNegativo() {
        //Given


        // When

        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            exampleTest.checkPositivo(-1);
        });
    }

    @Test
    void testContarLetrasA() {
        // Given
        String cadena = "juancho";

        // When
        int result = exampleTest.contarLetrasA(cadena);

        // Then
        assertEquals(1, result);

    }

    @Test
    void testConvertirListaAString() {
        //Given
        List<String> lista = new ArrayList<>();
        lista.add("juancho");
        lista.add("pedro");

        //When
        String cadena = exampleTest.convertirListaAString(lista);

        //Then
        assertEquals("JUANCHO,PEDRO", cadena);
    }
}
