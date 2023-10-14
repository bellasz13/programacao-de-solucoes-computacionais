package repeticaop2q11;
import javax.swing.JOptionPane;
public class DoWhileP2Q11Dialog {

	public static void main(String[] args) {
		
		String entrada;
		
		do {
			
			entrada = JOptionPane.showInputDialog("Digite o número de diárias: ");
	        int numeroDiarias = Integer.parseInt(entrada);

	        double valorDiaria = 500.00;
	        double taxaServico = 0.00;

	        if (numeroDiarias < 15) {
	            taxaServico = 15.00;
	        } else if (numeroDiarias == 15) {
	            taxaServico = 10.00;
	        } else {
	            taxaServico = 5.00;
	        }

	        double totalAPagar = (valorDiaria + taxaServico) * numeroDiarias;

	        JOptionPane.showMessageDialog(null,"Total a ser pago pelo cliente: R$" + totalAPagar);
	        
	        int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION) {
				entrada = "sim";
			} else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION) {
				entrada = "nao";
			}
		} while (entrada.equalsIgnoreCase("sim"));

		System.exit(0);

	}

}
