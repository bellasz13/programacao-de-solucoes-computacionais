package pratica13quest2;

import java.util.Scanner;

public class Empregado extends Pessoa {

	Scanner input = new Scanner(System.in);

	private int numeroSecao;
	private double salarioBase;
	private double inss;

	public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase,
			double inss) {
		super(nome, idade, altura, peso);
		this.numeroSecao = numeroSecao;
		this.salarioBase = salarioBase;
		this.inss = inss;
	}
	public double calcularSalario() {
		return salarioBase - (salarioBase * (inss / 100));
	}

	@Override
	public String toString() {
		return super.toString() + ", Número Seção: " + numeroSecao + ", Salário Base: " + salarioBase + ", INSS: "
				+ inss;
	}
}
