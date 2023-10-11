package pessoa;
import java.util.Scanner;
public class Pessoa {

	  private String nome;


	    public Pessoa(String nome) {
	        this.nome = nome;
	    }

	  
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
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


	    public void setCPF(String CPF) {
	        this.CPF = CPF;
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

	    public void setCNPJ(String CNPJ) {
	        this.CNPJ = CNPJ;

	}

}
