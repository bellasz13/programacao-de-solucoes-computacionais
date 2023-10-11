package pratica5quest5;
import javax.swing.JOptionPane;
public class Pratica5Questao5 {

	public static void main(String[] args) {
		
		int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            String numeroStr = JOptionPane.showInputDialog("Informe um número inteiro (ou digite '0' para encerrar):");
            int numero = Integer.parseInt(numeroStr);

            if (numero == 0) {
                break; 
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            JOptionPane.showMessageDialog(null, "Nenhum número foi informado.");
        } else {
            JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
        }
	}

}
