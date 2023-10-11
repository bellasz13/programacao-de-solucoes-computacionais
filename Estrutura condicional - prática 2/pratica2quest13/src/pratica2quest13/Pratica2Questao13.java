package pratica2quest13;
import java.util.Scanner;
public class Pratica2Questao13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.println("Escolha o tipo de apartamento:");
        System.out.println("1 - Apto Simples");
        System.out.println("2 - Apto Duplo");

        int escolhaApto = input.nextInt();
        double valorDiaria = 0.0;

        if (escolhaApto == 1 || escolhaApto == 2) {
            System.out.print("Digite o número de diárias: ");
            int numeroDiarias = input.nextInt();

            if (numeroDiarias < 0) {
                System.out.println("Número de diárias não pode ser negativo.");
                System.exit(0);
            }

            if (escolhaApto == 1) {
                if (numeroDiarias < 10) {
                    valorDiaria = 100.00;
                } else if (numeroDiarias >= 10 && numeroDiarias <= 15) {
                    valorDiaria = 90.00;
                } else {
                    valorDiaria = 80.00;
                }
            } else if (escolhaApto == 2) {
                if (numeroDiarias < 10) {
                    valorDiaria = 140.00;
                } else if (numeroDiarias >= 10 && numeroDiarias <= 15) {
                    valorDiaria = 120.00;
                } else {
                    valorDiaria = 100.00;
                }
            }
            
            double totalAPagar = valorDiaria * numeroDiarias;
            System.out.println("O total a ser pago é: R$" + totalAPagar);
        } else {
            System.out.println("Escolha de tipo de apartamento inválida.");
        }

        input.close();
        
	}
}
