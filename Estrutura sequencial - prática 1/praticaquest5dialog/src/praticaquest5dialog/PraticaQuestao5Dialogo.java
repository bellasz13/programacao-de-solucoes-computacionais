package praticaquest5dialog;
import javax.swing.JOptionPane;
public class PraticaQuestao5Dialogo {

	public static void main(String[] args) {
		
		String diagonalMaiorStr = JOptionPane.showInputDialog("Informe a maior diagonal do losango: ");
		double diagonalMaior = Double.parseDouble(diagonalMaiorStr);
		
		String diagonalMenorStr = JOptionPane.showInputDialog("Informe a menor diagonal do losango: ");
		double diagonalMenor = Double.parseDouble(diagonalMenorStr);
		
		double area = (diagonalMaior * diagonalMenor) / 2;
		
		JOptionPane.showMessageDialog(null, "A área do losango é: " + area);


	}

}
