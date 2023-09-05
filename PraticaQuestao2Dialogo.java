package praticaquest2dialog;
import javax.swing.JOptionPane;
public class PraticaQuestao2Dialogo {

	    public static void main(String[] args) {
	        // Solicita o ano de nascimento
	        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");
	        int anoNascimento = Integer.parseInt(anoNascimentoStr);
	        
	        //Solicita o ano atual
            String anoAtualStr = JOptionPane.showInputDialog("Digite o ano atual");
	        int anoAtual = Integer.parseInt(anoAtualStr);
	        
	        // Calcula a idade no ano atual
	        int idadeAtual = anoAtual - anoNascimento;

	        // Calcula a idade em 2050
	        int ano2050 = 2050;
	        int idade2050 = ano2050 - anoNascimento;

	        // Monta as mensagens
	        String mensagemAtual = "A idade da pessoa no ano atual é: " + idadeAtual + " anos.";
	        String mensagem2050 = "A idade que a pessoa terá em 2050 será: " + idade2050 + " anos.";

	        // Exibe as informações em caixas de diálogo
	        JOptionPane.showMessageDialog(null, mensagemAtual);
	        JOptionPane.showMessageDialog(null, mensagem2050);
	    }
}
