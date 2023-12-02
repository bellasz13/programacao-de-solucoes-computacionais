package pratica16;

import java.util.Scanner;

public class BuscaSequencial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] vetor = new int[10];
		System.out.println("Digite 10 números:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			vetor[i] = scanner.nextInt();
		}

		// loop 
		while (true) {
			System.out.println("\nEscolha o algoritmo de busca:");
			System.out.println("1. Busca Sequencial");
			System.out.println("2. Busca Sequencial com Sentinela");
			System.out.println("0. Sair");
			System.out.print("Opção: ");
			int opcao = scanner.nextInt();

			if (opcao == 0) {
				
				break;
			}

			System.out.print("Digite o número a ser pesquisado: ");
			int numeroPesquisado = scanner.nextInt();

			int comparacoes = 0;
			boolean encontrado = false;

			switch (opcao) {
			case 1:
				comparacoes = buscaSequencial(vetor, numeroPesquisado);
				break;
			case 2:
				comparacoes = buscaSequencialComSentinela(vetor, numeroPesquisado);
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				continue;
			}

			if (comparacoes == -1) {
				System.out.println("Número não encontrado.");
			} else {
				System.out.println("Número encontrado na posição " + (comparacoes + 1));
			}

			System.out.println("Número total de comparações: " + comparacoes);
		}

		scanner.close();
	}

	// sequencial
	private static int buscaSequencial(int[] vetor, int numero) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				return i;
			}
		}
		return -1;
	}

	//sequencial com sentinela
	private static int buscaSequencialComSentinela(int[] vetor, int numero) {
		int tamanho = vetor.length;
		vetor[tamanho - 1] = numero; //número a ser pesquisado vai para o final do vetor como sentinela

		int i = 0;
		while (vetor[i] != numero) {
			i++;
		}

		if (i < tamanho - 1) {
			return i;
		} else {
			return -1;
		}
	}
}