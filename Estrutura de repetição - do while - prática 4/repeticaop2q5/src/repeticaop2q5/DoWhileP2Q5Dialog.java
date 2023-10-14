package repeticaop2q5;

import javax.swing.JOptionPane;

public class DoWhileP2Q5Dialog {

	public static void main(String[] args) {

		String entrada;

		do {

			entrada = JOptionPane.showInputDialog("Digite um valor para x: ");
			double x = Double.parseDouble(entrada);

			double resultado;

			if (x < -2) {
				JOptionPane.showMessageDialog(null, 2 * x + 2);
			} else if (x <= -2 && x < 3) {
				JOptionPane.showMessageDialog(null, resultado = 3);
			} else {
				JOptionPane.showMessageDialog(null, -x);
			}

			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION) {
				entrada = "sim";
			} else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION) {
				entrada = "nao";
			}
		} while (entrada.equalsIgnoreCase("sim"));

		System.exit(0);

	}

}
