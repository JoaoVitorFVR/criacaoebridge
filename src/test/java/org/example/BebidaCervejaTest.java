package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BebidaCervejaTest {

    @Test
    void deveRetornarDescricaoCerveja() {
        Bebida bebida = new BebidaCerveja();
        assertEquals("Cerveja", bebida.getDescricao());
    }

    @Test
    void deveRetornarPreco12() {
        Bebida bebida = new BebidaCerveja();
        assertEquals(12.00, bebida.getPreco(), 0.001);
    }
}
