package repeticaop1q1;

import javax.swing.JOptionPane;

public class DoWhileQ1P1Dialog {

	public static void main(String[] args) {
		
	String entrada;
	
	do {

		entrada = JOptionPane.showInputDialog("Digite a primeira nota:");
		double nota1 = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Digite a segunda nota:");
		double nota2 = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Digite a terceira nota:");
		double nota3 = Double.parseDouble(entrada);

		double media = (nota1 + nota2 + nota3) / 3.0;

		JOptionPane.showMessageDialog(null, "A média das notas é: " + media);

			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);

	}
}