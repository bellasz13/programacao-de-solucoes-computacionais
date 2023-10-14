package repeticaop1q2;

import javax.swing.JOptionPane;

public class DoWhileQ2P1Dialog {

	public static void main(String[] args) {
		
	String entrada;
		
	do {
			
		entrada = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        int anoNascimento = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Digite o ano atual:");
        int anoAtual = Integer.parseInt(entrada);

        int idadeAtual = anoAtual - anoNascimento;

        int ano2050 = 2050;
        int idade2050 = ano2050 - anoNascimento;

        String mensagemAtual = "A idade da pessoa no ano atual é: " + idadeAtual + " anos.";
        String mensagem2050 = "A idade que a pessoa terá em 2050 será: " + idade2050 + " anos.";

        JOptionPane.showMessageDialog(null, mensagemAtual);
        JOptionPane.showMessageDialog(null, mensagem2050);

            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("sim"));
        System.exit(0);
	}
	
  }
