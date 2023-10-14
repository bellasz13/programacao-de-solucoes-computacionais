package repeticaop2q3;

import javax.swing.JOptionPane;

public class DoWhileP2Q3Dialog {

	public static void main(String[] args) {

		String entrada;

		do {

			entrada = JOptionPane.showInputDialog("Digite a primeira nota (0-10): ");
			double nota1 = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite a segunda nota (0-10): ");
			double nota2 = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite a terceira nota (0-10): ");
			double nota3 = Double.parseDouble(entrada);

			if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
				System.out.println("Nota(s) fora do intervalo [0, 10].");
			} else {
				double media = (nota1 + nota2 + nota3) / 3;

				if (media >= 0 && media < 3) {
					JOptionPane.showMessageDialog(null, "REPROVADO");
				} else if (media >= 3 && media < 7) {
					JOptionPane.showMessageDialog(null, "EXAME");
				} else if (media >= 7 && media <= 10) {
					JOptionPane.showMessageDialog(null, "APROVADO");
				}

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
