package Introducao.EstruturasRepeticao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Delayed;
import java.util.stream.IntStream;

import static java.lang.System.*;
import static java.util.Arrays.stream;

public class While {
    public static void main(String[] args) {
       somaPares();
    }

    public static void decrecente(){
        out.println("Insira um número inteiro: ");
        Scanner recebe = new Scanner(System.in);
        int numero = recebe.nextInt();

        while (numero >= 0){
            System.out.println("Contagem: " + numero);
            numero --;
        }
    }

    public  static void somaPares(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int numero = entrada.nextInt();
        int count = 1;

        ArrayList<Integer> soma = new ArrayList<Integer>();
        while (count <= numero){
            if (count % 2 == 0){
                System.out.println(count);
                soma.add(count);
            }
            count++;
        }
        //somando os valores do arrayList
        int somaArray = 0;
        for (int indice : soma){
            somaArray += indice;
        }
        System.out.println("A soma dos index do array é: " + somaArray);
    }
}
