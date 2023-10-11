package pratica5quest12;
import javax.swing.JOptionPane;
public class Pratica5Questao12 {

	public static void main(String[] args) {
		
		 int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
	        String tabuada = "";

	        for (int i = 0; i <= 10; i++) {
	            int resultado = numero * i;
	            tabuada += numero + " x " + i + " = " + resultado + "\n";
	        }

	        JOptionPane.showMessageDialog(null, tabuada);
	        }
	    }
