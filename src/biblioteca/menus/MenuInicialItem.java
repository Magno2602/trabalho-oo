package biblioteca.menus;

public class MenuInicialItem extends MenuItem {
    @Override
    public void apresentaOpcoes() {
        System.out.println("==========> [ ] MENU INICIAL");
        System.out.println();
        System.out.println("1. Cadastrar Livro");
        System.out.println("2. Cadastrar Aluno");
        System.out.println("3. Realizar Aluguel");
        System.out.println("0. Sair");
        System.out.println();
    }

    @Override
    public MenuItem opcaoEscolhida() {
        System.out.print("> Escolha a operação: ");
        int opcao = getOpcaoEscolhida();
        switch (opcao) {
            case 1:
                return new MenuCadastroLivroItem();
            case 2:
                return new MenuCadastroAlunoItem();
            case 3:
                return new MenuCadastroAluguelItem();
            case 0:
                return null;
            default:
                System.err.println("Menu inválido.");
                return opcaoEscolhida();
        }
    }
}
