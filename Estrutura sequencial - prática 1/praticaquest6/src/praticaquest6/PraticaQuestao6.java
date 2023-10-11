package praticaquest6;
import java.util.Scanner;
public class PraticaQuestao6 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
			
			System.out.print("Informe a temperatura em Celsius: ");
			double tempC = input.nextDouble();
			
			double tempF = (tempC * 1.8) + 32;
			
			System.out.print("A temperatura em Fahrenheit é: " + tempF);
	}

}