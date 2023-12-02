package pratica16quest3;

import java.util.Arrays;

import java.util.Scanner;

public class Conjuntos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//primeira sequência de números
		int[] sequenciaA = lerSequencia(scanner);

		//segunda sequência de números
		int[] sequenciaB = lerSequencia(scanner);

		//ordena as sequências
		Arrays.sort(sequenciaA);
		Arrays.sort(sequenciaB);

		int[] conjuntoA = gerarConjunto(sequenciaA);
		int[] conjuntoB = gerarConjunto(sequenciaB);

		int[] conjuntoC = uniaoConjuntos(conjuntoA, conjuntoB);

		System.out.println("\nConjunto A: " + Arrays.toString(conjuntoA));
		System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));
		System.out.println("Conjunto C (união de A e B): " + Arrays.toString(conjuntoC));

		scanner.close();
	}

	private static int[] lerSequencia(Scanner scanner) {
		System.out.print("Digite a quantidade de números na sequência: ");
		int tamanho = scanner.nextInt();

		int[] sequencia = new int[tamanho];

		System.out.println("Digite os números da sequência:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			sequencia[i] = scanner.nextInt();
		}

		return sequencia;
	}

	private static int[] gerarConjunto(int[] sequencia) {
		int tamanho = sequencia.length;
		int[] conjunto = new int[tamanho];
		int indiceConjunto = 0;

		for (int i = 0; i < tamanho; i++) {

			if (buscaBinaria(conjunto, sequencia[i]) == -1) {
				conjunto[indiceConjunto] = sequencia[i];
				indiceConjunto++;
			}
		}

		return Arrays.copyOf(conjunto, indiceConjunto);
	}

	private static int[] uniaoConjuntos(int[] conjuntoA, int[] conjuntoB) {
		int tamanhoA = conjuntoA.length;
		int tamanhoB = conjuntoB.length;
		int[] conjuntoC = new int[tamanhoA + tamanhoB];
		int indiceC = 0;

		for (int i = 0; i < tamanhoA; i++) {
			conjuntoC[indiceC] = conjuntoA[i];
			indiceC++;
		}

		for (int i = 0; i < tamanhoB; i++) {
			if (buscaBinaria(conjuntoA, conjuntoB[i]) == -1) {
				conjuntoC[indiceC] = conjuntoB[i];
				indiceC++;
			}
		}

		return Arrays.copyOf(conjuntoC, indiceC);
	}

	//binária
	private static int buscaBinaria(int[] vetor, int numero) {
		int inicio = 0;
		int fim = vetor.length - 1;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;

			if (vetor[meio] == numero) {
				return meio;
			} else if (vetor[meio] < numero) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}

		return -1;
	}
}
