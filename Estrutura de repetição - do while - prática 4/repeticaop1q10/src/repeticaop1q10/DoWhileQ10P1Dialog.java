package repeticaop1q10;
import javax.swing.JOptionPane;
public class DoWhileQ10P1Dialog {

	public static void main(String[] args) {

		String entrada;
		
		do {
			
			entrada = JOptionPane.showInputDialog("Informe o raio: ");
			double raio = Double.parseDouble(entrada);

			double comprimentoDaEsfera = 2 * 3.14 * raio;
			
			double areaDaEsfera = 3.14 * (raio * raio);
			
			double volumeDaEsfera = 0.75 * 3.14 * (raio * raio * raio);
			
			JOptionPane.showMessageDialog(null,("O comprimento da esfera é: " +  comprimentoDaEsfera ));
			JOptionPane.showMessageDialog(null,("A área da esfera é: " + areaDaEsfera));
			JOptionPane.showMessageDialog(null,("O volume da esfera é: " + volumeDaEsfera));
			
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);
		
	}

}
