package biblioteca;

import biblioteca.arquivo.Livro;
import biblioteca.pessoas.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Aluguel> alugueis = new ArrayList<>();
}
