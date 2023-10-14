package repeticaop2q1;

import javax.swing.JOptionPane;

public class DoWhileP2Q1Dialog {

	public static void main(String[] args) {
		
		String entrada;
		
		 do {
	            entrada = JOptionPane.showInputDialog("Digite a primeira nota: ");
	            double nota1 = Double.parseDouble(entrada);

	            entrada = JOptionPane.showInputDialog("Digite a segunda nota: ");
	            double nota2 = Double.parseDouble(entrada);

	            double media = (nota1 + nota2) / 2;

	            if (media >= 7.0) {
	                JOptionPane.showMessageDialog(null, "Aprovado! Média: " + media);
	            } else {
	                JOptionPane.showMessageDialog(null, "Reprovado. Média: " + media);

	                int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	                if (resp == JOptionPane.YES_OPTION) {
	                    entrada = "sim";
	                } else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION) {
	                    entrada = "nao";
	                }
	            }
	        } while (entrada.equalsIgnoreCase("sim"));

	        System.exit(0);
	            
		}
	        
	}