package controller;

import controller.service.PasswordService;
import model.PasswordModel;
import view.screen.PasswordScreen;


public class PasswordController {
    PasswordService service = new PasswordService();
    PasswordScreen screen = new PasswordScreen();
    PasswordModel password;

    public PasswordController(String word){
        password = new PasswordModel(word);

        int length = service.PasswordLength(word);
        int result = 0;

        for (int i = 0;i < length; i++){
            char charA = word.charAt(i);
            result += service.RestrictionPassword(charA);
        }

        password.setResult(service.Result(result, length));
        screen.Result(password);
    }

}
