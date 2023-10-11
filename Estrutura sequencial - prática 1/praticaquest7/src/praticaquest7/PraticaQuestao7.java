package praticaquest7;
import java.util.Scanner;
public class PraticaQuestao7 {

	public static void main(String[] args) {
		  
		Scanner input = new Scanner(System.in);
			
			System.out.print("Informe o salário do funcionário: ");
			double salarioFunc = input.nextDouble();
			
			System.out.print("Informe o valor do salário mínimo: ");
			double salarioMin = input.nextDouble();
			
			double quantSalarioMin = salarioFunc / salarioMin;
			
			System.out.print("A quantidade de salários mínimos recebidos é/são: " + quantSalarioMin);

	}

}
