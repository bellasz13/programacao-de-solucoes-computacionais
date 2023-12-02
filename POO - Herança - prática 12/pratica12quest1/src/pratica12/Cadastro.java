package pratica12;

public class Cadastro {

	 private Pessoa[] pessoas;
	    private int quantidadePessoas;

	    public Cadastro(int tamanho) {
	        pessoas = new Pessoa[tamanho];
	        quantidadePessoas = 0;
	    }

	    public void cadastrarPessoa(Pessoa pessoa) {
	        if (quantidadePessoas < pessoas.length) {
	            pessoas[quantidadePessoas] = pessoa;
	            quantidadePessoas++;
	            System.out.println("Pessoa cadastrada com sucesso!");
	        } else {
	            System.out.println("Cadastro cheio. Não é possível cadastrar mais pessoas.");
	        }
	    }

	    public void imprimirCadastro() {
	        System.out.println("Lista de Cadastro:");
	        for (int i = 0; i < quantidadePessoas; i++) {
	            System.out.println("Nome: " + pessoas[i].getNome());
	            if (pessoas[i] instanceof PessoaFisica) {
	                System.out.println("CPF: " + ((PessoaFisica) pessoas[i]).getCPF());
	            } else if (pessoas[i] instanceof PessoaJuridica) {
	                System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getCNPJ());
	            }
	            System.out.println("---------------------");
	        }
	    }
}
