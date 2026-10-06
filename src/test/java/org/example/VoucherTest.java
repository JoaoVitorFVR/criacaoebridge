package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VoucherTest {

    @Test
    void deveRetornarTaxaDeOitoPorCento() {
        assertEquals(0.08, new Voucher().getTaxa(), 0.0001);
    }
}
