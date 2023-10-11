package pratica6quest4;
import java.util.Scanner;
public class Pratica6Questao4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Elementos nas posições pares do vetor:");
        for (int i = 0; i < 10; i += 2) {
            System.out.println(numeros[i]);
        }

        scanner.close();
	}

}
