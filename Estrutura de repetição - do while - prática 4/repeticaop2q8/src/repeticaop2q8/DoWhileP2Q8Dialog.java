package repeticaop2q8;

import javax.swing.JOptionPane;

public class DoWhileP2Q8Dialog {

	public static void main(String[] args) {
		
		String entrada;
		
		do {
			
			JOptionPane.showMessageDialog(null,"Código   Produto   Preço");
			JOptionPane.showMessageDialog(null,"1        Sapato    R$ 99,99");
			JOptionPane.showMessageDialog(null,"2        Bolsa     R$ 103,89");
			JOptionPane.showMessageDialog(null,"3        Camisa    R$ 49,98");
			JOptionPane.showMessageDialog(null,"4        Calça     R$ 89,72");
			JOptionPane.showMessageDialog(null,"5        Blusa     R$ 97,35");

			entrada = JOptionPane.showInputDialog("Digite o código do produto: ");
			int codigoProduto = Integer.parseInt(entrada);

		        double preco = 0.0;

		        switch (codigoProduto) {
		            case 1:
		                preco = 99.99;
		                break;
		            case 2:
		                preco = 103.89;
		                break;
		            case 3:
		                preco = 49.98;
		                break;
		            case 4:
		                preco = 89.72;
		                break;
		            case 5:
		                preco = 97.35;
		                break;
		            default:
		            	JOptionPane.showMessageDialog(null,"Código de produto inválido.");
		         
		        }

		        JOptionPane.showMessageDialog(null,"O preço do produto é: R$ " + preco);
		        
		        int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if (resp == JOptionPane.YES_OPTION) {
					entrada = "sim";
				} else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION) {
					entrada = "nao";
				}
			} while (entrada.equalsIgnoreCase("sim"));

			System.exit(0);

	}

}
