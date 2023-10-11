package pratica7quest1B;
import java.util.Scanner;
public class Pratica7Questao1B {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int linhas = 5;
        int colunas = 5;

        double[][] matriz = new double[linhas][colunas];

        System.out.println("Digite os elementos da matriz 5x5:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
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
