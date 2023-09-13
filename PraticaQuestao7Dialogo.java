package praticaquest7dialog;
import javax.swing.JOptionPane;
public class PraticaQuestao7Dialogo {

	public static void main(String[] args) {
		
		String salarioFuncStr = JOptionPane.showInputDialog("Informe o salário do funcionário: ");
		double salarioFunc = Double.parseDouble(salarioFuncStr);
		
		String salarioMinStr = JOptionPane.showInputDialog("Informe o valor do salário mínimo: ");
		double salarioMin = Double.parseDouble(salarioMinStr);
		
		double quantSalarioMin = salarioFunc / salarioMin;
		
		JOptionPane.showMessageDialog(null, "A quantidade de salários mínimos recebidos é/são: " + quantSalarioMin);
	}

}
