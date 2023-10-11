package pratica1quest8;
import java.util.Scanner;
public class Pratica1Questao8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o seu peso: ");
		double pesoInf = input.nextDouble();
		
		double pesoGanho = (pesoInf * 0.15) + pesoInf;
		double pesoPerdido = pesoInf - (pesoInf * 0.20);
		
		System.out.println("Seu peso após ganhar 15%: " + pesoGanho );
		System.out.println("Seu peso após perder 20%: " + pesoPerdido );
	}

}
