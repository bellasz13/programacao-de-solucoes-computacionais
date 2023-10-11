package pratica5quest9;
import javax.swing.JOptionPane;
public class Pratica5Questao9 {

	public static void main(String[] args) {
		
		String numeroStr = JOptionPane.showInputDialog("Informe um número inteiro:");
        int numero = Integer.parseInt(numeroStr);

        StringBuilder mensagem = new StringBuilder("Números ímpares de 1 até " + numero + ":\n");

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                mensagem.append(i).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
        
	}

}
