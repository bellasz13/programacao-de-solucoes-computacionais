package funcionario;

/**
 * Classe Funcionario representa um funcionário com nome, idade, cargo, salário,
 * telefone e endereço.
 */
public class Funcionario {

	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	private String telefone;
	private String endereco;

	/**
	 * Construtor da classe Funcionario.
	 * 
	 * @param nome     Nome do funcionário.
	 * @param idade    Idade do funcionário.
	 * @param cargo    Cargo do funcionário.
	 * @param salario  Salário do funcionário.
	 * @param telefone Telefone do funcionário.
	 * @param endereco Endereço do funcionário.
	 */

	public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	/**
	 * Exibir os dados do funcionário.
	 */
	public String exibe() {
		return "Nome: " + nome + "\n" +
				"Idade: " + idade + "\n" +
				"Cargo: " + cargo + "\n" +
				"Salário: " + salario + "\n" +
				"Telefone: " + telefone + "\n" +
				"Endereço: " + endereco;

	}

}
