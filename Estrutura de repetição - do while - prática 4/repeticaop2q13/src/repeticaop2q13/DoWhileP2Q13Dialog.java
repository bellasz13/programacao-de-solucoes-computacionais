package repeticaop2q13;

import javax.swing.JOptionPane;

public class DoWhileP2Q13Dialog {

	public static void main(String[] args) {
		
		String entrada = null;
		
		do {
			
			JOptionPane.showMessageDialog(null,"Tipo de apartamento:");
			JOptionPane.showMessageDialog(null,"1 - Apto Simples");
			JOptionPane.showMessageDialog(null,"2 - Apto Duplo");
			
			entrada = JOptionPane.showInputDialog(null,"Escolha o tipo de apartamento:");
			int tipoap = Integer.parseInt(entrada);

	        int escolhaApto = Integer.parseInt(entrada);
	        double valorDiaria = 0.0;

	        if (escolhaApto == 1 || escolhaApto == 2) {
	        	entrada = JOptionPane.showInputDialog("Digite o número de diárias: ");
	            int numeroDiarias = Integer.parseInt(entrada);

	            if (numeroDiarias < 0) {
	            	JOptionPane.showMessageDialog(null, "Número de diárias não pode ser negativo.");
	                System.exit(0);
	            }

	            if (escolhaApto == 1) {
	                if (numeroDiarias < 10) {
	                    valorDiaria = 100.00;
	                } else if (numeroDiarias >= 10 && numeroDiarias <= 15) {
	                    valorDiaria = 90.00;
	                } else {
	                    valorDiaria = 80.00;
	                }
	            } else if (escolhaApto == 2) {
	                if (numeroDiarias < 10) {
	                    valorDiaria = 140.00;
	                } else if (numeroDiarias >= 10 && numeroDiarias <= 15) {
	                    valorDiaria = 120.00;
	                } else {
	                    valorDiaria = 100.00;
	                }
	            }
	            
	            double totalAPagar = valorDiaria * numeroDiarias;
	            JOptionPane.showMessageDialog(null, "O total a ser pago é: R$" + totalAPagar);
	        } else {
	        	JOptionPane.showMessageDialog(null, "Escolha de tipo de apartamento inválida.");
	        }
	        
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
