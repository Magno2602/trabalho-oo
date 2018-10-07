package biblioteca;

import biblioteca.arquivo.Livro;
import biblioteca.pessoas.Aluno;

public class Aluguel {
    private Livro livro;
    private Aluno aluno;
    private int prazo;

    @Override
    public String toString() {
        return "Aluguel{" +
                "livro=" + livro +
                ", aluno=" + aluno +
                ", prazo=" + prazo +
                '}';
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public Livro getLivro() {
        return livro;
    }
}
