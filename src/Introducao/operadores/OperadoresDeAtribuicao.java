package Introducao.operadores;

public class OperadoresDeAtribuicao {
    // são eles: +=, -=, *=, /=, %=, Basicamente e para economizar código

    public static void main(String[] args) {
        int n1 = 10;

        n1 = n1 + n1; //basicamente isso vira +=
        System.out.println(n1);

        //
        int n2 = 10;
        n2 += n2;
        System.out.println(n2);


        //exemplo
        int bonus = 1000;
        bonus += 1000; //2000
        System.out.println(bonus);
        bonus -= 1000;// 1000
        System.out.println(bonus);
        bonus *= 1000;//1000000
        System.out.println(bonus);
        bonus /= 1000; // 1000
        System.out.println(bonus);
        bonus %= 105; //55
        System.out.println(bonus);

    }
}
