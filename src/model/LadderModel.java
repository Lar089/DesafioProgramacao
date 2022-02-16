package model;
/*
@author Caroline
# Questão 01
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada:
n = 6

Saída:
     *
    **
   ***
  ****
 *****
******
 */

public class LadderModel {
    private int n;
    private String[][] result;

    public LadderModel(int n){
        super();
        setN(n);
    }

    public int getN(){
        return n;
    }

    public void setN(int n){
        this.n = n;
    }

    public String[][] getResult(){
        return result;
    }

    public void setResult(String[][] result){
        this.result = result;
    }


}
