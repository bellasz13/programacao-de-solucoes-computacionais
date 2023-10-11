package pratica5quest11;
import javax.swing.JOptionPane;
public class Pratica5Questao11 {

	public static void main(String[] args) {
		
		 int contadorMasculinoPeso = 0;
	        int contadorFemininoPeso = 0;

	        for (int i = 1; i <= 10; i++) {
	            String sexo = JOptionPane.showInputDialog("Informe o sexo da pessoa " + i + " (m ou f):");
	            double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da pessoa " + i + " (em kg):"));

	            if (sexo.equalsIgnoreCase("m") && peso >= 60 && peso <= 80) {
	                contadorMasculinoPeso++;
	            }

	            if (sexo.equalsIgnoreCase("f") && peso >= 50 && peso <= 70) {
	                contadorFemininoPeso++;
	            }
	        }

	        JOptionPane.showMessageDialog(null, "Total de homens com peso entre 60 e 80 kg: " + contadorMasculinoPeso);
	        JOptionPane.showMessageDialog(null, "Total de mulheres com peso entre 50 e 70 kg: " + contadorFemininoPeso);
	    }
	}
