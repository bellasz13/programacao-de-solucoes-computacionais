package pratica5quest10;
import javax.swing.JOptionPane;
public class Pratica5Questao10 {

	public static void main(String[] args) {
		
		int contadorFemininoIdade = 0;

        for (int i = 1; i <= 10; i++) {
            String sexo = JOptionPane.showInputDialog("Informe o sexo da pessoa " + i + " (m ou f):");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa " + i + ":"));

            if (sexo.equalsIgnoreCase("f") && idade >= 20 && idade <= 40) {
                contadorFemininoIdade++;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de mulheres entre 20 e 40 anos: " + contadorFemininoIdade);
	}

}
