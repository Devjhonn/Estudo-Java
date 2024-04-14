package Introducao.Condicionais;

public class SwitchCase {
    //imprime o dia da semana, considerando 1 como domingo
    //em kotlin é o mesmo que when
   public static void main(String[] args){
       byte dia = 10;

       switch (dia){
           case 1:
               System.out.println("Domingo");
               break;
           case 2:
               System.out.println("Segunda");
               break;
           case 3:
               System.out.println("Terça");
               break;
           case 4:
               System.out.println("Quarta");
               break;
           case 5:
               System.out.println("Quinta");
               break;
           case 6:
               System.out.println("Sexta");
               break;
           case 7:
               System.out.println("Sabado");
               break;
           default:
               System.out.println("Opção incorreta, escolha de 1 a 7");
               break;
       }

       //verifica sexo
       char sexo = 'M';

       switch (sexo){
           case 'M':
               System.out.println("Masculino");
               break;
           case 'F':
               System.out.println("Feminino");
               break;
           default:
               System.out.println("Opção errada");
               break;
       }
   }
}
