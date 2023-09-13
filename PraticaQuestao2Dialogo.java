package praticaquest2dialog;
import javax.swing.JOptionPane;
public class PraticaQuestao2Dialogo {

	    public static void main(String[] args) {
	      
	        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");
	        int anoNascimento = Integer.parseInt(anoNascimentoStr);
	        
            String anoAtualStr = JOptionPane.showInputDialog("Digite o ano atual");
	        int anoAtual = Integer.parseInt(anoAtualStr);
	    
	        int idadeAtual = anoAtual - anoNascimento;

	        int ano2050 = 2050;
	        int idade2050 = ano2050 - anoNascimento;

	        String mensagemAtual = "A idade da pessoa no ano atual é: " + idadeAtual + " anos.";
	        String mensagem2050 = "A idade que a pessoa terá em 2050 será: " + idade2050 + " anos.";

	        JOptionPane.showMessageDialog(null, mensagemAtual);
	        JOptionPane.showMessageDialog(null, mensagem2050);
	    }
}
