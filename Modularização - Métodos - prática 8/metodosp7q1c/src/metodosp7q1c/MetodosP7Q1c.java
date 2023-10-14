package metodosp7q1c;

import java.util.Scanner;

public class MetodosP7Q1c {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int linhas = 5;
		int colunas = 5;
		double[][] matriz = new double[linhas][colunas];

		preencherMatriz(scanner, matriz);

		double[][] matrizTransposta = calcularMatrizTransposta(matriz, linhas, colunas);

		imprimirMatrizTransposta(matrizTransposta, colunas, linhas);

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

	public static double[][] calcularMatrizTransposta(double[][] matriz, int linhas, int colunas) {
		double[][] matrizTransposta = new double[colunas][linhas];
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		return matrizTransposta;
	}

	public static void imprimirMatrizTransposta(double[][] matrizTransposta, int linhas, int colunas) {
		System.out.println("Matriz transposta:");
		for (int i = 0; i < colunas; i++) {
			for (int j = 0; j < linhas; j++) {
				System.out.print(matrizTransposta[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
