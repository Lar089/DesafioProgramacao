package controller.service;

public class LadderService {

    public int ValueConvert(String n){
        return Integer.parseInt(n);
    }

    public String[][] Matrix(int value){
        String[][] m = new String[value][value];

        for (int i = 0; i < value; i++){
            for (int j = 0; j < value;j++){
                if(value - j == (i + 1))
                    m[i][j] = "*";
                if(value - i <= (j + 1))
                    m[i][j] = "*";
                else
                    m[i][j] = " ";
            }
        }
        return m;
    }


}