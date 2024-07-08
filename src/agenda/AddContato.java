package agenda;

import java.util.ArrayList;

public class AddContato {

	private ArrayList<Contato> contatos;
	
	public AddContato() {
		this.contatos = new ArrayList<>();
	}
	
	public void adicionarContato(Contato contato) {
		contatos.add(contato);
		System.out.println("Contato adicionado com sucesso!");
	}
	
	public void mostrarContatos() {
		System.out.println("Contatos:");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}
}
