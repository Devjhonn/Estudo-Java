package Introducao.Arrays;

public class Arrays {
    public static void main(String[] args) {
        //ao declarar um array vc precisa dizer quanto de espaço vc quer
        //arrays são indexados - posição 0,1,2,3,4
        //arrays são tipo reference
        //Array é tamanho fixo nao muda dinamicamente.
        int[] idades = new int[5]; // array de 5 posições
        idades[0] = 18;
        idades[1] = 25;
        idades[2] = 30;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);


        String [] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "luffy";
        nomes[2] = "naruto";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }



        //inicializando o array já com os valores
        int [] idade2 = {1, 2, 3 ,4, 5};

        //outra forma de imprimir o array

        //for each
        //o for each não acessa o indice em especifico
        for (int num: idade2){
            System.out.println("ForEach = " + num);
        }
    }
}
