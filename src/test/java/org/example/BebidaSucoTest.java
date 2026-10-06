package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BebidaSucoTest {

    @Test
    void deveRetornarDescricaoSucoDeLaranja() {
        Bebida bebida = new BebidaSuco();
        assertEquals("Suco de laranja", bebida.getDescricao());
    }

    @Test
    void deveRetornarPreco6() {
        Bebida bebida = new BebidaSuco();
        assertEquals(6.00, bebida.getPreco(), 0.001);
    }
}
