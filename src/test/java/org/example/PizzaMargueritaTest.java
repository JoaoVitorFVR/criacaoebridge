package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaMargueritaTest {

    private IPizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new PizzaMarguerita();
    }

    @Test
    void deveRetornarNomeMarguerita() {
        assertEquals("Marguerita", pizza.getNome());
    }

    @Test
    void deveRetornarPreco35() {
        assertEquals(35.00, pizza.getPreco(), 0.001);
    }

    @Test
    void deveRetornarMensagemDePreparo() {
        assertEquals("Pizza marguerita preparada", pizza.preparar());
    }
}
