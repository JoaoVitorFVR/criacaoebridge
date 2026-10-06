package org.example;

public class PizzaCalabresa implements IPizza {

    public String getNome() {
        return "Calabresa";
    }

    public double getPreco() {
        return 40.00;
    }

    public String preparar() {
        return "Pizza de calabresa preparada";
    }
}
