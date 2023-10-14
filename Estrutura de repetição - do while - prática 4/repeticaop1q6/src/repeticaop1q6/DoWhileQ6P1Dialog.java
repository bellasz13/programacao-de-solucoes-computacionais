package repeticaop1q6;

import javax.swing.JOptionPane;

public class DoWhileQ6P1Dialog {

	public static void main(String[] args) {
		
        String entrada;
		
		do {

			entrada = JOptionPane.showInputDialog("Informe a temperatura em Celsius: ");
			double tempC = Double.parseDouble(entrada);
			
			double tempF = (tempC * 1.8) + 32;
			
			JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + tempF);
			
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);
	}

}
