package Introducao.POO.exercicioFacul;

abstract class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo_inicial){
        this.nome = nome;
        saldo = saldo_inicial;
    }


     public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Sacando: " + valor);
            System.out.println("Novo Saldo " + saldo);
        }else {
            System.out.println("Saldo insuficiente. Tente outro valor!");
        }
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo Saldo: " + saldo);
    }
}
