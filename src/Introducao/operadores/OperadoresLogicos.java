package Introducao.operadores;

public class OperadoresLogicos {
    // Os operadores lógicos são AND = &&, OU = ||
    public static void main(String[] args) {

        // vamos supor que para entrar em um festa vip a pessoa tem que ser maior de 20 anos e ganhar mais que 3 mil
        int idade = 22;
        float salario = 3000;
        float salario2 = 2500F;

        //as duas condições precisa ser verdadeira para voltar true
        boolean podeEntrarMaiorque20 = idade >= 20 && salario >= 3000; //true
        boolean naoPodeEntrarMenorque20 = idade >= 20 && salario2 >= 3000; //false

        System.out.println(podeEntrarMaiorque20);
        System.out.println(naoPodeEntrarMenorque20);


        //No ou apenas uma precisa ser verdadeira
        boolean podeEntrarOuNao = idade >=20 || salario2 >=3000;
        System.out.println("Ou: " + podeEntrarOuNao);



    }

}
