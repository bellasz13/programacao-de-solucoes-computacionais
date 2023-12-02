package pratica13;

import java.util.Scanner;

public class PJ extends Pessoa {

	Scanner input = new Scanner(System.in);

	private String CNPJ;
	private String IE;

	public PJ() {
		super();
		CNPJ = "";
		IE = "";
	}

	public PJ(String nome, String telefone, String endereco, String CNPJ, String IE) {
		super(nome, telefone, endereco);
		this.CNPJ = CNPJ;
		this.IE = IE;
	}

	@Override
	public void exibe() {
		super.exibe();
		System.out.println("CNPJ: " + CNPJ);
		System.out.println("Inscrição Estadual: " + IE);
	}
}
