package Introducao.Break_Continue;

public class Break {
    public static void main(String[] args) {
        pacelaCarro();
    }

    public static void breakEx() {
        // imprimir os primeiros 25 numeros de 50
        int max = 50;

        for(int i = 0; i <= max; i++){
            if (i > 25){
                break; // para n 25
            }
            System.out.println(i);
        }
    }

    public static void pacelaCarro (){
        //dado um valor de um veiuculo descubra em quantas vezes ele pode ser parcelado
        //Condição valor da parcela >= 1000
        Double valorTotal = 30000.0;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal/ parcela;
            if (valorParcela < 1000.0){
                break; // tem que está dentro do for
            }
            System.out.println("Parcela: " + parcela +" = " + valorParcela);
        }

    }
}
