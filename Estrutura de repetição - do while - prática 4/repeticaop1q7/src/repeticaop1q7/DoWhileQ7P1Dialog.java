package repeticaop1q7;
import javax.swing.JOptionPane;
public class DoWhileQ7P1Dialog {

	public static void main(String[] args) {

		String entrada;
		
		do {
			entrada = JOptionPane.showInputDialog("Informe o salário do funcionário: ");
			double salarioFunc = Double.parseDouble(entrada);
			
			entrada = JOptionPane.showInputDialog("Informe o valor do salário mínimo: ");
			double salarioMin = Double.parseDouble(entrada);
			
			double quantSalarioMin = salarioFunc / salarioMin;
			
			JOptionPane.showMessageDialog(null, "A quantidade de salários mínimos recebidos é/são: " + quantSalarioMin);
			
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);
	}

}
