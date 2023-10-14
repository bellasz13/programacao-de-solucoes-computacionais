package repeticaop1q9;
import javax.swing.JOptionPane;
public class DoWhileQ9P1Dialog {

	public static void main(String[] args) {

		String entrada;
		
		do {
			
			entrada = JOptionPane.showInputDialog("Informe o cateto oposto: ");
			double catetoOposto = Double.parseDouble(entrada);
			
			entrada = JOptionPane.showInputDialog("Informe o cateto adjacente: ");
			double catetoAdjacente = Double.parseDouble(entrada);
			
		    double hipotenusa = catetoAdjacente *  catetoAdjacente + catetoOposto * catetoOposto;
		    
		    JOptionPane.showMessageDialog(null,("A hipotenusa é: " + hipotenusa));
			
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);
	}

}
