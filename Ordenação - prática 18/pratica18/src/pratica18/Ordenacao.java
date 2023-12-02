package pratica18;

import java.util.Arrays;

import java.util.Scanner;

public class Ordenacao {
	;

	//bolha
	public static void bubbleSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
	}
    //seleção
	public static void selectionSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 0; i < n - 1; i++) {
			int indiceMenor = i;
			for (int j = i + 1; j < n; j++) {
				if (vetor[j] < vetor[indiceMenor]) {
					indiceMenor = j;
				}
			}
			if (indiceMenor != i) {
				int temp = vetor[i];
				vetor[i] = vetor[indiceMenor];
				vetor[indiceMenor] = temp;
			}
		}
	}

	//inserção
	public static void insertionSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 1; i < n; i++) {
			int chave = vetor[i];
			int j = i - 1;

			while (j >= 0 && vetor[j] > chave) {
				vetor[j + 1] = vetor[j];
				j--;
			}

			vetor[j + 1] = chave;
		}
	}

	//quickSort
	public static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int indicePivo = particionar(vetor, inicio, fim);
			quickSort(vetor, inicio, indicePivo - 1);
			quickSort(vetor, indicePivo + 1, fim);
		}
	}

	private static int particionar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[fim];
		int i = inicio - 1;

		for (int j = inicio; j < fim; j++) {
			if (vetor[j] < pivo) {
				i++;
				int temp = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = temp;
			}
		}

		int temp = vetor[i + 1];
		vetor[i + 1] = vetor[fim];
		vetor[fim] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nEscolha o método de ordenação:");
			System.out.println("1. Bolha");
			System.out.println("2. Seleção");
			System.out.println("3. Inserção");
			System.out.println("4. QuickSort");
			System.out.println("0. Sair");

			System.out.print("Opção: ");
			int opcao = scanner.nextInt();

			if (opcao == 0) {
				break;
			}

			System.out.println("Digite 10 números para serem ordenados:");
			int[] vetor = new int[10];
			for (int i = 0; i < 10; i++) {
				System.out.print("Número " + (i + 1) + ": ");
				vetor[i] = scanner.nextInt();
			}

			switch (opcao) {
			case 1:
				bubbleSort(vetor);
				break;
			case 2:
				selectionSort(vetor);
				break;
			case 3:
				insertionSort(vetor);
				break;
			case 4:
				quickSort(vetor, 0, vetor.length - 1);
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				continue;
			}

			System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
		}

		scanner.close();
	}
}
