package funcionario;

public class Funcionario {
		
		  private String nome;
		    private int idade;
		    private String cargo;
		    private double salario;
		    private String telefone;
		    private String endereco;

		    public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
		        this.nome = nome;
		        this.idade = idade;
		        this.cargo = cargo;
		        this.salario = salario;
		        this.telefone = telefone;
		        this.endereco = endereco;
		    }

		    public String exibe() {
		        return "Nome: " + nome + "\n" +
		               "Idade: " + idade + "\n" +
		               "Cargo: " + cargo + "\n" +
		               "Salário: " + salario + "\n" +
		               "Telefone: " + telefone + "\n" +
		               "Endereço: " + endereco;

	}

}
