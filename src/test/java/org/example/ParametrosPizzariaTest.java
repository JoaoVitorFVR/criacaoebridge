package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Modifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParametrosPizzariaTest {

    private ParametrosPizzaria parametros;

    @BeforeEach
    void setUp() {
        parametros = ParametrosPizzaria.getInstance();
        parametros.setNomePizzaria("Pizzaria Teste");
        parametros.setTaxaServico(0.10);
        parametros.setTaxaEntrega(5.00);
    }

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(ParametrosPizzaria.getInstance(), ParametrosPizzaria.getInstance());
    }

    @Test
    void deveTerConstrutorPrivado() throws NoSuchMethodException {
        int modificadores = ParametrosPizzaria.class.getDeclaredConstructor().getModifiers();
        assertTrue(Modifier.isPrivate(modificadores));
    }

    @Test
    void devePersistirNomeDaPizzaria() {
        parametros.setNomePizzaria("Pizza do Zé");
        assertEquals("Pizza do Zé", parametros.getNomePizzaria());
    }

    @Test
    void devePersistirTaxaDeServico() {
        parametros.setTaxaServico(0.15);
        assertEquals(0.15, parametros.getTaxaServico(), 0.0001);
    }

    @Test
    void devePersistirTaxaDeEntrega() {
        parametros.setTaxaEntrega(9.90);
        assertEquals(9.90, parametros.getTaxaEntrega(), 0.0001);
    }

    @Test
    void deveCompartilharValoresEntreReferenciasDaInstancia() {
        parametros.setTaxaEntrega(7.50);
        assertEquals(7.50, ParametrosPizzaria.getInstance().getTaxaEntrega(), 0.0001);
    }
}
