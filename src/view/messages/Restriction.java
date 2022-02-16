package view.messages;

public class Restriction {
    public Message RestrictionLadder(int n){
        if (n < 0){
            System.out.println(Message.ERROR.getMessage() + " Valor não pode ser inferior a 0");
            return Message.ERROR;
        }
        return Message.SUCCESS;
    }
}
