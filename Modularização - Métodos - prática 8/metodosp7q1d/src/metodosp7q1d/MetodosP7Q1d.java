package metodosp7q1d;
import java.util.Scanner;
public class MetodosP7Q1d {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int linhas = 5;
        int colunas = 5;
        double[][] matriz = new double[linhas][colunas];

        preencherMatriz(scanner, matriz);
        trocarDiagonais(matriz);
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

    public static void trocarDiagonais(double[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        for (int i = 0; i < linhas; i++) {
            double temp = matriz[i][i];
            matriz[i][i] = matriz[i][colunas - 1 - i];
            matriz[i][colunas - 1 - i] = temp;
        }
    }

    public static void imprimirMatriz(double[][] matriz) {
        System.out.println("Matriz resultante após trocar diagonais:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

	}

}
