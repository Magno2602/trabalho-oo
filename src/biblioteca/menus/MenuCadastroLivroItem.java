package biblioteca.menus;

import biblioteca.Biblioteca;
import biblioteca.arquivo.Livro;

public class MenuCadastroLivroItem extends MenuItem {
    @Override
    public void apresentaOpcoes() {
        System.out.println("==========> [1] MENU CADASTRO DE LIVROS");
        System.out.println();
        System.out.println("1. Cadastrar");
        System.out.println("0. Voltar");
        System.out.println();
    }

    @Override
    public MenuItem opcaoEscolhida() {
        System.out.print("> Escolha a operação: ");
        int opcao = getOpcaoEscolhida();
        switch (opcao) {
            case 1:
                Livro livro = new Livro();
                System.out.print("Nome do livro: ");
                livro.setNome(getTexto());
                System.out.print("ISBN: ");
                livro.setISBN(getTexto());
                System.out.print("Autor: ");
                livro.setAutor(getTexto());
                System.out.print("Ano: ");
                livro.setAno(getNumero());
                System.out.print("Exemplares: ");
                livro.setExemplares(getNumero());

                Biblioteca.addLivro(livro);

                return new MenuCadastroLivroItem();

            case 0:
                return new MenuInicialItem();
            default:
                System.err.println("Menu inválido.");
                return opcaoEscolhida();
        }
    }
}
