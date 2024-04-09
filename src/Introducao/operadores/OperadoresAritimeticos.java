package Introducao.operadores;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        // soma, divisão, subtraçã, e multiplicação
        soma();
        subtracao();
        multiplicacao();
        divisao();
        resto();
    }

    public static void soma() {
        System.out.println("============ Soma ==========");
        int valor1 = 10;
        int valor2 = 15;

        double valorDouble = 15.89;
        double valorDouble2 = 25.5;

        int somaInt = valor1 + valor2;
        double somaDouble = valorDouble + valorDouble2;
        System.out.println("Resultado Int: " + somaInt);
        System.out.println("Resultado double: " + somaDouble);
    }

    public static void subtracao() {
        System.out.println("=============== Subtração ==============");
        int valor1 = 15;
        int valor2 = 10;

        double valorDouble = 15.89;
        double valorDouble2 = 5.5;

        int subtracaoInt = valor1 - valor2;
        double susbtracaoDouble = valorDouble - valorDouble2;
        System.out.println("Resultado subtração Int: " + subtracaoInt);
        System.out.println("Resultado subtração double: " + susbtracaoDouble);
    }

    public static void multiplicacao() {
        System.out.println("=============== Multiplicação ==============");
        int valor1 = 10;
        int valor2 = 15;

        double valorDouble = 15.89;
        double valorDouble2 = 25.5;

        int multiplicaInt = valor1 * valor2;
        double multiplicaDouble = valorDouble * valorDouble2;
        System.out.println("Resultado Multiplicação Int: " + multiplicaInt);
        System.out.println("Resultado Multiplicação double: " + multiplicaDouble);
    }

    public static void divisao() {
        System.out.println("=============== Divisão ==============");
        int valor1 = 25;
        int valor2 = 5;

        double valorDouble = 15.89;
        double valorDouble2 = 25.5;

        int divisaoInt = valor1 / valor2;
        double divisaoDouble = valorDouble / valorDouble2;
        System.out.println("Resultado subtração Int: " + divisaoInt);
        System.out.println("Resultado subtração double: " + divisaoDouble);
    }

    public static void resto() {
        System.out.println("=============== Resto da divisão ==============");
        int valor1 = 10;
        int valor2 = 3;

        double valorDouble = 15.89;
        double valorDouble2 = 2.5;

        int restoInt = valor1 % valor2;
        double restoDouble = valorDouble % valorDouble2;
        System.out.println("Resultado subtração Int: " + restoInt);
        System.out.println("Resultado subtração double: " + restoDouble);
    }





}
