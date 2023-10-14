package repeticaop2q4;

import javax.swing.JOptionPane;

public class DoWhileP2Q4Dialog {

	public static void main(String[] args) {
		
		String entrada; 
		
		do { 
			
			entrada = JOptionPane.showInputDialog("Digite o peso (em kg): ");
	        double peso = Double.parseDouble(entrada);

	        entrada = JOptionPane.showInputDialog("Digite a altura (em metros): ");
	        double altura = Double.parseDouble(entrada);

	        double imc = peso / (altura * altura);
	        
	        if (imc < 20) {
	        	JOptionPane.showMessageDialog(null,"Abaixo do Peso");
	        } else if (imc >= 20 && imc < 25) {
	        	JOptionPane.showMessageDialog(null,"Normal");
	        } else if (imc >= 25 && imc < 30) {
	        	JOptionPane.showMessageDialog(null,"Sobrepeso");
	        } else if (imc >= 30 && imc <= 40) {
	        	JOptionPane.showMessageDialog(null,"Obesidade");
	        } else {
	        	JOptionPane.showMessageDialog(null,"Obesidade Mórbida");
	        }
	        
	        JOptionPane.showMessageDialog(null,"IMC: " + imc);
	        
	        int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION) {
				entrada = "sim";
			} else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION) {
				entrada = "nao";
			}
	} while(entrada.equalsIgnoreCase("sim"));

	System.exit(0);

}

}
