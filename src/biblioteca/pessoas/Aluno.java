package biblioteca.pessoas;

public class Aluno {
    private String nome;
    private String ra;
    private String nascimento;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, String ra, String nascimento, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.nascimento = nascimento;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setRA(String ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", nascimento='" + nascimento + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}

