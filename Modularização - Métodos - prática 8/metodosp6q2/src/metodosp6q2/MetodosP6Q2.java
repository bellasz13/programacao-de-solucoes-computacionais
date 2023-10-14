package metodosp6q2;
import java.util.Scanner;
public class MetodosP6Q2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double[] numeros = new double[10];

	        preencherNumeros(scanner, numeros);
	        imprimirNumeros(numeros);
	        imprimirPosicoesNegativos(numeros);

	        scanner.close();
	    }

	    public static void preencherNumeros(Scanner scanner, double[] numeros) {
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextDouble();
	        }
	    }

	    public static void imprimirNumeros(double[] numeros) {
	        System.out.println("Números digitados:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(numeros[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void imprimirPosicoesNegativos(double[] numeros) {
	        System.out.println("Posições com números negativos:");
	        for (int i = 0; i < 10; i++) {
	            if (numeros[i] < 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();

	}

}
