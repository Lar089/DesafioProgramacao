package controller.service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isLetterOrDigit;

public class PasswordService {
    List list = new ArrayList<>();

    public int PasswordLength(String password) {
        return password.length();
    }

    public int RestrictionPassword(char charValue) {
        if (!isLetterOrDigit(charValue)) {
            if (!list.contains(1)) {
                list.add(1);
                return 1;
            }
        } else {
            if (Character.isUpperCase(charValue)) {
                if (!list.contains(2)) {
                    list.add(2);
                    return 1;
                }
            }
            if (Character.isLowerCase(charValue)) {
                if (!list.contains(3)) {
                    list.add(3);
                    return 1;
                }
            }
            if (Character.isDigit(charValue)) {
                if (!list.contains(4)) {
                    list.add(4);
                    return 1;
                }
            }
        }
        return 0;
    }

    public int Result(int value, int length) {
        int auxLength = 6 - length;//6 tamanho minimo da senha
        int auxValue = 4 - value;//4 quantidade de criterios da senha

        if (length < 6) {
            if(auxLength <= auxValue){
                return auxValue;
            } else {
                return auxLength;
            }
        } else {
            return auxValue;
        }
    }

}
