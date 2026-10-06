package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SobremesaSorveteTest {

    private Sobremesa sobremesa;

    @BeforeEach
    void setUp() {
        sobremesa = new SobremesaSorvete();
    }

    @Test
    void deveRetornarDescricaoSorvete() {
        assertEquals("Sorvete", sobremesa.getDescricao());
    }

    @Test
    void deveRetornarPreco8() {
        assertEquals(8.00, sobremesa.getPreco(), 0.001);
    }
}
