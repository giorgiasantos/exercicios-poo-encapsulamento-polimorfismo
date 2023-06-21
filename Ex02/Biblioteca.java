package Ex02;

import java.util.Arrays;
public abstract class Biblioteca {
    String nome;
    String pessoaAutora;
    int isbn;
    String [] listaGeneros;
    public Biblioteca() {
    }

    public void registrarLivro(int isbn) {

        System.out.println("Você registrou um livro com o ISBN");
        this.isbn = isbn;
        System.out.println("ISBN: " + this.isbn);

    };

    public void registrarLivro(int isbn, String nome) {
        this.isbn = isbn;
        this.nome = nome;
        System.out.println("Você registrou um livro com o ISBN e título.");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.nome);

    };

    public void registrarLivro(int isbn, String nome, String [] listaGeneros) {
        this.isbn = isbn;
        this.nome = nome;
        this.listaGeneros = listaGeneros;
        System.out.println("Você registrou um livro com o ISBN, título e gêneros literários.");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.nome);
        System.out.println("Gêneros: " + Arrays.toString(this.listaGeneros));
    }

    public void registrarLivro(int isbn, String nome, String[] listaGeneros, String pessoaAutora) {
        this.isbn = isbn;
        this.nome = nome;
        this.listaGeneros = listaGeneros;
        this.pessoaAutora = pessoaAutora;
        System.out.println("Livro registrado com todos os atributos");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.nome);
        System.out.println("Gêneros: " + Arrays.toString(this.listaGeneros));
        System.out.println("Pessoa Autora: " + this.pessoaAutora);
    };

}
