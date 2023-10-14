package repeticaop1q8;
import javax.swing.JOptionPane;
public class DoWhileQ8P1Dialog {

	public static void main(String[] args) {

		String entrada;
		
		do {
			
			entrada = JOptionPane.showInputDialog("Digite seu peso em KG: ");
			double pesoInformado = Double.parseDouble(entrada);
			
			double pesoGanho = (pesoInformado * 0.15) + pesoInformado;
			double pesoPerdido = pesoInformado - (pesoInformado * 0.20);
			
			JOptionPane.showMessageDialog(null,("Seu peso após ganhar 15%: " + pesoGanho));
			JOptionPane.showMessageDialog(null,("Seu peso após perder 20%: "+ pesoPerdido));
			
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);
	}

}
