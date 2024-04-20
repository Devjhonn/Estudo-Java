package Introducao.POO.exercicioFacul;

public class ContaPoupanca extends ContaBancaria {
    float taxaRendimento = 0.6f;

    public ContaPoupanca(String nome, double saldo, float taxaRendimento) {
        super(nome, saldo);
        this.taxaRendimento = taxaRendimento;
    }

}

