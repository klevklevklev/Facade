package br.fastfood.model;

public class Bebida implements ItemCombo {
    private final String nome;
    private final double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Bebida pepsi() {
        return new Bebida("Pepsi", 8.00);
    }

    public static Bebida aguaMineral() {
        return new Bebida("Água Mineral", 5.50);
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
