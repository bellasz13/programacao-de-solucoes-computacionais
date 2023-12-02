package pratica13;

import javax.swing.JOptionPane;

public class CadastraPessoa {
	
	public static void main(String[] args) {
		
		 Pessoa objPessoa;
	        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n\n1. Pessoa física\n2. Pessoa Jurídica"));
	        String nome = JOptionPane.showInputDialog("Digite o nome");
	        String telefone = JOptionPane.showInputDialog("Digite o telefone");
	        String endereco = JOptionPane.showInputDialog("Digite o endereço");

	        if (opcao == 1) {
	            PF objPF = new PF();
	            String RG = JOptionPane.showInputDialog("Digite o RG");
	            String CPF = JOptionPane.showInputDialog("Digite o CPF");

	            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n\n1. Amigos\n2. Parentes"));

	            if (opcao == 1) {
	                String blog = JOptionPane.showInputDialog("Digite o blog");
	                Amigos objAmigos = new Amigos(nome, telefone, endereco, RG, CPF, blog);
	                objPessoa = objAmigos; // Polimorfismo
	            } else {
	                String email = JOptionPane.showInputDialog("Digite o e-mail");
	                Parentes objParentes = new Parentes(nome, telefone, endereco, RG, CPF, email);
	                objPessoa = objParentes; // Polimorfismo
	            }
	        } else {
	            String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ");
	            String IE = JOptionPane.showInputDialog("Digite a Inscrição Estadual");
	            PJ objPJ = new PJ(nome, telefone, endereco, CNPJ, IE);
	            objPessoa = objPJ; // Polimorfismo
	        }

	        objPessoa.exibe();
	}
}
