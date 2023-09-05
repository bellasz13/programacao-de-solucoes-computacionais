package praticaquest3;
import java.util.Scanner;
public class PraticaQuestao3 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Solicita a cotação do dólar em reais
	        System.out.print("Digite a cotação do dólar em reais: ");
	        double cotacaoDolar = input.nextDouble();

	        // Solicita o valor em dólares que o usuário possui
	        System.out.print("Digite o valor em dólares que você possui: ");
	        double valorDolar = input.nextDouble();

	        // Calcula o valor em reais
	        double valorReais = valorDolar * cotacaoDolar;

	        // Imprime o valor em reais
	        System.out.println("O valor em reais é: R$ " + valorReais);
	    }
	}