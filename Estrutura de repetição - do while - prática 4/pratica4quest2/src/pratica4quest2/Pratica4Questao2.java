package pratica4quest2;

import javax.swing.JOptionPane;

public class Pratica4Questao2 {

	public static void main(String[] args) {
		String entrada = null;

		do {
			double nota = 0;
			double salario = 0;
			String sexo = "";
			int idade = 0;

			while (true) {
				String notaStr = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10):");
				try {
					nota = Double.parseDouble(notaStr);
					if (nota >= 0 && nota <= 10) {
						break;
					}
				} catch (NumberFormatException e) {

				}
			}

			while (true) {
				String salarioStr = JOptionPane.showInputDialog("Informe o salário (maior que zero):");
				try {
					salario = Double.parseDouble(salarioStr);
					if (salario > 0) {
						break;
					}
				} catch (NumberFormatException e) {

				}
			}

			while (true) {
				String sexoStr = JOptionPane.showInputDialog("Informe o sexo (m ou f):");
				if (sexoStr.equals("m") || sexoStr.equals("f")) {
					sexo = sexoStr;
					break;
				}
			}

			while (true) {
				String idadeStr = JOptionPane.showInputDialog("Informe a idade (entre 0 e 120):");
				try {
					idade = Integer.parseInt(idadeStr);
					if (idade >= 0 && idade <= 120) {
						break;
					}
				} catch (NumberFormatException e) {

				}
			}

			JOptionPane.showMessageDialog(null, "Dados válidos. Sucesso!");

			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));

		System.exit(0);

	}

}
