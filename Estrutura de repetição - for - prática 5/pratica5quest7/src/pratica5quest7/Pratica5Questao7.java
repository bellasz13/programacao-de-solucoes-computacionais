package pratica5quest7;
import javax.swing.JOptionPane;
public class Pratica5Questao7 {

	public static void main(String[] args) {
		
		 int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;

	        for (int i = 1; i <= 10; i++) {
	            String numeroStr = JOptionPane.showInputDialog("Informe o número inteiro " + i + ":");
	            int numero = Integer.parseInt(numeroStr);

	            if (numero > maior) {
	                maior = numero;
	            }

	            if (numero < menor) {
	                menor = numero;
	            }
	        }

	        JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);

	}

}
