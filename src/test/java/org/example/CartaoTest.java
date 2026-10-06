package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CartaoTest {

    @Test
    void deveRetornarTaxaDeCincoPorCento() {
        assertEquals(0.05, new Cartao().getTaxa(), 0.0001);
    }
}
