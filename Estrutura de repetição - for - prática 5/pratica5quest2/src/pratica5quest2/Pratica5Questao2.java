package pratica5quest2;
import javax.swing.JOptionPane;
public class Pratica5Questao2 {

	public static void main(String[] args) {
		
		int limiteInferior, limiteSuperior;
		
        String limiteInferiorStr = JOptionPane.showInputDialog("Informe o limite inferior:");
        limiteInferior = Integer.parseInt(limiteInferiorStr);

        String limiteSuperiorStr = JOptionPane.showInputDialog("Informe o limite superior:");
        limiteSuperior = Integer.parseInt(limiteSuperiorStr);

        if (limiteInferior < 0 || limiteSuperior < 0) {
            JOptionPane.showMessageDialog(null, "Os limites devem ser números inteiros positivos.");
        } else {
            
            if (limiteInferior > limiteSuperior) {
                int temp = limiteInferior;
                limiteInferior = limiteSuperior;
                limiteSuperior = temp;
            }

            String numerosEntreLimites = "Números entre " + limiteInferior + " e " + limiteSuperior + ":\n";
            for (int numero = limiteInferior; numero <= limiteSuperior; numero++) {
                numerosEntreLimites += numero + " ";
            }

            JOptionPane.showMessageDialog(null, numerosEntreLimites);
        }

	}

}
