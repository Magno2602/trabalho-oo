package biblioteca.arquivo;

public class Livro {
    private String nome;
    private String isbn;
    private int ano;
    private int exemplares;
    private String autor;

    public Livro() {
    }

    public Livro(String nome, String isbn, int ano, int exemplares, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.ano = ano;
        this.exemplares = exemplares;
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public int getExemplares() {
        return exemplares;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", ano=" + ano +
                ", exemplares=" + exemplares +
                ", autor='" + autor + '\'';
    }

    public void reduzirExemplares() {
        this.exemplares--;
    }
}
