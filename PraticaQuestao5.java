package praticaquest5;
import java.util.Scanner;
public class PraticaQuestao5 {

	public static void main(String[] args) {
		
	  Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a maior diagonal do losango: ");
		double diagonalMaior = input.nextDouble();
		
		System.out.print("Informe a menor diagonal do losango: ");
		double diagonalMenor = input.nextDouble();
		
		double area = (diagonalMaior * diagonalMenor) / 2;
		
		System.out.print("A área do losango é: " + area);
		
	}

}
