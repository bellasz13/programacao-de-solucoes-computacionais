package repeticaop2q2;

import javax.swing.JOptionPane;

public class DoWhileP2Q2Dialog {

	public static void main(String[] args) {

		String entrada;

		do {

			entrada = JOptionPane.showInputDialog("Digite o comprimento do primeiro lado: ");
			double lado1 = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite o comprimento do segundo lado: ");
			double lado2 = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite o comprimento do terceiro lado: ");
			double lado3 = Double.parseDouble(entrada);

			if (lado1 == lado2 && lado2 == lado3) {
				JOptionPane.showMessageDialog(null, "Triângulo Equilátero: os três lados são iguais.");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				JOptionPane.showMessageDialog(null, "Triângulo Isósceles: 2 lados são iguais.");
			} else {
				JOptionPane.showMessageDialog(null, "Triângulo Escaleno: 3 lados diferentes.");

				int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if (resp == JOptionPane.YES_OPTION) {
					entrada = "sim";
				} else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION) {
					entrada = "nao";
				}
			}
		} while (entrada.equalsIgnoreCase("sim"));

		System.exit(0);

	}

}
