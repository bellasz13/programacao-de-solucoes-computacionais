package pratica7quest3;
import java.util.Scanner;
public class Pratica7Questao3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int linhas = 2;
        int colunas = 2;

        double[][] matriz1 = new double[linhas][colunas];
        double[][] matriz2 = new double[linhas][colunas];

        System.out.println("Digite os elementos da primeira matriz 2x2:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz2[i][j] = scanner.nextDouble();
            }
        }

        double[][] matrizResultado = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < colunas; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz resultante da multiplicação das duas matrizes:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizResultado[i][j] + "\t");
            }
            System.out.println();
        }

	}

}
