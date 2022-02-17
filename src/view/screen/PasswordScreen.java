package view.screen;

import model.PasswordModel;
import view.interfaces.IMenu;
import view.messages.Message;

import java.util.Scanner;

public class PasswordScreen  implements IMenu {

    @Override
    public String ShowMenu() {
        Scanner read = new Scanner(System.in,"UTF-8");
        String option;
        do {
            System.out.println("Neste tópico o usuário deve informar uma senha \n" +
                    "e como resposta recebe a quantidade de caracteres que falta \n" +
                    "para a senha ser forte. \n");
            System.out.println("Informe a senha:");
            option = read.nextLine();

            if(!option.equals(null))
                return option;

        } while (option.equals(null));
        return option;
    }

    public void Result(PasswordModel password){
        System.out.println(Message.RESULT.getMessage());
        System.out.println(password.getResult());
    }
}
