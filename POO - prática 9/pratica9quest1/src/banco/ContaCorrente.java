package banco;

/**
 * Representa a conta corrente de um banco
 */
public class ContaCorrente {

	private int numero, agencia;
	private double saldo;

	/**
	 * Inicializa uma conta corrente número, agência e saldo.
	 * 
	 * @param n  Número da conta
	 * @param ag Número da agência
	 */
	public void iniciarContaCorrente(int n, int ag) {
		numero = n;
		agencia = ag;
		saldo = 0;
	}

	/**
	 * Realiza um saque na conta.
	 * 
	 * @param valor Valor a ser sacado.
	 */
	public void sacar(double valor) {
		// Verifica se tem dinheiro suficiente para ser sacado.
		saldo = saldo - valor;
		// Realiza o saque
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
		// Valor a ser depositado
	}

	public double consultarSaldo() {
		return (saldo);
		// Consulta saldo atual.

	}

	/**
	 * Mostra os dados da conta.
	 */

	public void exibe() {
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + numero);
		System.out.println("Saldo: R$ " + saldo);
	}

}
