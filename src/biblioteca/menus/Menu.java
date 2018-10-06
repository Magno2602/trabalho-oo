package biblioteca.menus;

public class Menu {
    private MenuItem item;

    public Menu() {
        item = new MenuInicialItem();
    }

    public void iniciaLoop() {
        while (item != null) {
            item.apresentaOpcoes();
            item = item.opcaoEscolhida();
        }

        System.out.println();
        System.out.println(">> Sistema Encerrado.");
    }
}
