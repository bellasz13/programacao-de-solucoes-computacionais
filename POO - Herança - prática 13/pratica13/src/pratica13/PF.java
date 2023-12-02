package pratica13;

import java.util.Scanner;

public class PF extends Pessoa {

	Scanner input = new Scanner(System.in);

	private String RG;
	private String CPF;

	public PF() {
		super();
		RG = "";
		CPF = "";
	}

	public PF(String nome, String telefone, String endereco, String RG, String CPF) {
		super(nome, telefone, endereco);
		this.RG = RG;
		this.CPF = CPF;
	}

	@Override
	public void exibe() {
		super.exibe();
		System.out.println("RG: " + RG);
		System.out.println("CPF: " + CPF);
	}
}
