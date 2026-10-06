package org.example;

public class PedidoBalcao extends Pedido {
    public PedidoBalcao(Pagamento pagamento) {
        super(pagamento);
    }

    public double calcularTotal(double valorItens) {
        double servico = valorItens * ParametrosPizzaria.getInstance().getTaxaServico();
        double subtotal = valorItens + servico;

        return subtotal + subtotal * pagamento.getTaxa();
    }
}
