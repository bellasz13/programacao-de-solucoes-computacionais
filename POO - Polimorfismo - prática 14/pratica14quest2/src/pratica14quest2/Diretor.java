package pratica14quest2;

import java.util.Scanner;

public class Diretor extends Empregado {

	Scanner input = new Scanner(System.in);

	private String departamento;

	public Diretor(String nome, double salario, int anoContratacao, String departamento) {
		super(nome, salario, anoContratacao);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public void reajustaSalario(double porcentagem) {
		
		double bonus = (ANO_BASE - getAnoContratacao()) * 2;
		super.reajustaSalario(porcentagem + bonus);
	}

	@Override
	public String toString() {
		return super.toString() + " - " + departamento;
	}

}
