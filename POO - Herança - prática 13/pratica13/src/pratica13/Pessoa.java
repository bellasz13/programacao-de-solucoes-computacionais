package pratica13;

import java.util.Scanner;

public class Pessoa {

	Scanner input = new Scanner(System.in);
	
	private String nome;
	private String telefone;
	private String endereco;

	public Pessoa() {
		nome = "";
		telefone = "";
		endereco = "";
	}

	public Pessoa(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;

	}
	public void exibe() {
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereço: " + endereco);
	}
}
