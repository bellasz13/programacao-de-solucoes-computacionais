package pratica14;

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
	public String toString() {
		return super.toString() + "\nRG: " + RG + "\nCPF: " + CPF;
	}
}
