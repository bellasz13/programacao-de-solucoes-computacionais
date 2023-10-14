package repeticaop2q10;

import javax.swing.JOptionPane;

public class DoWhileP2Q10Dialog {

	public static void main(String[] args) {
		
        String entrada; 
		
		do {
		
		entrada = JOptionPane.showInputDialog("Digite o primeiro número: ");
        double numero1 = Double.parseDouble(entrada);

        entrada = JOptionPane.showInputDialog("Digite o segundo número: ");
        double numero2 = Double.parseDouble(entrada);
        
        JOptionPane.showMessageDialog(null,"1 - Somar os dois números.");
        JOptionPane.showMessageDialog(null,"2 - Multiplicar os dois números.");
        JOptionPane.showMessageDialog(null,"3 - Subtrair o número maior pelo número menor.");
        JOptionPane.showMessageDialog(null,"4 - Dividir o primeiro número pelo segundo.");

        entrada = JOptionPane.showInputDialog("Escolha uma operação:");
        int escolha = Integer.parseInt(entrada);
        
        switch (escolha) {
            case 1:
                double soma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "Resultado da soma: " + soma);
                break;
            case 2:
                double multiplicacao = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + multiplicacao);
                break;
            case 3:
                double subtracao = Math.abs(numero1 - numero2);
                JOptionPane.showMessageDialog(null, "Resultado da subtração: " + subtracao);
                break;
            case 4:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da divisão: " + divisao);
                } else {
                	JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
                }
                break;
            default:
            	JOptionPane.showMessageDialog(null, "Opção inválida.");
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
