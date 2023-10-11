package pratica7quest2;
import java.util.Scanner;
public class Pratica7Questao2 {

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
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz resultante da soma das duas matrizes:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizResultado[i][j] + "\t");
            }
            System.out.println();
        }
	}

}
