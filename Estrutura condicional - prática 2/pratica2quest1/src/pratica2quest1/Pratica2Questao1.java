package pratica2quest1;
import java.util.Scanner;
public class Pratica2Questao1 {

	public static void main(String[] args) {
		
		        Scanner input = new Scanner(System.in);

		        System.out.print("Digite a primeira nota: ");
		        double nota1 = input.nextDouble();

		        System.out.print("Digite a segunda nota: ");
		        double nota2 = input.nextDouble();

		        double media = (nota1 + nota2) / 2;

		        if (media >= 7.0) {
		            System.out.println("Aprovado! Média: " + media);
		        } else {
		            System.out.println("Reprovado. Média: " + media);
		        }

		        input.close();
		    }
	}