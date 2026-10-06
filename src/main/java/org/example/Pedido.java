package org.example;

public abstract class Pedido {

    protected Pagamento pagamento;

    public Pedido(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public abstract double calcularTotal(double valorItens);
}
