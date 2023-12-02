package pratica13;

import java.util.Scanner;

public class Parentes extends PF {

	Scanner input = new Scanner(System.in);

	private String email;

	public Parentes() {
		super();
		email = "";
	}

	public Parentes(String nome, String telefone, String endereco, String RG, String CPF, String email) {
		super(nome, telefone, endereco, RG, CPF);
		this.email = email;
	}

	@Override
	public void exibe() {
		super.exibe();
		System.out.println("E-mail: " + email);
	}
}
