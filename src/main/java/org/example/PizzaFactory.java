package org.example;

public class PizzaFactory {
    public static IPizza obterPizza(String pizza) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Pizza" + pizza);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Pizza inexistente");
        }
        if (!(objeto instanceof IPizza)) {
            throw new IllegalArgumentException("Pizza inválida");
        }
        return (IPizza) objeto;
    }
}
