package repeticaop2q9;

import javax.swing.JOptionPane;

public class DoWhileP2Q9Dialog {

	public static void main(String[] args) {

		String entrada = null;

		do {

			double[] gravidades = { 3.7, 8.8, 9.8, 3.8, 26.4, 11.5, 9.3, 12.2, 0.6 };
			String[] planetas = { "Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno",
					"Plutão" };

			for (int i = 0; i < planetas.length; i++) {
				JOptionPane.showMessageDialog(null, (i + 1) + " - " + planetas[i]);
				
			}

			entrada = JOptionPane.showInputDialog("Escolha um planeta para jogar a bola:");
			
			int escolhaPlaneta = Integer.parseInt(entrada);
			double g = gravidades[escolhaPlaneta - 1];
			
			entrada = JOptionPane.showInputDialog("Digite a velocidade inicial (v0) em m/s: ");
			double v0 = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite o instante (t) em segundos: ");
			double t = Double.parseDouble(entrada);

			double v = v0 + g * t;
			double h = v0 * t + 0.5 * g * t * t;

			JOptionPane.showMessageDialog(null, "Velocidade da bola no instante t: " + v + " m/s");
			JOptionPane.showMessageDialog(null, "Altura da bola acima do lançamento no instante t: " + h + " metros");

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
