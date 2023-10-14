package pratica6questao2;

import java.util.Scanner;

public class Pratica6Questao2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double[] numeros = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = scanner.nextDouble();
		}

		System.out.println("Números digitados:");
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");
		}

		System.out.println("\nPosições com números negativos:");
		for (int i = 0; i < 10; i++) {
			if (numeros[i] < 0) {
				System.out.print(i + " ");
			}
		}

		scanner.close();

	}

}
