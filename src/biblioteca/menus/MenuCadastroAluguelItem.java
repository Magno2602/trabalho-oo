package biblioteca.menus;

import biblioteca.Aluguel;
import biblioteca.Biblioteca;
import biblioteca.arquivo.Livro;
import biblioteca.pessoas.Aluno;

public class MenuCadastroAluguelItem extends MenuItem {
    private Livro livro = null;
    private Aluno aluno = null;

    @Override
    public void apresentaOpcoes() {
        System.out.println("==========> [1] MENU CADASTRO DE ALUGUEL");
        System.out.println();
        System.out.println("1. Buscar Livro " + (livro != null ? "[ " + livro.getNome() + " ]" : "*"));
        System.out.println("2. Buscar Aluno " + (aluno != null ? "[ " + aluno.getNome() + " ]" : "*"));
        System.out.println("3. Alugar " + (livro == null && aluno == null ? "*" : " [ PRONTO PARA ALUGAR ]"));
        System.out.println("0. Voltar");
        System.out.println();
    }

    @Override
    public MenuItem opcaoEscolhida() {
        System.out.print("> Escolha a operação: ");
        int opcao = getOpcaoEscolhida();
        switch (opcao) {
            case 1:
                System.out.print("Insira o termo de busca: ");
                livro = Biblioteca.buscaLivro(getTexto());
                apresentaOpcoes();
                return opcaoEscolhida();
            case 2:
                System.out.print("Insira o termo de busca: ");
                aluno = Biblioteca.buscaAluno(getTexto());
                apresentaOpcoes();
                return opcaoEscolhida();
            case 3:
                if (aluno == null) {
                    System.err.println("*Precisa selecionar um aluno antes!");
                }

                if (livro == null) {
                    System.err.println("*Precisa selecionar um livro antes!");
                }

                if (aluno != null || livro != null) {
                    Aluguel aluguel = new Aluguel();
                    System.out.print("Informe o prazo do aluguel: ");
                    aluguel.setPrazo(getNumero());
                    aluguel.setAluno(aluno);
                    aluguel.setLivro(livro);

                    Biblioteca.addAluguel(aluguel);

                    aluno = null;
                    livro = null;
                }

                apresentaOpcoes();
                return opcaoEscolhida();
            case 0:
                return new MenuInicialItem();
            default:
                System.err.println("OPÇÃO INVÁLIDA!!!! TENTE NOVAMENTE");
                return opcaoEscolhida();
        }
    }
}