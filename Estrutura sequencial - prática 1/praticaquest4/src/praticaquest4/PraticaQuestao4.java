package praticaquest4;
import java.util.Scanner;
public class PraticaQuestao4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu salário:");
		double salario = input.nextDouble();
		
		double aumento = (salario * 0.25) + salario;
		
		System.out.print("Seu novo salário é:" + aumento);
				
		

	}

}
