package repeticaop1q3;

import javax.swing.JOptionPane;

public class DoWhileQ3P1Dialog {

	public static void main(String[] args) {

	String entrada;
	
	do {

		entrada = JOptionPane.showInputDialog("Digite a cotação do dólar em real:");
		double cotacaoDolar = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Digite o valor que você possui em dólar:");
		double valorDolar = Double.parseDouble(entrada);

		double valorReal = valorDolar * cotacaoDolar;

		String mensagem = "O valor em reais é: R$ " + valorReal;

		JOptionPane.showMessageDialog(null, mensagem);

			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);

	}

}
