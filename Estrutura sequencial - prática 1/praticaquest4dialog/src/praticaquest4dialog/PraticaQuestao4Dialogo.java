package praticaquest4dialog;
import javax.swing.JOptionPane;
public class PraticaQuestao4Dialogo {

	public static void main(String[] args) {
		
		String salarioStr = JOptionPane.showInputDialog("Digite seu salário: ");
		double salario = Double.parseDouble(salarioStr);
		
		double aumento = (salario * 0.25) + salario;
		
		JOptionPane.showMessageDialog(null, "Seu novo salário é: " + aumento);

	}

}
