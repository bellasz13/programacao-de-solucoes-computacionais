package pratica12;

import javax.swing.JOptionPane;

public class Main {

	 public static void main(String[] args) {
		 
		 Cadastro cadastro = new Cadastro(10);

	        while (true) {
	            String[] options = {"Pessoa Física", "Pessoa Jurídica", "Imprimir Cadastro", "Sair"};
	            int choice = JOptionPane.showOptionDialog(
	                    null,
	                    "Escolha uma opção:",
	                    "Cadastro de Pessoas",
	                    JOptionPane.DEFAULT_OPTION,
	                    JOptionPane.PLAIN_MESSAGE,
	                    null,
	                    options,
	                    options[0]
	            );

	            switch (choice) {
	                case 0:
	                    cadastrarPessoaFisica(cadastro);
	                    break;
	                case 1:
	                    cadastrarPessoaJuridica(cadastro);
	                    break;
	                case 2:
	                    cadastro.imprimirCadastro();
	                    break;
	                case 3:
	                    System.exit(0);
	            }
	        }
	    }

	    private static void cadastrarPessoaFisica(Cadastro cadastro) {
	        PessoaFisica pessoaFisica = new PessoaFisica();
	        pessoaFisica.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa física:"));
	        pessoaFisica.setCPF(JOptionPane.showInputDialog("Digite o CPF da pessoa física:"));
	        cadastro.cadastrarPessoa(pessoaFisica);
	    }

	    private static void cadastrarPessoaJuridica(Cadastro cadastro) {
	        PessoaJuridica pessoaJuridica = new PessoaJuridica();
	        pessoaJuridica.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa jurídica:"));
	        pessoaJuridica.setCNPJ(JOptionPane.showInputDialog("Digite o CNPJ da pessoa jurídica:"));
	        cadastro.cadastrarPessoa(pessoaJuridica);
	    }
	}
