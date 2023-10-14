package repeticaop2q7;

import javax.swing.JOptionPane;

public class DoWhileP2Q7Dialog {

	public static void main(String[] args) {
		
        String entrada;
		
		do {
			
			entrada = JOptionPane.showInputDialog("Informe o valor de 'a': ");
            double a = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Informe o valor de 'b': ");
            double b = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Informe o valor de 'c': ");
            double c = Double.parseDouble(entrada);

            double delta = b * b - 4 * a * c;

            if (a == 0 && b == 0 && c == 0) {
                JOptionPane.showMessageDialog(null, "Igualdade confirmada: 0 = 0");
            } else if (a == 0 && b == 0) {
                JOptionPane.showMessageDialog(null, "Coeficientes informados incorretamente");
            } else if (a == 0) {
                double x = -c / b;
                JOptionPane.showMessageDialog(null, "Esta é uma equação de primeiro grau: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "Esta é uma equação de segundo grau.");
                if (delta < 0) {
                    JOptionPane.showMessageDialog(null, "Esta equação não possui raízes reais (delta < 0): delta = " + delta);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    JOptionPane.showMessageDialog(null, "Esta equação possui duas raízes reais iguais: x' = x'' = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = " + x1 + ", x'' = " + x2);
                }

                int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar?", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    entrada = "sim";
                } else {
                    entrada = "nao";
                }
            }
        } while (entrada.equalsIgnoreCase("sim"));

        System.exit(0);
	}

}
