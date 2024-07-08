package agenda;

import java.util.Scanner;

public class Menu {

	private static final Scanner sc = new Scanner(System.in);
	private AddContato agenda;
	
	public Menu() {
		this.agenda = new AddContato();
	}
	
	public void mostrarMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar contato.");
            System.out.println("2. Mostrar todos os contatos.");
            System.out.println("3. Sair.");
            System.out.print("Escolha uma opção: ");
            int opcao = lerOpcaoMenu();

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    agenda.mostrarContatos();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private int lerOpcaoMenu() {
        while (true) {
            try {
                int opcao = Integer.parseInt(sc.nextLine());
                return opcao;
            } catch (NumberFormatException e) {
                System.out.print("Opção inválida. Digite um número: ");
            }
        }
    }

    private void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = sc.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o email do contato: ");
        String email = sc.nextLine();

        Contato contato = new Contato(nome, telefone, email);
        agenda.adicionarContato(contato);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}

