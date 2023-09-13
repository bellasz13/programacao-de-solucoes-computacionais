package praticaquest6dialog;
import javax.swing.JOptionPane;
public class PraticaQuestao6Dialogo {

	public static void main(String[] args) {

		String tempCStr = JOptionPane.showInputDialog("Informe a temperatura em Celsius: ");
		double tempC = Double.parseDouble(tempCStr);
		
		double tempF = (tempC * 1.8) + 32;
		
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + tempF);

	}

}