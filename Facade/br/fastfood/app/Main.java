package br.fastfood.app;

import br.fastfood.facade.ComboFacade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ComboFacade facade = new ComboFacade();

        System.out.println("=== Menu de Combos ===");
        System.out.println("1 - Combo Bacon Cheddar");
        System.out.println("2 - Combo Vegano");
        System.out.print("Sua escolha: ");
        int escolha = in.nextInt();

        facade.criarCombo(escolha);
        facade.exibirItens();
        System.out.printf("Total a pagar: R$ %.2f", facade.getPrecoTotal());
    }
}
