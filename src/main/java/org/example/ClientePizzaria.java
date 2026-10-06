package org.example;

public class ClientePizzaria {
    private IPizza pizza;
    private Bebida bebida;
    private Sobremesa sobremesa;

    public ClientePizzaria(String sabor, FabricaAbstrata combo) {
        this.pizza = PizzaFactory.obterPizza(sabor);
        this.bebida = combo.criarBebida();
        this.sobremesa = combo.criarSobremesa();
    }

    public String obterResumo() {
        return this.pizza.getNome() + ", " + this.bebida.getDescricao()
                + " e " + this.sobremesa.getDescricao();
    }

    public double obterValorItens() {
        return this.pizza.getPreco() + this.bebida.getPreco() + this.sobremesa.getPreco();
    }

    public double fecharPedido(Pedido pedido) {
        return pedido.calcularTotal(obterValorItens());
    }
}
