package while4;

import java.util.Scanner;

public class Pratica3While4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double somaSalarios = 0;
		int somaFilhos = 0;
		int contador = 0;

		System.out.println("Pesquisa da Prefeitura - Digite o salário (ou um valor negativo para encerrar): ");
		double salario = input.nextDouble();

		while (salario >= 0) {
			// Solicita o número de filhos
			System.out.print("Digite o número de filhos: ");
			int numFilhos = input.nextInt();

			// Atualiza as somas
			somaSalarios += salario;
			somaFilhos += numFilhos;
			contador++;

			// Lê o próximo salário
			System.out.println("Digite o salário (ou um valor negativo para encerrar): ");
			salario = input.nextDouble();
		}

		input.close();

		if (contador > 0) {
			double mediaSalarios = somaSalarios / contador;
			double mediaFilhos = (double) somaFilhos / contador;

			System.out.println("Média Salarial da População: " + mediaSalarios);
			System.out.println("Média do Número de Filhos: " + mediaFilhos);
		} else {
			System.out.println("Nenhum dado foi inserido.");
		}
	}

}
