package metodosp6q3;
import java.util.Scanner;
public class MetodosP6Q3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        preencherNumeros(scanner, numeros);
        double menor = encontrarMenorNumero(numeros);
        double maior = encontrarMaiorNumero(numeros);
        imprimirNumeros(numeros);
        imprimirMenorEMaior(menor, maior);

        scanner.close();
    }

    public static void preencherNumeros(Scanner scanner, double[] numeros) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            numeros[i] = scanner.nextDouble();
        }
    }

    public static double encontrarMenorNumero(double[] numeros) {
        double menor = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static double encontrarMaiorNumero(double[] numeros) {
        double maior = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static void imprimirNumeros(double[] numeros) {
        System.out.println("Números informados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void imprimirMenorEMaior(double menor, double maior) {
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

	}

}
