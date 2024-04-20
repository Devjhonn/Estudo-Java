package Introducao.Arrays;

public class ArraysMultidimensionais {
    //basicamente é um array de arrays
    public static void main(String[] args) {

    }


    void arrayMulti(){
        int[][] dias = new int[3][3];
        // dias na posição 0
        dias[0][0] = 1;
        dias[0][1] = 1;
        dias[0][2] = 1;

        dias[1][0] = 2;
        dias[1][1] = 2;
        dias[1][2] = 2;

        dias[2][0] = 3;
        dias[2][1] = 3;
        dias[2][2] = 3;


        for (int indice = 0; indice < dias.length; indice++){
            for (int j = 0; j < dias[indice].length; j++){
                System.out.println(dias[indice][j]);
            }
        }



        //ForEach
        System.out.println("==========================");
        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }

    void arrayMultiInicializacao(){
        
    }
}
