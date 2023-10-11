package funcionario;

/**
 * Classe Cadastro mantém um vetor de funcionários e fornece métodos para
 * cadastrar e listar funcionários.
 */
public class Cadastro {

	private Funcionario[] funcionarios;
	private int tamanho;
	private int capacidade;

	/**
	 * Construtor da classe Cadastro.
	 */
	public Cadastro(int capacidade) {
		this.capacidade = capacidade;
		this.funcionarios = new Funcionario[capacidade];
		this.tamanho = 0;
	}

	/**
	 * Método para cadastrar um funcionário no vetor.
	 * 
	 * @param funcionario O funcionário a ser cadastrado.
	 */
	public void cadastrarFuncionario(Funcionario funcionario) {
		if (tamanho < capacidade) {
			funcionarios[tamanho] = funcionario;
			tamanho++;
		} else {
			System.out.println("O vetor de funcionários está cheio.");
		}
	}

	/**
	 * Método para imprimir o vetor de cadastro.
	 */
	public void imprimirCadastro() {
		System.out.println("=== Cadastro de Funcionários ===");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(funcionarios[i].exibe());
			System.out.println("--------------------");
		}

	}

}
