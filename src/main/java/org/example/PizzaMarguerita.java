package org.example;

public class PizzaMarguerita implements IPizza {

    public String getNome() {
        return "Marguerita";
    }

    public double getPreco() {
        return 35.00;
    }

    public String preparar() {
        return "Pizza marguerita preparada";
    }
}
