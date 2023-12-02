package pratica14;

import java.util.Scanner;

public class Parente extends PF {

	Scanner input = new Scanner(System.in);
	
	private String email;

	public Parente() {
		super();
		email = "";
	}

	public Parente(String nome, String telefone, String endereco, String RG, String CPF, String email) {
		super(nome, telefone, endereco, RG, CPF);
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmail: " + email;
	}
}
