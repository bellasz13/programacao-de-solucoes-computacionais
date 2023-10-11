package pratica5quest4;
import javax.swing.JOptionPane;
public class Pratica5Questao4 {

	public static void main(String[] args) {
		
		 int totalIdades = 0;
	        int contador = 0;

	        while (true) {
	            String idadeStr = JOptionPane.showInputDialog("Informe a idade (ou digite '0' para encerrar):");
	            int idade = Integer.parseInt(idadeStr);

	            if (idade == 0) {
	                break; 
	            }

	            totalIdades += idade;
	            contador++;
	        }

	        if (contador > 0) {
	            double media = (double) totalIdades / contador;
	            JOptionPane.showMessageDialog(null, "A média das idades é: " + media);
	        } else {
	            JOptionPane.showMessageDialog(null, "Nenhuma idade foi informada.");
	        }

	}

}
