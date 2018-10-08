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
        LIVROS.add(new Livro("Romeu e Julieta", "00003", 1950, 10, "Hittler"));
        LIVROS.add(new Livro("A Casa de Cera", "00004", 1899, 10, "Joel S."));
        LIVROS.add(new Livro("Harry Potter, e a Pedra Filosofal.", "00005", 1970, 10, "Dona Benta"));
        LIVROS.add(new Livro("Game of Thrones", "00006", 1995, 10, "Jiovana"));
        LIVROS.add(new Livro("A casa da Madrinha", "00007", 1998, 10, "Beth"));
        LIVROS.add(new Livro("Orientação a Objetos", "00008", 2010, 10, "Michael Jagour"));
        LIVROS.add(new Livro("Divergente", "00009", 2011, 10, "Samara"));
        LIVROS.add(new Livro("Escrito nas Estrelas", "00010", 2015, 10, "Tarcísio Meira"));


        ALUNOS.add(new Aluno("Magno Santos", "1000018", "01/01/1991", "ESOFT"));
        ALUNOS.add(new Aluno("Bruna Sanches", "1080831", "10/02/1998", "Culinária"));
        ALUNOS.add(new Aluno("Liscia Perez", "1305827", "11/12/1945","História"));
        ALUNOS.add(new Aluno("Tiago Couto", "8403839", "04/05/1991", "ESOFT"));
        ALUNOS.add(new Aluno("Fabiane Kitagawa", "7392002", "01/03,1989", "Artes Plásticas"));
        ALUNOS.add(new Aluno("Logan Kitagawa Couto", "7409028", "19/09/2000", "Pedagogia"));
        ALUNOS.add(new Aluno("Thiago Silva", "7430383", "09/04/1912", "Logística"));
        ALUNOS.add(new Aluno("Arion Diniz", "6459272", "10/10/1910", "Biologia e Meio Ambiente"));
        ALUNOS.add(new Aluno("João Miranda", "6593028", "30/12/2001","Gestão e Varejo"));
        ALUNOS.add(new Aluno("Iracy Medeiros", "6492098", "12/12/1992/","Gestão Empresarial"));

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
