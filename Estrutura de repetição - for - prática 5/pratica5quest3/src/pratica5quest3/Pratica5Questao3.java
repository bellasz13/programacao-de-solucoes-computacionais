package pratica5quest3;
import javax.swing.JOptionPane;
public class Pratica5Questao3 {

	public static void main(String[] args) {
		
		String numeroStr = JOptionPane.showInputDialog("Informe um número natural:");
        int numero = Integer.parseInt(numeroStr);

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Número inválido. O número deve ser não negativo.");
        } else {
            long fatorial = 1; 

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            JOptionPane.showMessageDialog(null, numero + "! = " + fatorial);
        }

	}

}
