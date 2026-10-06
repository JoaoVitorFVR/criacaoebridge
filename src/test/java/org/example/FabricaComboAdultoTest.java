package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FabricaComboAdultoTest {

    @Test
    void deveCriarBebidaCerveja() {
        FabricaAbstrata fabrica = new FabricaComboAdulto();
        assertEquals("Cerveja", fabrica.criarBebida().getDescricao());
    }

    @Test
    void deveCriarSobremesaTiramisu() {
        FabricaAbstrata fabrica = new FabricaComboAdulto();
        assertEquals("Tiramisu", fabrica.criarSobremesa().getDescricao());
    }
}
