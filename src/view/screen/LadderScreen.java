package view.screen;

import view.interfaces.IMenu;

import java.util.Scanner;

public class LadderScreen implements IMenu {
    @Override
    public String ShowMenu() {
        Scanner read = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("\tBem vindo, vamos calcular o tamanho da escada de *!\n" +
                    "Neste tópico o usuário deve informar o tamanho da escada \n" +
                    "e recebe como resposta uma escada de tamanho n, que é \n" +
                    "formado pelo caracter '*'  " +
                    "\n\tOBS: Pressione zero(0) para sair desta operação\n");

            System.out.println("Informe o tamanho da Escada:");
            option = Integer.parseInt(read.nextLine());
        } while (option != 0);

        return "" + option;
    }
}
