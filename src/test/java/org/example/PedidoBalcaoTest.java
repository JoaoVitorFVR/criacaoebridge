package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoBalcaoTest {

    private static final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        ParametrosPizzaria parametros = ParametrosPizzaria.getInstance();
        parametros.setTaxaServico(0.10);
        parametros.setTaxaEntrega(5.00);
    }

    @Test
    void deveCalcularTotalComPixSomenteComTaxaDeServico() {
        Pedido pedido = new PedidoBalcao(new Pix());
        assertEquals(110.00, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveCalcularTotalComCartaoAplicandoTaxaSobreSubtotal() {
        Pedido pedido = new PedidoBalcao(new Cartao());
        assertEquals(115.50, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveCalcularTotalComVoucherAplicandoTaxaSobreSubtotal() {
        Pedido pedido = new PedidoBalcao(new Voucher());
        assertEquals(118.80, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveRetornarValorDosItensQuandoTaxaDeServicoEhZeroEPagamentoEhPix() {
        ParametrosPizzaria.getInstance().setTaxaServico(0.0);
        Pedido pedido = new PedidoBalcao(new Pix());
        assertEquals(100.00, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveAplicarSomenteTaxaDoPagamentoQuandoTaxaDeServicoEhZero() {
        ParametrosPizzaria.getInstance().setTaxaServico(0.0);
        Pedido pedido = new PedidoBalcao(new Cartao());
        assertEquals(105.00, pedido.calcularTotal(100.00), DELTA);
    }

    @Test
    void deveRetornarZeroQuandoValorDosItensEhZero() {
        Pedido pedido = new PedidoBalcao(new Cartao());
        assertEquals(0.00, pedido.calcularTotal(0.00), DELTA);
    }

    @Test
    void deveIgnorarTaxaDeEntregaNoPedidoDeBalcao() {
        ParametrosPizzaria.getInstance().setTaxaEntrega(50.00);
        Pedido pedido = new PedidoBalcao(new Pix());
        assertEquals(110.00, pedido.calcularTotal(100.00), DELTA);
    }
}
