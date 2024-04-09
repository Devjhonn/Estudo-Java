package Introducao;

public class tiposPrimitivos {

    public static void main(String[] args){
        exercicio();
    }

    public static void interiro(){
        System.out.println("============== Inteiro ==================");
        int valor1 = 10;
        int valor2 = 5;
        int soma = valor1 + valor2;
        System.out.println("Soma: " + soma);

        int idade = 25;
        int quantidade = 8;

        System.out.println("Idade: "+idade);
        System.out.println("Quantiade: " + quantidade);
    }

    public static void Double(){

        System.out.println("=============== Double ==============");
        double altura = 1.85;
        double peso = 54.5;
        double tamanho = 25.9;

        System.out.println("altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Tamanho: " + tamanho);

        double n1 = 15.8;
        double n2 = 21.89;
        double soma = n1 +n2;
        System.out.println("Soma: " + soma);
    }

    public static void Float(){
        System.out.println("============= Float ===============");
        float salario = 2500.5F;
        float peso = 57.86F;

        System.out.println("Salario Float: " + salario);
        System.out.println("Peso Float: " + peso);

        float n1 = 15.8f;
        float n2 = 21.89f;
        float soma = n1 +n2;
        System.out.println("Soma Float: " + soma);
    }

    public static  void Byte(){
        System.out.println("=============== Byte ==============");
        byte peso = 50;
        byte tamanho = 25;

        System.out.println("Peso: " + peso);
        System.out.println("Tamanho: " + tamanho);

        byte n1 = 127; // maximo é 127
        byte n2 = 21;
        int soma = n1 +n2;
        System.out.println("Soma: " + soma);
    }

    public static void  Short(){
        System.out.println("=============== Short ==============");
        short altura = 10;
        short peso = 54;
        short tamanho = 25;

        System.out.println("altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Tamanho: " + tamanho);

        short n1 = 158;
        short n2 = 2169;
        short soma = (short) (n1 +n2);
        int somaI = n1+n2;
        System.out.println("Soma: " + soma);
        System.out.println("Int soma: " + somaI);
    }

    public static void Boolean() {
        System.out.println("============== Boolean ==============");
        boolean maiorDeidade = false;
        boolean menorDeidade = true;
        System.out.println("É maior de idade: " + maiorDeidade);
        System.out.println("É menor de idadde: "+menorDeidade);

        int n = 10;
        int b = 5;

        boolean eMaior = n > b;//true
        System.out.println("N é maior que B: " + eMaior);


    }

    public static void Char(){
        System.out.println("============= Char =============");
        char letra = 'A';
        char l = 'l';
        char e = 'e';

        System.out.println("Char: " + letra);
        System.out.println(l);
        System.out.println(e);

    }


    public static void exercicio(){
        //imprimindo mensagens com variaveis
        String nome = "Marcos";
        String endereco = "Rua 14";
        double salario = 2500.99;
        String data = "29/04/2024";

        System.out.println("Eu, " + nome + " Morando no endereço, "+ endereco + ", Confirmo que recebi o salário de R$: " + salario + ", na data " + data);
    }

}
