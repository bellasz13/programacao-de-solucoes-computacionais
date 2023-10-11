package pratica2quest12;
import java.util.Scanner;
public class Pratica2Questao12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do cliente: ");
        int idade = input.nextInt();

        System.out.print("Digite o sexo do cliente (H para homem, M para mulher): ");
        char sexo = input.next().charAt(0);

        double mensalidade = 0.00;

        if (sexo == 'H' || sexo == 'h') { 
            if (idade <= 15) {
                mensalidade = 60.00;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75.00;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90.00;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else if (sexo == 'M' || sexo == 'm') { 
            if (idade <= 18) {
                mensalidade = 60.00;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90.00;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else {
            System.out.println("Sexo inválido. Use H para homem ou M para mulher.");
            System.exit(0);
        }

        System.out.println("A mensalidade a ser paga é: R$" + mensalidade);

        input.close();
	}

}
