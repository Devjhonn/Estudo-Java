package Introducao.POO.exercicioFacul;

import java.util.Random;
import java.util.Scanner;

public class ExercicioFacul {
    public static void main(String[] args) {
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        System.out.println("Cadastrando novo cliente.");
        System.out.print("Ente com seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();




    }
}
