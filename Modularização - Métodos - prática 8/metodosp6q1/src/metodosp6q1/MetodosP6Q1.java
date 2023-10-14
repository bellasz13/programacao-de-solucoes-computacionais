package metodosp6q1;
import java.util.Scanner;
public class MetodosP6Q1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        preencherVetor(scanner, vetor);
        imprimirVetor(vetor);
        calcularSomaPares(vetor);

        scanner.close();
    }

    public static void preencherVetor(Scanner scanner, int[] vetor) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void calcularSomaPares(int[] vetor) {
        int somaPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
            }
        }
        System.out.println("Soma dos números pares: " + somaPares);
	}

}
