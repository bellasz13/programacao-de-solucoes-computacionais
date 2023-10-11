package pratica5quest6;
import javax.swing.JOptionPane;
public class Pratica5Questao6 {

	public static void main(String[] args) {
		
		 int totalIdades = 0;
	        int quantidadePessoas = 10;

	        for (int i = 1; i <= quantidadePessoas; i++) {
	            String idadeStr = JOptionPane.showInputDialog("Informe a idade da pessoa " + i + ":");
	            int idade = Integer.parseInt(idadeStr);

	            totalIdades += idade;
	        }

	        double media = (double) totalIdades / quantidadePessoas;
	        JOptionPane.showMessageDialog(null, "A média das idades é: " + media);
	    }

	}