package pratica1quest11dialog;
import javax.swing.JOptionPane;
public class Pratica1Quest11Dialog {

	public static void main(String[] args) {
		
		String numeroInformadoStr = JOptionPane.showInputDialog("Digite o número: ");
		double numeroInformado = Double.parseDouble(numeroInformadoStr);
		
		for(double i = 1; i <= 10; i++)
			JOptionPane.showMessageDialog(null,(numeroInformado + " x " + i + " = " + (numeroInformado * i)));

	}

}
