package banco;

import java.util.Scanner;

/**
 * Classe principal para testar a conta corrente.
 */
public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ContaCorrente contaCorrente = new ContaCorrente();

			System.out.print("Digite o número da conta: ");
			int numeroConta = scanner.nextInt();

			System.out.print("Digite o número da agência: ");
			int numeroAgencia = scanner.nextInt();

			contaCorrente.iniciarContaCorrente(numeroConta, numeroAgencia);

			System.out.print("Digite o valor para depósito: ");
			double valorDeposito = scanner.nextDouble();
			contaCorrente.depositar(valorDeposito);

			System.out.println("Dados da conta após o depósito:");
			contaCorrente.exibe();

			System.out.print("Digite o valor para saque: ");
			double valorSaque = scanner.nextDouble();
			contaCorrente.sacar(valorSaque);

			System.out.println("Dados da conta após o saque:");
			contaCorrente.exibe();
		}
	}
}