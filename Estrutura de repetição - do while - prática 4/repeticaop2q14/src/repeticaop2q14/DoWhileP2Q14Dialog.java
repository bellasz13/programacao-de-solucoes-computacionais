package repeticaop2q14;

import javax.swing.JOptionPane;

public class DoWhileP2Q14Dialog {

	public static void main(String[] args) {
		
		String entrada;
		
		do {
			
			JOptionPane.showMessageDialog(null,"Comandos Git:");
			JOptionPane.showMessageDialog(null,"1 - git clone");
			JOptionPane.showMessageDialog(null,"2 - git fetch");
			JOptionPane.showMessageDialog(null,"3 - git pull");
			
			entrada = JOptionPane.showInputDialog("Escolha um comando Git para obter uma explicação e um exemplo:");
	        int escolha = Integer.parseInt(entrada);

	        int escolhaComando = Integer.parseInt(entrada);

	        switch (escolhaComando) {
	            case 1:
	            	JOptionPane.showMessageDialog(null,"Comando Git: git clone");
	            	JOptionPane.showMessageDialog(null,"Explicação: O comando 'git clone' é usado para criar uma cópia local de um repositório Git remoto.");
	            	JOptionPane.showMessageDialog(null,"Exemplo: git clone https://github.com/seu-usuario/seu-repositorio.git");
	                break;
	            case 2:
	            	JOptionPane.showMessageDialog(null,"Comando Git: git fetch");
	            	JOptionPane.showMessageDialog(null,"Explicação: O comando 'git fetch' é usado para baixar informações de um repositório remoto sem mesclar as alterações com seu repositório local.");
	            	JOptionPane.showMessageDialog(null,"Exemplo: git fetch origin");
	                break;
	            case 3:
	            	JOptionPane.showMessageDialog(null,"Comando Git: git pull");
	            	JOptionPane.showMessageDialog(null,"Explicação: O comando 'git pull' é usado para buscar as alterações de um repositório remoto e mesclá-las automaticamente com seu repositório local.");
	            	JOptionPane.showMessageDialog(null,"Exemplo: git pull origin master");
	                break;
	            default:
	            	JOptionPane.showMessageDialog(null,"Comando inválido.");
	                break;
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
