package org.example;

public class PedidoDelivery extends Pedido {
    public PedidoDelivery(Pagamento pagamento) {
        super(pagamento);
    }

    public double calcularTotal(double valorItens) {
        double subtotal = valorItens + ParametrosPizzaria.getInstance().getTaxaEntrega();

        return subtotal + subtotal * pagamento.getTaxa();
    }
}
