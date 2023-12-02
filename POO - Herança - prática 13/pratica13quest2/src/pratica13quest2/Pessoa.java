package pratica13quest2;

import java.util.Scanner;

public class Pessoa {

	Scanner input = new Scanner(System.in);

	private String nome;
	private int idade;
	private double altura;
	private double peso;

	public Pessoa(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura + ", Peso: " + peso;
	}

	public String getInfo() {

		return null;
	}
}
