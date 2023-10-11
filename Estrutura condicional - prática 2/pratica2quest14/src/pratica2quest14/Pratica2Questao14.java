package pratica2quest14;
import java.util.Scanner;
public class Pratica2Questao14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.println("Escolha um comando Git para obter uma explicação e um exemplo:");
        System.out.println("1 - git clone");
        System.out.println("2 - git fetch");
        System.out.println("3 - git pull");

        int escolhaComando = input.nextInt();

        switch (escolhaComando) {
            case 1:
                System.out.println("Comando Git: git clone");
                System.out.println("Explicação: O comando 'git clone' é usado para criar uma cópia local de um repositório Git remoto.");
                System.out.println("Exemplo: git clone https://github.com/seu-usuario/seu-repositorio.git");
                break;
            case 2:
                System.out.println("Comando Git: git fetch");
                System.out.println("Explicação: O comando 'git fetch' é usado para baixar informações de um repositório remoto sem mesclar as alterações com seu repositório local.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case 3:
                System.out.println("Comando Git: git pull");
                System.out.println("Explicação: O comando 'git pull' é usado para buscar as alterações de um repositório remoto e mesclá-las automaticamente com seu repositório local.");
                System.out.println("Exemplo: git pull origin master");
                break;
            default:
                System.out.println("Comando inválido.");
                break;
        }

        input.close();
	}

}
