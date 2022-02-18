package view.messages;

import static java.lang.Character.isLetterOrDigit;

public class Restriction {
    public Message RestrictionLadder(int n){
        if (n < 0){
            System.out.println(Message.ERROR.getMessage() + " Valor não pode ser inferior a 0");
            return Message.ERROR;
        }
        return Message.SUCCESS;
    }

    public Message RestrictionAnagram(String word){
        if (word.length() <= 2){
            System.out.println(Message.ERROR.getMessage() + " A palavra precisa ter mais de 2 letras!");
            return Message.ERROR;
        }
        for (int i = 0; i < word.length(); i++)
            if (isLetterOrDigit(word.charAt(i))){
                System.out.println(Message.ERROR.getMessage() + " A palavra não pode ter números!");
                return Message.ERROR;
            }
        return Message.SUCCESS;
    }

}
