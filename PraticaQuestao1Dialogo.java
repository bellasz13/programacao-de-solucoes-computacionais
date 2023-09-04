package praticaquest1dialog;

import javax.swing.JOptionPane;

public class PraticaQuestao1Dialogo {

	public static void main(String[] args) {
        // Solicita a primeira nota
        String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
        double nota1 = Double.parseDouble(nota1Str);

        // Solicita a segunda nota
        String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota:");
        double nota2 = Double.parseDouble(nota2Str);

        // Solicita a terceira nota
        String nota3Str = JOptionPane.showInputDialog("Digite a terceira nota:");
        double nota3 = Double.parseDouble(nota3Str);

        // Calcula a média aritmética
        double media = (nota1 + nota2 + nota3) / 3.0;

        // Exibe a média em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
}
}
