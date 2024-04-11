package Introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        // e parecido com o if else
        int v1 = 1;
        int v2 = 5;
        int valor = 0;

        if (v1 > v2 ){
            valor = 100;
        }else {
            valor  = 0;
        }   

        //usando operador ternario
        double valor2 = 0;
        double valo = v1 > v2 ? 100 : 0;
        System.out.println(valor2);
    }
}
