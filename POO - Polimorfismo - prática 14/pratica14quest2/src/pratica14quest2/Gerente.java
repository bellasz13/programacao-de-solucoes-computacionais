package pratica14quest2;

import java.util.Scanner;

public class Gerente extends Empregado {

	Scanner input = new Scanner(System.in);

	private String nomeSecretaria;

	public Gerente(String nome, double salario, int anoContratacao) {
		super(nome, salario, anoContratacao);
		nomeSecretaria = "";
	}

	public String getNomeSecretaria() {
		return nomeSecretaria;
	}

	public void setNomeSecretaria(String nomeSecretaria) {
		this.nomeSecretaria = nomeSecretaria;
	}

	@Override
	public void reajustaSalario(double porcentagem) {
		// Adiciona 1% de bônus para cada ano de serviço
		double bonus = (ANO_BASE - getAnoContratacao());
		super.reajustaSalario(porcentagem + bonus);
	}

	@Override
	public String toString() {
		return super.toString() + " - Secretaria: " + nomeSecretaria;
	}
}
