package metodosp7q1a;

import java.util.Scanner;

public class MetodosP7Q1a {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int linhas = 5;
		int colunas = 5;
		double[][] matriz = new double[linhas][colunas];

		preencherMatriz(scanner, matriz);
		imprimirMatriz(matriz);

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

	public static void imprimirMatriz(double[][] matriz) {
		System.out.println("Matriz informada:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
