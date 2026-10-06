package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SobremesaTiramisuTest {

    private Sobremesa sobremesa;

    @BeforeEach
    void setUp() {
        sobremesa = new SobremesaTiramisu();
    }

    @Test
    void deveRetornarDescricaoTiramisu() {
        assertEquals("Tiramisu", sobremesa.getDescricao());
    }

    @Test
    void deveRetornarPreco15() {
        assertEquals(15.00, sobremesa.getPreco(), 0.001);
    }
}
