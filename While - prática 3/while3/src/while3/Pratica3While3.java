package while3;
import java.util.Scanner;
public class Pratica3While3 {

	public static void main(String[] args) {
		
     Scanner scanner= new Scanner(System.in);
        
int canal2 = 0, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
int totalPessoas = 0;

System.out.println("Pesquisa de Audiência de TV");
System.out.println("Informe o número do canal e o número de pessoas assistindo (digite 0 para encerrar):");

int canal;
do {
    System.out.print("Número do canal (2, 4, 5, 7, 12): ");
    canal = scanner.nextInt();
    
    if (canal != 0) {
        System.out.print("Número de pessoas assistindo: ");
        int pessoasAssistindo = scanner.nextInt();
       
        switch (canal) {
            case 2:
                canal2 += pessoasAssistindo;
                break;
            case 4:
                canal4 += pessoasAssistindo;
                break;
            case 5:
                canal5 += pessoasAssistindo;
                break;
            case 7:
                canal7 += pessoasAssistindo;
                break;
            case 12:
                canal12 += pessoasAssistindo;
                break;
            default:
                System.out.println("Canal inválido. Informe um dos canais válidos.");
        }
        
        totalPessoas += pessoasAssistindo;
    }
    
} while (canal != 0);

System.out.println("\nPercentual de Audiência:");
if (totalPessoas > 0) {
    System.out.println("Canal 2: " + ((double)canal2 / totalPessoas * 100) + "%");
    System.out.println("Canal 4: " + ((double)canal4 / totalPessoas * 100) + "%");
    System.out.println("Canal 5: " + ((double)canal5 / totalPessoas * 100) + "%");
    System.out.println("Canal 7: " + ((double)canal7 / totalPessoas * 100) + "%");
    System.out.println("Canal 12: " + ((double)canal12 / totalPessoas * 100) + "%");
} else {
    System.out.println("Nenhum dado foi inserido.");
}

    scanner.close();
	}
}