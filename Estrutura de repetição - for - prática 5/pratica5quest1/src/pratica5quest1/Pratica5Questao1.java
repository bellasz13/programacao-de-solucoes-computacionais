package pratica5quest1;
import javax.swing.JOptionPane;
public class Pratica5Questao1 {

	public static void main(String[] args) {
		
		int soma = 0;

        for (int numero = 7; numero <= 20; numero++) {
            soma += numero;
        }

        JOptionPane.showMessageDialog(null, "A soma dos números entre 7 e 20 é: " + soma);
    }
	}
