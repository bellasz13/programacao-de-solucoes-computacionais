package praticaquest3dialog;
import javax.swing.JOptionPane;
public class PraticaQuestao3Dialogo {

	public static void main(String[] args) {
	
    String cotacaoDolarStr = JOptionPane.showInputDialog("Digite a cotação do dólar em real:");
	double cotacaoDolar = Double.parseDouble(cotacaoDolarStr);
	
	String valorDolarStr = JOptionPane.showInputDialog("Digite o valor que você possui em dólar:");
	double valorDolar = Double.parseDouble(valorDolarStr);
			
    double valorReal = valorDolar * cotacaoDolar;

    String mensagem = "O valor em reais é: R$ " + valorReal;
    
    JOptionPane.showMessageDialog(null, mensagem);
}
}