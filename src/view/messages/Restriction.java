package view.messages;

public class Restriction {
    public String RestrictionLadder(int n){
        if (n < 0){
            return Message.ERROR.getMessage() + " Valor não pode ser inferior a 0";
        }
        return Message.SUCCESS.getMessage();
    }
}
