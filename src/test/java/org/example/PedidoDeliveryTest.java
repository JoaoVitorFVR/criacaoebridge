package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoDeliveryTest {

    private static final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        ParametrosPizzaria parametros = ParametrosPizzaria.getInstance();
        parametros.setTaxaServico(0.10);
        parametros.setTaxaEntrega(8.00);
    }

    @Test
    void deveCalcularTotalComPixSomenteComTaxaDeEntrega() {
        Pedido pedido = new PedidoDelivery(new Pix());
        assertEquals(108.00, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveCalcularTotalComCartaoAplicandoTaxaSobreSubtotal() {
        Pedido pedido = new PedidoDelivery(new Cartao());
        assertEquals(113.40, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveCalcularTotalComVoucherAplicandoTaxaSobreSubtotal() {
        Pedido pedido = new PedidoDelivery(new Voucher());
        assertEquals(116.64, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveRetornarValorDosItensQuandoTaxaDeEntregaEhZeroEPagamentoEhPix() {
        ParametrosPizzaria.getInstance().setTaxaEntrega(0.0);
        Pedido pedido = new PedidoDelivery(new Pix());
        assertEquals(100.00, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveCobrarTaxaDeEntregaMesmoQuandoValorDosItensEhZero() {
        Pedido pedido = new PedidoDelivery(new Pix());
        assertEquals(8.00, pedido.calcularTotal(0.00), DELTA);
    }

    @Test
    void deveIgnorarTaxaDeServicoNoPedidoDelivery() {
        ParametrosPizzaria.getInstance().setTaxaServico(0.50);
        Pedido pedido = new PedidoDelivery(new Pix());
        assertEquals(108.00, pedido.calcularTotal(100.00), DELTA);
    }
}
