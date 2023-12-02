package pratica13;

import java.util.Scanner;

public class Amigos extends PF {

	Scanner input = new Scanner(System.in);

	private String blog;

	public Amigos() {
		super();
		blog = "";
	}

	public Amigos(String nome, String telefone, String endereco, String RG, String CPF, String blog) {
		super(nome, telefone, endereco, RG, CPF);
		this.blog = blog;
	}

	@Override
	public void exibe() {
		super.exibe();
		System.out.println("Blog: " + blog);
	}
}
