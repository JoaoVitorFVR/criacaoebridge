package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaCalabresaTest {

    @Test
    void deveRetornarNomeCalabresa() {
        IPizza pizza = new PizzaCalabresa();
        assertEquals("Calabresa", pizza.getNome());
    }

    @Test
    void deveRetornarPreco40() {
        IPizza pizza = new PizzaCalabresa();
        assertEquals(40.00, pizza.getPreco(), 0.001);
    }

    @Test
    void deveRetornarMensagemDePreparo() {
        IPizza pizza = new PizzaCalabresa();
        assertEquals("Pizza de calabresa preparada", pizza.preparar());
    }
}
