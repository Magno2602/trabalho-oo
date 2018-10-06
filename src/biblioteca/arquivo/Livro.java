package biblioteca.arquivo;

public class Livro {
    private String nome;
    private String isbn;
    private int ano;
    private int exemplares;
    private String autor;

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
}
