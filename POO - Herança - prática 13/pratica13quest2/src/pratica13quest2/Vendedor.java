package pratica13quest2;

import java.util.Scanner;

public class Vendedor extends Empregado {

	Scanner input = new Scanner(System.in);

	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase,
			double inss, double valorVendas, double comissao) {
		super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		double salarioBase = super.calcularSalario();
		double salarioComInss = salarioBase - (salarioBase * (getInss() / 100));
		return salarioComInss + (valorVendas * (comissao / 100));
	}

	@Override
	public String toString() {
		return super.toString() + ", Valor de Vendas: " + valorVendas + ", Comissão: " + comissao;
	}
}
