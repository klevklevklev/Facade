package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Sobremesa brownie() {
        return new Sobremesa("Bolo de Pote", 10.00);
    }

    public static Sobremesa acai() {
        return new Sobremesa("Açaí", 12.00);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
