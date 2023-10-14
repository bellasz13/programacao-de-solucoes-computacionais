package repeticaop2q12;

import javax.swing.JOptionPane;

public class DoWhileP2Q12Dialog {

	public static void main(String[] args) {
		
		String entrada;
		
		do {
			
			entrada = JOptionPane.showInputDialog("Digite a idade do cliente: ");
	        int idade = Integer.parseInt(entrada);

	        entrada = JOptionPane.showInputDialog("Digite o sexo do cliente (H para homem, M para mulher): ");
	        char sexo = entrada.charAt(0);

	        double mensalidade = 0.00;

	        if (sexo == 'H' || sexo == 'h') { 
	            if (idade <= 15) {
	                mensalidade = 60.00;
	            } else if (idade >= 16 && idade <= 18) {
	                mensalidade = 75.00;
	            } else if (idade >= 19 && idade <= 30) {
	                mensalidade = 90.00;
	            } else if (idade >= 31 && idade <= 40) {
	                mensalidade = 85.00;
	            } else {
	                mensalidade = 80.00;
	            }
	        } else if (sexo == 'M' || sexo == 'm') { 
	            if (idade <= 18) {
	                mensalidade = 60.00;
	            } else if (idade >= 19 && idade <= 25) {
	                mensalidade = 90.00;
	            } else if (idade >= 26 && idade <= 40) {
	                mensalidade = 85.00;
	            } else {
	                mensalidade = 80.00;
	            }
	        } else {
	        	JOptionPane.showMessageDialog(null,"Sexo inválido. Use H para homem ou M para mulher.");
	            
	        }

	        JOptionPane.showMessageDialog(null,"A mensalidade a ser paga é: R$" + mensalidade);
	        
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
