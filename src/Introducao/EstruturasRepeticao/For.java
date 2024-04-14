package Introducao.EstruturasRepeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //for - for(i=0; i >10; i++)
        exFor();
    }

    public static void exFor(){
        //imprimindo numeros pares de  0 a 100
        for (int index = 0; index <= 100; index++){
            if (index % 2 == 0){
                System.out.println(index);
            }
        }
    }

    public static void  tabudaSoma(){
        Scanner number = new Scanner(System.in);
        System.out.println("Digite o numero para a tabuada: ");
        int numero = number.nextInt();

        int tabauada;
        System.out.println("============ Soma ========");
        for (tabauada = 0; tabauada <= 10; tabauada++){
            System.out.println(numero +" + "+ tabauada  + " = " + (numero + tabauada));

        }
    }


}
