package Ex02;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.registrarLivro(18789);
        //System.out.println(livro1);

        Livro livro2 = new Livro();
        livro2.registrarLivro(9890, "Matéria Escura");
        //System.out.println(livro2);

        Livro livro3 = new Livro();
        livro3.registrarLivro(832732, "Morro dos Ventos Uivantes", new String[]{"Clássico", "Terror", "Mulheres doidas"});
        //System.out.println(livro3);
        //System.out.println(Arrays.toString(livro3.listaGeneros));

        Livro livro4 = new Livro();
        livro4.registrarLivro(123789, "Cadáver Exquisito", new String[]{"Ficção Científica", "Terror", "Distopia"}, "Agustina Bazterrica");
        //System.out.println(livro4);
    }
}
