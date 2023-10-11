package pessoa;

public class Cadastro {
	private Pessoa[] cadastros;
    private int count;

    public Cadastro(int size) {
        cadastros = new Pessoa[size];
        count = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (count < cadastros.length) {
            cadastros[count] = pessoa;
            count++;
        } else {
            System.out.println("O vetor de cadastro está cheio.");
        }
    }

    public void imprimirCadastro() {
        System.out.println("Pessoas cadastradas:");
        for (int i = 0; i < count; i++) {
            System.out.println("Nome: " + cadastros[i].getNome());
            if (cadastros[i] instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) cadastros[i]).getCPF());
            } else if (cadastros[i] instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) cadastros[i]).getCNPJ());
            }
            System.out.println();
        }
    }
}
