package pessoa;
import java.util.Scanner;
/**
 * Classe que representa uma pessoa.
 */
public class Pessoa {

	  private String nome;


	    public Pessoa(String nome) {
	        this.nome = nome;
	    }

	  /**
     * Obtém o nome da pessoa.
     * @return O nome da pessoa.
     */
	    public String getNome() {
	        return nome;
	    }
   
		/**
		 * Define o nome da pessoa
		 * @param nome Nome da pessoa
		 */
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	}
/**
 * Classe que representa uma pessoa física.
 */
	class PessoaFisica extends Pessoa {
	    private String CPF;

	    public PessoaFisica(String nome, String CPF) {
	        super(nome);
	        this.CPF = CPF;
	    }

     /**
     * Obtém o CPF da pessoa física.
     * @return O CPF da pessoa física.
     */
	    public String getCPF() {
	        return CPF;
	    }

     /**
     * Define o CPF da pessoa física.
     * @param cpf O CPF da pessoa física.
     */
	    public void setCPF(String CPF) {
	        this.CPF = CPF;
	    }
	}
  /**
 * Classe que representa uma pessoa jurídica.
 */
	class PessoaJuridica extends Pessoa {
	    private String CNPJ;

	    public PessoaJuridica(String nome, String CNPJ) {
	        super(nome);
	        this.CNPJ = CNPJ;
	    }
     /**
     * Obtém o CNPJ da pessoa jurídica.
     * @return O CNPJ da pessoa jurídica.
     */
	    public String getCNPJ() {
	        return CNPJ;
	    }
       /**
     * Define o CNPJ da pessoa jurídica.
     * @param cnpj O CNPJ da pessoa jurídica.
     */
	    public void setCNPJ(String CNPJ) {
	        this.CNPJ = CNPJ;

	}

}
