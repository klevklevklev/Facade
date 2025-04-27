package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                combo = new Combo(
                    Burger.cheddarBacon(),
                    Bebida.pepsi(),
                    Sobremesa.brownie()
                );
                break;
            case 2:
                combo = new Combo(
                    Burger.veganSupreme(),
                    Bebida.aguaMineral(),
                    Sobremesa.acai()
                );
                break;
            default:
                System.out.println("Combo inválido! Escolhendo Combo 1 como padrão.");
                combo = new Combo(
                    Burger.cheddarBacon(),
                    Bebida.pepsi(),
                    Sobremesa.brownie()
                );
        }
    }

    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda.");
            return;
        }
        System.out.println("Itens do Combo:");
        System.out.println("- " + combo.getBurger().getNome() + " - R$ " + combo.getBurger().getPreco());
        System.out.println("- " + combo.getBebida().getNome() + " - R$ " + combo.getBebida().getPreco());
        System.out.println("- " + combo.getSobremesa().getNome() + " - R$ " + combo.getSobremesa().getPreco());
    }

    public double getPrecoTotal() {
        if (combo == null) return 0;
        return combo.getPrecoTotal();
    }
}
