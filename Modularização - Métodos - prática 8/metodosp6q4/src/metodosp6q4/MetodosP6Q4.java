package metodosp6q4;
import java.util.Scanner;
public class MetodosP6Q4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        preencherNumeros(scanner, numeros);
        imprimirElementosPares(numeros);

        scanner.close();
    }

    public static void preencherNumeros(Scanner scanner, double[] numeros) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
    }

    public static void imprimirElementosPares(double[] numeros) {
        System.out.println("Elementos nas posições pares do vetor:");
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

	}

}
