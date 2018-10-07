package biblioteca.menus;

import biblioteca.Biblioteca;
import biblioteca.pessoas.Aluno;

public class MenuCadastroAlunoItem extends MenuItem {
    @Override
    public void apresentaOpcoes() {
        System.out.println("==========> [1] MENU CADASTRO DE ALUNOS");
        System.out.println();
        System.out.println("1. Cadastrar");
        System.out.println("0. Voltar");
        System.out.println();
    }

    public MenuItem opcaoEscolhida() {
        System.out.print("> Escolha a operação: ");
        int opcao = getOpcaoEscolhida();
        switch (opcao) {
            case 1:
                Aluno aluno = new Aluno();
                System.out.println("Nome do Aluno: ");
                aluno.setNome(getTexto());
                System.out.println("RA do Aluno: ");
                aluno.setRA(getTexto());
                System.out.println("Data de Nascimento: ");
                aluno.setNascimento(getTexto());
                System.out.println("Curso: ");
                aluno.setCurso(getTexto());

                Biblioteca.addAluno(aluno);

                return new MenuCadastroAlunoItem();

            case 0:
                return new MenuInicialItem();
            default:
                System.err.println("OPÇÃO INVÁLIDA!!!! TENTE NOVAMENTE");
                return opcaoEscolhida();
        }

    }
}