package repeticaop2q6;

import javax.swing.JOptionPane;

public class DoWhileP2Q6Dialog {

	public static void main(String[] args) {

		String entrada;

		do {

			entrada = JOptionPane.showInputDialog("Informe o primeiro lado em cm: ");
			double a = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Informe o segundo lado em cm: ");
			double b = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Informe o terceiro lado em cm: ");
			double c = Double.parseDouble(entrada);

			boolean condicao1 = Math.abs(b - c) < a && a < b + c;
			boolean condicao2 = Math.abs(a - c) < b && b < a + c;
			boolean condicao3 = Math.abs(a - b) < c && c < a + b;

			boolean podeSerTriangulo = condicao1 && condicao2 && condicao3;

			if (podeSerTriangulo) {
				JOptionPane.showMessageDialog(null,
						"Resposta: os três valores informados podem ser os comprimentos dos lados de um triângulo.");
			} else {
				JOptionPane.showMessageDialog(null,
						"Resposta: os três valores informados NÃO podem ser os comprimentos dos lados de um triângulo.");
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
