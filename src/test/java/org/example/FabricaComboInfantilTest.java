package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FabricaComboInfantilTest {


    @Test
    void deveCriarBebidaSuco() {
        FabricaAbstrata fabrica = new FabricaComboInfantil();
        assertEquals("Suco de laranja", fabrica.criarBebida().getDescricao());
    }

    @Test
    void deveCriarSobremesaSorvete() {
        FabricaAbstrata fabrica = new FabricaComboInfantil();
        assertEquals("Sorvete", fabrica.criarSobremesa().getDescricao());
    }
}
