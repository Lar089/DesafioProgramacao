package view.screen;

import model.LadderModel;
import view.interfaces.IMenu;
import view.messages.Message;

import java.util.Scanner;

public class LadderScreen implements IMenu {
    @Override
    public String ShowMenu() {
        Scanner read = new Scanner(System.in);
        int option;
        do {
            System.out.println("Neste tópico o usuário deve informar o tamanho da escada \n" +
                    "e como resposta recebe uma escada de tamanho n, que é \n" +
                    "formado pelo caracter '*'  " +
                    "\n\tOBS: Pressione a tecla zero(0) para sair desta operação\n");
            System.out.println("Informe o tamanho da Escada:");
            option = Integer.parseInt(read.nextLine());

            if(option > 0)
                return "" + option;

        } while (option != 0);
        return "" + option;
    }

    public void Result(LadderModel ladder){
        System.out.println(Message.RESULT.getMessage());
        for (int i = 0; i < ladder.getN(); i++){
            for (int j = 0; j < ladder.getN();j++){
                System.out.print(ladder.getResult()[i][j]);
            }
            System.out.print("\n");
        }
    }
}
