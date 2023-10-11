package funcionario;

public class Cadastro {

	 private Funcionario[] funcionarios;
	    private int tamanho;
	    private int capacidade;

	    public Cadastro(int capacidade) {
	        this.capacidade = capacidade;
	        this.funcionarios = new Funcionario[capacidade];
	        this.tamanho = 0;
	    }

	    public void cadastrarFuncionario(Funcionario funcionario) {
	        if (tamanho < capacidade) {
	            funcionarios[tamanho] = funcionario;
	            tamanho++;
	        } else {
	            System.out.println("O vetor de funcionários está cheio.");
	        }
	    }

	    public void imprimirCadastro() {
	        System.out.println("=== Cadastro de Funcionários ===");
	        for (int i = 0; i < tamanho; i++) {
	            System.out.println(funcionarios[i].exibe());
	            System.out.println("--------------------");
	        }

	}

}
