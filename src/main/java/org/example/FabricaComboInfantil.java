package org.example;

public class FabricaComboInfantil implements FabricaAbstrata {
    public Bebida criarBebida() {
        return new BebidaSuco();
    }

    public Sobremesa criarSobremesa() {
        return new SobremesaSorvete();
    }
}
