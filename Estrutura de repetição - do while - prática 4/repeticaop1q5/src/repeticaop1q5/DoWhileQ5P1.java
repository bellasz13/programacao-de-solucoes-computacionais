package repeticaop1q5;
import javax.swing.JOptionPane;
public class DoWhileQ5P1 {

	public static void main(String[] args) {

		String entrada;
		
		do {
		
			entrada = JOptionPane.showInputDialog("Informe a maior diagonal do losango: ");
			double diagonalMaior = Double.parseDouble(entrada);
			
			entrada = JOptionPane.showInputDialog("Informe a menor diagonal do losango: ");
			double diagonalMenor = Double.parseDouble(entrada);
			
			double area = (diagonalMaior * diagonalMenor) / 2;
			
			JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
			
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);

	}

}
