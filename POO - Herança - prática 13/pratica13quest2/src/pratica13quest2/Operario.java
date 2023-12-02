package pratica13quest2;

import java.util.Scanner;

public class Operario extends Empregado {

	Scanner input = new Scanner(System.in);

	private double valorProducao;
	private double comissao;

	public Operario(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase,
			double inss, double valorProducao, double comissao) {
		super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		double salarioBase = super.calcularSalario();
		double salarioComInss = salarioBase - (salarioBase * (getInss() / 100));
		return salarioComInss + (valorProducao * (comissao / 100));
	}

	@Override
	public String toString() {
		return super.toString() + ", Valor de Produção: " + valorProducao + ", Comissão: " + comissao;
	}
}
