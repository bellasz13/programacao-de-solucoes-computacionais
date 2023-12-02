package pratica13quest2;

import java.util.Scanner;

public class Administrador extends Empregado {

	Scanner input = new Scanner(System.in);

	private double ajudaDeCusto;

	public Administrador(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase,
			double inss, double ajudaDeCusto) {
		super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario() {
		
		return super.calcularSalario() + ajudaDeCusto;
	}

	@Override
	public String toString() {
		return super.toString() + ", Ajuda de Custo: " + ajudaDeCusto;
	}
}
