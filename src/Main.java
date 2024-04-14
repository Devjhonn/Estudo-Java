
public class Main {
    public static void main(String[] args) {
        //Exercicios

        impostoSalario();
    }

    public static void impostoSalario(){
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 /100;

        double salarioAnual = 70000;
        double valorImposto;

        if (salarioAnual <= 34712 ){
            valorImposto = salarioAnual * primeiraFaixa;
            System.out.println("Salario: "+ salarioAnual + " imposto: " + valorImposto);
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
            System.out.println( "Salario: "+ salarioAnual + " imposto: " + valorImposto);
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
            System.out.println("Salario: "+ salarioAnual + " imposto: " + valorImposto);
        }
    }

}