package Introducao.POO.Classes;

public class Livros {
    public String nome;
    public String descricao;
    public String identificacao;
    public double valor;
    Autor autor;


    void mostrarDetalhes(){
        System.out.println("=== Mostrar Detalhes do Livro ===");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Identificação: " + identificacao);
        System.out.println("Valor: R$ " + valor);

        System.out.println("=== Mostrar Detalhes do Autor ===");
        System.out.println("Nome: " + autor.nome);
        System.out.println("E-mail: " + autor.email);
        System.out.println("Cpf: " + autor.cpf);
    }

}
