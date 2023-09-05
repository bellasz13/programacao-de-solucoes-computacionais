package praticaquest3dialog;
import javax.swing.JOptionPane;
public class PraticaQuestao3Dialogo {

	public static void main(String[] args) {
	//Solicita a cotação do dólar em real
    String cotacaoDolarStr = JOptionPane.showInputDialog("Digite a cotação do dólar em real:");
	double cotacaoDolar = Double.parseDouble(cotacaoDolarStr);
	
	//Solicita o valor que o usuário possui em dólar
	String valorDolarStr = JOptionPane.showInputDialog("Digite o valor que você possui em dólar:");
	double valorDolar = Double.parseDouble(valorDolarStr);
			
	//Calcula o valor em real
    double valorReal = valorDolar * cotacaoDolar;
    
    // Monta a mensagem
    String mensagem = "O valor em reais é: R$ " + valorReal;

    // Exibe a mensagem em uma caixa de diálogo
    
    JOptionPane.showMessageDialog(null, mensagem);
}
}