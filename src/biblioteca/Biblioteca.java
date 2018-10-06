package biblioteca;

import biblioteca.arquivo.Livro;
import biblioteca.pessoas.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static List<Livro> LIVROS = new ArrayList<>();
    private static List<Aluno> ALUNOS = new ArrayList<>();
    private static List<Aluguel> ALUGUEIS = new ArrayList<>();

    public static void addLivro(Livro livro) {
        LIVROS.add(livro);

        System.out.println();
        System.out.println("LIVRO SALVO COM SUCESSO: " + livro.toString());
        System.out.println("AGORA POSSUIMOS " + LIVROS.size() + " LIVROS NO NOSSO ACERVO.");
        System.out.println();
    }
}
