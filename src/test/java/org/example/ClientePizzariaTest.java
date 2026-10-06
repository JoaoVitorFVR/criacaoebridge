package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientePizzariaTest {

    private static final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        ParametrosPizzaria parametros = ParametrosPizzaria.getInstance();
        parametros.setTaxaServico(0.10);
        parametros.setTaxaEntrega(5.00);
    }


    @Test
    void deveMontarResumoCalabresaComComboAdulto() {
        FabricaComboAdulto comboAdulto = new FabricaComboAdulto();
        ClientePizzaria cliente = new ClientePizzaria("Calabresa", comboAdulto);
        assertEquals("Calabresa, Cerveja e Tiramisu", cliente.obterResumo());
    }

    @Test
    void deveMontarResumoMargueritaComComboAdulto() {
        FabricaComboAdulto comboAdulto = new FabricaComboAdulto();
        ClientePizzaria cliente = new ClientePizzaria("Marguerita", comboAdulto);
        assertEquals("Marguerita, Cerveja e Tiramisu", cliente.obterResumo());
    }

    @Test
    void deveMontarResumoCalabresaComComboInfantil() {
        FabricaComboInfantil comboInfantil = new FabricaComboInfantil();
        ClientePizzaria cliente = new ClientePizzaria("Calabresa", comboInfantil);
        assertEquals("Calabresa, Suco de laranja e Sorvete", cliente.obterResumo());
    }

    @Test
    void deveMontarResumoMargueritaComComboInfantil() {
        FabricaComboInfantil comboInfantil = new FabricaComboInfantil();
        ClientePizzaria cliente = new ClientePizzaria("Marguerita", comboInfantil);
        assertEquals("Marguerita, Suco de laranja e Sorvete", cliente.obterResumo());
    }


    @Test
    void deveSomarItensDeCalabresaComComboAdulto() {
        FabricaComboAdulto comboAdulto = new FabricaComboAdulto();
        ClientePizzaria cliente = new ClientePizzaria("Calabresa", comboAdulto);
        assertEquals(67.00, cliente.obterValorItens(), DELTA); // 40 + 12 + 15
    }

    @Test
    void deveSomarItensDeMargueritaComComboAdulto() {
        FabricaComboAdulto comboAdulto = new FabricaComboAdulto();
        ClientePizzaria cliente = new ClientePizzaria("Marguerita", comboAdulto);
        assertEquals(62.00, cliente.obterValorItens(), DELTA); // 35 + 12 + 15
    }

    @Test
    void deveSomarItensDeCalabresaComComboInfantil() {
        FabricaComboInfantil comboInfantil = new FabricaComboInfantil();
        ClientePizzaria cliente = new ClientePizzaria("Calabresa", comboInfantil);
        assertEquals(54.00, cliente.obterValorItens(), DELTA); // 40 + 6 + 8
    }

    @Test
    void deveSomarItensDeMargueritaComComboInfantil() {
        FabricaComboInfantil comboInfantil = new FabricaComboInfantil();
        ClientePizzaria cliente = new ClientePizzaria("Marguerita", comboInfantil);
        assertEquals(49.00, cliente.obterValorItens(), DELTA); // 35 + 6 + 8
    }

    @Test
    void deveFecharPedidoDeBalcaoComPix() {
        FabricaComboAdulto comboAdulto = new FabricaComboAdulto();
        ClientePizzaria cliente = new ClientePizzaria("Calabresa", comboAdulto);
        assertEquals(73.70, cliente.fecharPedido(new PedidoBalcao(new Pix())), DELTA);
    }

    @Test
    void deveFecharPedidoDeBalcaoComCartao() {
        FabricaComboAdulto comboAdulto = new FabricaComboAdulto();
        ClientePizzaria cliente = new ClientePizzaria("Calabresa", comboAdulto);
        assertEquals(77.385, cliente.fecharPedido(new PedidoBalcao(new Cartao())), DELTA);
    }

    @Test
    void deveFecharPedidoDeDeliveryComPix() {
        FabricaComboInfantil comboInfantil = new FabricaComboInfantil();
        ClientePizzaria cliente = new ClientePizzaria("Marguerita", comboInfantil);
        assertEquals(54.00, cliente.fecharPedido(new PedidoDelivery(new Pix())), DELTA);
    }

    @Test
    void deveFecharPedidoDeDeliveryComVoucher() {
        FabricaComboAdulto comboAdulto = new FabricaComboAdulto();
        ClientePizzaria cliente = new ClientePizzaria("Calabresa", comboAdulto);
        assertEquals(77.76, cliente.fecharPedido(new PedidoDelivery(new Voucher())), DELTA);
    }
}
