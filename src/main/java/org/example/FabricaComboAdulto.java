package org.example;

public class FabricaComboAdulto implements FabricaAbstrata {
    public Bebida criarBebida() {
        return new BebidaCerveja();
    }

    public Sobremesa criarSobremesa() {
        return new SobremesaTiramisu();
    }
}
