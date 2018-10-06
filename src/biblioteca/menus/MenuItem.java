package biblioteca.menus;

import java.util.Scanner;

public abstract class MenuItem {
    private Scanner scanner;

    public MenuItem() {
        this.scanner = new Scanner(System.in);
    }

    public abstract void apresentaOpcoes();

    public abstract MenuItem opcaoEscolhida();

    public int getOpcaoEscolhida() {
        return getNumero();
    }

    public String getTexto() {
        return scanner.nextLine();
    }

    public int getNumero() {
        try {
            return Integer.valueOf(scanner.nextLine());
        } catch (final NumberFormatException e) {
            System.err.print("Formato inválido, tente novamente: ");
            return getNumero();
        }
    }
}