package metodosp7q1b;

import java.util.Scanner;

public class MetodosP7Q1b {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int linhas = 5;
		int colunas = 5;
		double[][] matriz = new double[linhas][colunas];

		preencherMatriz(scanner, matriz);
		imprimirElementosLinhasParesColunasImpares(matriz);

		scanner.close();
	}

	public static void preencherMatriz(Scanner scanner, double[][] matriz) {
		System.out.println("Digite os elementos da matriz 5x5:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz[i][j] = scanner.nextDouble();
			}
		}
	}

	public static void imprimirElementosLinhasParesColunasImpares(double[][] matriz) {
		System.out.println("Elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i % 2 == 0 && j % 2 != 0) {
					System.out.print(matriz[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}

}
