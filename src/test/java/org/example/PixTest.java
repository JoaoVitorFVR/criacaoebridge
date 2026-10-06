package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PixTest {

    @Test
    void deveRetornarTaxaZero() {
        assertEquals(0.00, new Pix().getTaxa(), 0.0001);
    }
}
