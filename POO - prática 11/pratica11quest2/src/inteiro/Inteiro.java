package inteiro;

import java.util.Scanner;

public class Inteiro {
	public int multiplicacao(int a, int b) {
		int resultado = 0;
		for (int i = 0; i < b; i++) {
			resultado += a;
		}
		return resultado;
	}

	public int potencia(int a, int b) {
		int resultado = 1;
		for (int i = 0; i < b; i++) {
			resultado = multiplicacao(resultado, a);
		}
		return resultado;
	}

	public int divisao(int a, int b) {
		int quociente = 0;
		while (a >= b) {
			a = a - b;
			quociente++;
		}
		return quociente;
	}

	public int resto(int a, int b) {
		while (a >= b) {
			a = a - b;
		}
		return a;
	}

	public boolean par(int a) {
		return resto(a, 2) == 0;
	}

	public static void main(String[] args) {
		Inteiro inteiro = new Inteiro();
		Scanner scanner = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Multiplicação");
			System.out.println("2 - Potência");
			System.out.println("3 - Divisão");
			System.out.println("4 - Par");
			System.out.println("5 - Sair");

			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					System.out.print("Digite o primeiro número: ");
					int a = scanner.nextInt();
					System.out.print("Digite o segundo número: ");
					int b = scanner.nextInt();
					System.out.println("Resultado: " + inteiro.multiplicacao(a, b));
					break;
				case 2:
					System.out.print("Digite a base: ");
					int base = scanner.nextInt();
					System.out.print("Digite o expoente: ");
					int expoente = scanner.nextInt();
					System.out.println("Resultado: " + inteiro.potencia(base, expoente));
					break;
				case 3:
					System.out.print("Digite o dividendo: ");
					int dividendo = scanner.nextInt();
					System.out.print("Digite o divisor: ");
					int divisor = scanner.nextInt();
					System.out.println("Resultado: " + inteiro.divisao(dividendo, divisor));
					break;
				case 4:
					System.out.print("Digite um número: ");
					int numero = scanner.nextInt();
					System.out.println("É par? " + inteiro.par(numero));
					break;
				case 5:
					System.out.println("Encerrando o programa.");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 5);

		scanner.close();
	}
}