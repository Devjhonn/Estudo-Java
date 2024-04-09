package Introducao.POO.Classes;

public class CadastroLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "Rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789-10";



        Livros livroJava8 = new Livros();

        livroJava8.nome = "Java 8 Prático";
        livroJava8.descricao = "Novos recursos da linguagem";
        livroJava8.valor = 59.99;
        livroJava8.identificacao = "989-969";
        livroJava8.autor = autor;


        System.out.println(livroJava8.nome);
        System.out.println(livroJava8.descricao);
        System.out.println(livroJava8.valor);
        System.out.println(livroJava8.identificacao);


        // simplificando com métodos para imprimir os atributos
        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira@caelum.com.br";
        outroAutor.cpf = "123.456.789.10";

        Livros livroPoo = new Livros();
        livroPoo.nome = "Programação Orientada a Objetos";
        livroPoo.descricao = "Tudo sobre Poo";
        livroPoo.valor = 60.45;
        livroPoo.identificacao = "656-696";
        //Metodos da classe
        livroPoo.mostrarDetalhes();


    }
}
