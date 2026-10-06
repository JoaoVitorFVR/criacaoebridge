package org.example;

public class ParametrosPizzaria {

    private ParametrosPizzaria() {};
    private static ParametrosPizzaria instance = new ParametrosPizzaria();
    public static ParametrosPizzaria getInstance() {
        return instance;
    }

    private String nomePizzaria;
    private double taxaServico;
    private double taxaEntrega;

    public String getNomePizzaria() {
        return nomePizzaria;
    }

    public void setNomePizzaria(String nomePizzaria) {
        this.nomePizzaria = nomePizzaria;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
}
