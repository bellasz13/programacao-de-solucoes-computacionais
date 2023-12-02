package pratica14;

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
	public String toString() {
		return super.toString() + "\nCNPJ: " + CNPJ + "\nIE: " + IE;
	}
}
