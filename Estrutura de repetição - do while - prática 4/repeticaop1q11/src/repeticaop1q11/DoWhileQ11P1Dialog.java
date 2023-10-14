package repeticaop1q11;
import javax.swing.JOptionPane;
public class DoWhileQ11P1Dialog {

	public static void main(String[] args) {

		String entrada;
		
		do {
			
			entrada = JOptionPane.showInputDialog("Digite o número: ");
			double numeroInformado = Double.parseDouble(entrada);
			
			for(double i = 1; i <= 10; i++)
				JOptionPane.showMessageDialog(null,(numeroInformado + " x " + i + " = " + (numeroInformado * i)));
		
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);

	}

}
