package br.fastfood.model;

public class Burger implements ItemCombo {
    private final String nome;
    private final double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Burger cheddarBacon() {
        return new Burger("Bacon com Cheddar", 22.90);
    }

    public static Burger veganSupreme() {
        return new Burger("X Salada Vegano", 20.00);
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
