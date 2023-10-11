package pessoa;

public class Pessoa {

	    private String nome;

	    public Pessoa(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }
	}

	class PessoaFisica extends Pessoa {
	    private String CPF;

	    public PessoaFisica(String nome, String CPF) {
	        super(nome);
	        this.CPF = CPF;
	    }

	    public String getCPF() {
	        return CPF;
	    }
	}

	class PessoaJuridica extends Pessoa {
	    private String CNPJ;

	    public PessoaJuridica(String nome, String CNPJ) {
	        super(nome);
	        this.CNPJ = CNPJ;
	    }

	    public String getCNPJ() {
	        return CNPJ;
	    }
}
