package Introducao;

public class CondicionaisIF {
    public static void main(String[] args) {
        // condicionais

        int idade = 18;
        String ingresso = "AB";
        //verifica se idade é maior que 18
        if (idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("menor de idade");
        }


        if (idade >= 18 && ingresso == "AF"){
            System.out.println("Entrada liberada, Pista");
        }else if (idade >= 18 && ingresso == "AB"){
            System.out.println("Entrada liberada, Camarote");
        }else {
            System.out.println("Veriricar idade e ingresso");
        }


        exemplo();

    }


    public static  void exemplo(){
        //idade < 15 - categoria infantil
        //idade >= 15 && idade > 18 categoria juvenil
        // idade >= 18 categoria adulta

        int idade = 14;

        if (idade < 15){
            System.out.println("Categoria infantil");
        }else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria adulta");
        }
    }
}
