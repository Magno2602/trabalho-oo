package biblioteca;

import biblioteca.arquivo.Livro;
import biblioteca.pessoas.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static List<Livro> LIVROS = new ArrayList<>();
    private static List<Aluno> ALUNOS = new ArrayList<>();
    private static List<Aluguel> ALUGUEIS = new ArrayList<>();

    static {
        LIVROS.add(new Livro("Memórias Póstumas", "00001", 1999, 10, "Autor Desconhecido"));
        LIVROS.add(new Livro("Use a Cabeça: Java", "00002", 2015, 10, "O REILLY"));

        ALUNOS.add(new Aluno("Magno Santos", "1000018", "01/01/1991", "ESOFT"));
    }

    public static void addLivro(Livro livro) {
        LIVROS.add(livro);

        System.out.println();
        System.out.println("LIVRO SALVO COM SUCESSO: " + livro.toString());
        System.out.println("AGORA POSSUIMOS " + LIVROS.size() + " LIVROS NO NOSSO ACERVO.");
        System.out.println();
    }

    public static void addAluno(Aluno aluno) {
        ALUNOS.add(aluno);

        System.out.println();
        System.out.println("ALUNO CADASTRADO COM SUCESSO: " + aluno.toString());
        System.out.println("AGORA POSSUIMOS " + ALUNOS.size() + " ALUNOS EM NOSSO ACERVO.");
        System.out.println();
    }

    public static void addAluguel(Aluguel aluguel) {
        aluguel.getLivro().reduzirExemplares();
        ALUGUEIS.add(aluguel);

        System.out.println();
        System.out.println("ALUGUEL REALIZADO COM SUCESSO: " + aluguel.toString());
        System.out.println("OBRIGADO PELA PREFERENCIA!!!");
        System.out.println("ALUGUEIS REALIZADOS: " + ALUGUEIS.size());
        System.out.println();
    }

    public static Livro buscaLivro(String busca) {
        busca = busca.toLowerCase();
        Livro livroEncontrado = null;
        for (Livro livro : LIVROS) {
            if (livro.getNome().toLowerCase().contains(busca))
                livroEncontrado = livro;
            if (String.valueOf(livro.getAno()).equals(busca))
                livroEncontrado = livro;
            if (livro.getAutor().toLowerCase().contains(busca))
                livroEncontrado = livro;
            if (livro.getIsbn().toLowerCase().equals(busca))
                livroEncontrado = livro;
        }

        if (livroEncontrado != null) {
            if (livroEncontrado.getExemplares() > 0) {
                return livroEncontrado;
            } else {
                System.err.println("Estoque Indisponivel.");
            }
        }

        System.err.println("Não encontrei nenhum livro com esse termo");
        return null;
    }

    public static Aluno buscaAluno(String busca) {
        busca = busca.toLowerCase();
        for (Aluno aluno : ALUNOS) {
            if (aluno.getNome().toLowerCase().contains(busca))
                return aluno;
            if (aluno.getCurso().toLowerCase().contains(busca))
                return aluno;
            if (aluno.getNascimento().toLowerCase().contains(busca))
                return aluno;
            if (aluno.getRA().toLowerCase().equals(busca))
                return aluno;
        }

        System.err.println("Não encontrei nenhum aluno com esse termo");
        return null;
    }
}
