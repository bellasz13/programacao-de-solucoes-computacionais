package pratica2quest11;
import java.util.Scanner;
public class Pratica2Questao11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numeroDiarias = input.nextInt();

        double valorDiaria = 500.00;
        double taxaServico = 0.00;

        if (numeroDiarias < 15) {
            taxaServico = 15.00;
        } else if (numeroDiarias == 15) {
            taxaServico = 10.00;
        } else {
            taxaServico = 5.00;
        }

        double totalAPagar = (valorDiaria + taxaServico) * numeroDiarias;

        System.out.println("Total a ser pago pelo cliente: R$" + totalAPagar);

        input.close();

	}

}
