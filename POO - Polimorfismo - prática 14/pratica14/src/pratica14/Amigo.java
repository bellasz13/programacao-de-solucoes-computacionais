package pratica14;

import java.util.Scanner;

public class Amigo extends PF {
	
	Scanner input = new Scanner(System.in);
	
	private String blog;

	public Amigo() {
		super();
		blog = "";
	}

	public Amigo(String nome, String telefone, String endereco, String RG, String CPF, String blog) {
		super(nome, telefone, endereco, RG, CPF);
		this.blog = blog;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBlog: " + blog;
	}

}
