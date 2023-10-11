package pessoa;
import java.util.Scanner;
public class Cadastro {

	 private Pessoa[] cadastro;
	    private int tamanho;
	    private int capacidade;

	    public Cadastro(int capacidade) {
	        this.capacidade = capacidade;
	        this.cadastro = new Pessoa[capacidade];
	        this.tamanho = 0;
	    }

	    public void cadastrarPessoa(Pessoa pessoa) {
	        if (tamanho < capacidade) {
	            cadastro[tamanho] = pessoa;
	            tamanho++;
	        } else {
	            System.out.println("O vetor de cadastro está cheio.");
	        }
	    }

	    public void imprimirCadastro() {
	        System.out.println("=== Cadastro de Pessoas ===");
	        for (int i = 0; i < tamanho; i++) {
	            System.out.println("Nome: " + cadastro[i].getNome());

	            if (cadastro[i] instanceof PessoaFisica) {
	                System.out.println("Tipo: Pessoa Física");
	                System.out.println("CPF: " + ((PessoaFisica) cadastro[i]).getCPF());
	            } else if (cadastro[i] instanceof PessoaJuridica) {
	                System.out.println("Tipo: Pessoa Jurídica");
	                System.out.println("CNPJ: " + ((PessoaJuridica) cadastro[i]).getCNPJ());
	            }

	            System.out.println("--------------------");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Cadastro de Pessoas, Pessoas Físicas e Pessoas Jurídicas");

	        Cadastro cadastro = new Cadastro(10);

	        while (true) {
	            System.out.println("Escolha o tipo de pessoa (1 - Pessoa, 2 - Pessoa Física, 3 - Pessoa Jurídica, 0 - Sair):");
	            int escolha = scanner.nextInt();

	            if (escolha == 0) {
	                break;
	            }

	            System.out.print("Nome: ");
	            String nome = scanner.next();
	            scanner.nextLine();
	            
	            if (escolha == 1) {
	                Pessoa pessoa = new Pessoa(nome);
	                cadastro.cadastrarPessoa(pessoa);
	            } else if (escolha == 2) {
	                System.out.print("CPF: ");
	                String CPF = scanner.next();
	                scanner.nextLine();
	                PessoaFisica pessoaFisica = new PessoaFisica(nome, CPF);
	                cadastro.cadastrarPessoa(pessoaFisica);
	            } else if (escolha == 3) {
	                System.out.print("CNPJ: ");
	                String CNPJ = scanner.next();
	                scanner.nextLine(); 
	                PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, CNPJ);
	                cadastro.cadastrarPessoa(pessoaJuridica);
	            }
	        }

	        cadastro.imprimirCadastro();

	}

}
