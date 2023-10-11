package pratica2quest3;
import java.util.Scanner;
public class Pratica2Questao3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota (0-10): ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota (0-10): ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota (0-10): ");
        double nota3 = input.nextDouble();
        
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
            System.out.println("Nota(s) fora do intervalo [0, 10].");
        } else {
            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 0 && media < 3) {
                System.out.println("REPROVADO");
            } else if (media >= 3 && media < 7) {
                System.out.println("EXAME");
            } else if (media >= 7 && media <= 10) {
                System.out.println("APROVADO");
            }
        }

        input.close();
	}

}
