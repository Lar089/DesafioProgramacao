package view.messages;

import model.PasswordModel;

import static java.lang.Character.isLetterOrDigit;

public class Restriction {
    public Message RestrictionLadder(int n){
        if (n < 0){
            System.out.println(Message.ERROR.getMessage() + " Valor não pode ser inferior a 0");
            return Message.ERROR;
        }
        return Message.SUCCESS;
    }

}
