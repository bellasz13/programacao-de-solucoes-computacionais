package pratica5quest8;
import javax.swing.JOptionPane;
public class Pratica5Questao8 {

	public static void main(String[] args) {
		
		String baseStr = JOptionPane.showInputDialog("Informe a base (primeiro número inteiro):");
        int base = Integer.parseInt(baseStr);

        String expoenteStr = JOptionPane.showInputDialog("Informe o expoente (segundo número inteiro):");
        int expoente = Integer.parseInt(expoenteStr);

        int resultado = 1;

        if (expoente < 0) {
            JOptionPane.showMessageDialog(null, "Expoente negativo não é suportado.");
        } else {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }

            JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é igual a " + resultado);
        }

	}

}
