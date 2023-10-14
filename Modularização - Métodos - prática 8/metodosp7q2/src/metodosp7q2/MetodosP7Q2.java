package metodosp7q2;

import java.util.Scanner;

public class MetodosP7Q2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int linhas = 2;
		int colunas = 2;
		double[][] matriz1 = new double[linhas][colunas];
		double[][] matriz2 = new double[linhas][colunas];

		preencherMatriz(scanner, matriz1, "primeira", linhas, colunas);
		preencherMatriz(scanner, matriz2, "segunda", linhas, colunas);

		double[][] matrizResultado = somarMatrizes(matriz1, matriz2, linhas, colunas);

		imprimirMatriz(matrizResultado, linhas, colunas);

		scanner.close();
	}

	public static void preencherMatriz(Scanner scanner, double[][] matriz, String nome, int linhas, int colunas) {
		System.out.println("Digite os elementos da " + nome + " matriz " + linhas + "x" + colunas + ":");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz[i][j] = scanner.nextDouble();
			}
		}
	}

	public static double[][] somarMatrizes(double[][] matriz1, double[][] matriz2, int linhas, int colunas) {
		double[][] matrizResultado = new double[linhas][colunas];
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return matrizResultado;
	}

	public static void imprimirMatriz(double[][] matriz, int linhas, int colunas) {
		System.out.println("Matriz resultante da soma das duas matrizes:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
