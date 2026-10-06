package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PizzaFactoryTest {

    @Test
    void deveCriarPizzaCalabresa() {
        assertEquals("Calabresa", PizzaFactory.obterPizza("Calabresa").getNome());
    }

    @Test
    void deveCriarPizzaMarguerita() {
        assertEquals("Marguerita", PizzaFactory.obterPizza("Marguerita").getNome());
    }

    @Test
    void deveLancarExcecaoParaSaborInexistente() {
        assertThrows(IllegalArgumentException.class, () -> PizzaFactory.obterPizza("Havaiana"));
    }

    @Test
    void deveLancarExcecaoParaSaborComLetraMinuscula() {
        assertThrows(IllegalArgumentException.class, () -> PizzaFactory.obterPizza("calabresa"));
    }

    @Test
    void deveLancarExcecaoParaSaborVazio() {
        assertThrows(IllegalArgumentException.class, () -> PizzaFactory.obterPizza(""));
    }

    @Test
    void deveLancarExcecaoParaSaborNulo() {
        assertThrows(IllegalArgumentException.class, () -> PizzaFactory.obterPizza(null));
    }

    @Test
    void deveLancarExcecaoParaClasseQueNaoEhPizza() {
        // "org.example.PizzaFactory" existe, mas nao implementa IPizza
        assertThrows(IllegalArgumentException.class, () -> PizzaFactory.obterPizza("Factory"));
    }
}
