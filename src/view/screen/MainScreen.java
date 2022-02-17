package view.screen;

import controller.LadderController;
import controller.PasswordController;
import view.interfaces.IMenu;
import view.messages.Message;

import java.util.Scanner;

public class MainScreen implements IMenu {
    LadderScreen screenLadder = new LadderScreen();
    LadderController controllerLadder;

    PasswordScreen screenPassword = new PasswordScreen();
    PasswordController controllerPassword;

    public MainScreen() {
        super();
        System.out.println(ShowMenu());
    }

    @Override
    public String ShowMenu() {
        Scanner read = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("\n\t Bem Vindo! \n" +
                    "Selecione uma opção a abaixo \n");

            System.out.println("1 - Calcular tamanho da escada de *");
            System.out.println("2 - Verificar senha");
            System.out.println("3 - Calcular anagramas de uma palavra");
            System.out.println("0 - Sair");

            option = Integer.parseInt(read.nextLine());
            OptionMenu(option);
        } while (option != 0);
        return Message.BYE.getMessage();

    }

    private void OptionMenu(int value) {
        if (value == 1) {
            String input = screenLadder.ShowMenu();
            controllerLadder = new LadderController(input);
        }
        if (value == 2) {
            String input = screenPassword.ShowMenu();
            controllerPassword = new PasswordController(input);
        }
        if (value == 3) {
        }
        if (value > 3 || value < 0) {
            System.out.println(Message.ERROR.getMessage() + " " + Message.TRY_AGAIN.getMessage());
        }
    }
}
