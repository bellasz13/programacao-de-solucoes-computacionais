package pratica16quest2;

import java.util.Arrays;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] vetor = new int[10];
		System.out.println("Digite 10 números ordenados:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			vetor[i] = scanner.nextInt();
		}

		//ordena o vetor
		Arrays.sort(vetor);

		//loop
		while (true) {
			System.out.print("\nDigite o número a ser pesquisado (ou 0 para sair): ");
			int numeroPesquisado = scanner.nextInt();

			if (numeroPesquisado == 0) {
				
				break;
			}

			int comparacoes = buscaBinaria(vetor, numeroPesquisado);

			if (comparacoes == -1) {
				System.out.println("Número não encontrado.");
			} else {
				System.out.println("Número encontrado na posição " + (comparacoes + 1));
			}

			System.out.println("Número total de comparações: " + comparacoes);
		}

		scanner.close();
	}

	private static int buscaBinaria(int[] vetor, int numero) {
		int inicio = 0;
		int fim = vetor.length - 1;
		int comparacoes = 0;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;

			if (vetor[meio] == numero) {
				return meio;
			} else if (vetor[meio] < numero) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}

			comparacoes++;
		}

		return -1;
	}
}
