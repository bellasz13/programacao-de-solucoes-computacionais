package pratica13quest2;

import java.util.Scanner;

public class Cliente extends Pessoa {

	Scanner input = new Scanner(System.in);

	private double credMax;
	private double valorEmDivida;

	public Cliente(String nome, int idade, double altura, double peso, double credMax, double valorEmDivida) {
		super(nome, idade, altura, peso);
		this.credMax = credMax;
		this.valorEmDivida = valorEmDivida;
	}

	public double obterSaldo() {
		return credMax - valorEmDivida;
	}

	@Override
	public String toString() {
		return super.toString() + ", Crédito Máximo: " + credMax + ", Valor em Dívida: " + valorEmDivida;
	}
}
