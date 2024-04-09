package Introducao.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        /* > - Maior que
        * < Menor que
        * >= Maior ou igual a que
        * <= Menor ou igual a que
        * != Diferente
        * == Igual
        * */

        int n1 = 10;
        int n2 = 15;

        boolean maiorQue = n1 > n2;
        boolean menorQue = n1 < n2;
        boolean maiorOuIgualQue = n1 >= n2;
        boolean menorOuIgual = n1 <= n2;
        boolean Igual = n1 == n2;
        boolean diferente = n1 != n2;

        System.out.println("n1 é maior que n2? " + maiorQue);// false
        System.out.println("n1 é menor que n2? " + menorQue); // true
        System.out.println("ni é maior ou igual a n2: " + maiorOuIgualQue);//false
        System.out.println("n1 é menor ou igual a n2: " + menorOuIgual);//true
        System.out.println("N1 é igual a n2: " + Igual); // false
        System.out.println("N1 é diferente  de n2: " + diferente); //true


    }





}
