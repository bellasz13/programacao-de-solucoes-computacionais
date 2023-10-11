package pessoa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho máximo do vetor de cadastro: ");
        int tamanhoMaximo = scanner.nextInt();
        Cadastro cadastro = new Cadastro(tamanhoMaximo);

        while (true) {
            System.out.println("Opções:");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Imprimir Cadastro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.print("Nome da Pessoa Física: ");
                    String nomePF = scanner.nextLine();
                    System.out.print("CPF da Pessoa Física: ");
                    String cpf = scanner.nextLine();
                    PessoaFisica pf = new PessoaFisica(nomePF, cpf);
                    cadastro.cadastrarPessoa(pf);
                    break;
                case 2:
                    System.out.print("Nome da Pessoa Jurídica: ");
                    String nomePJ = scanner.nextLine();
                    System.out.print("CNPJ da Pessoa Jurídica: ");
                    String cnpj = scanner.nextLine();
                    PessoaJuridica pj = new PessoaJuridica(nomePJ, cnpj);
                    cadastro.cadastrarPessoa(pj);
                    break;
                case 3:
                    cadastro.imprimirCadastro();
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }

	}

}
