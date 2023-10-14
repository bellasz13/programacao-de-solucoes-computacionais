package repeticaop1q4;
import javax.swing.JOptionPane;
public class DoWhileQ4P1Dialog {

	public static void main(String[] args) {
		
		String entrada;
		
		do {
			
			entrada = JOptionPane.showInputDialog("Digite seu salário: ");
			double salario = Double.parseDouble(entrada);
			
			double aumento = (salario * 0.25) + salario;
			
			JOptionPane.showMessageDialog(null, "Seu novo salário é: " + aumento);
			
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);


		}
	}
