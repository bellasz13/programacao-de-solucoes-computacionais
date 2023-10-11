package pratica2quest4;
import java.util.Scanner;
public class Pratica2Questao4 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Digite o peso (em kg): ");
	        double peso = input.nextDouble();

	        System.out.print("Digite a altura (em metros): ");
	        double altura = input.nextDouble();

	        double imc = peso / (altura * altura);
	        
	        String situacaoPeso;
	        if (imc < 20) {
	            situacaoPeso = "Abaixo do Peso";
	        } else if (imc >= 20 && imc < 25) {
	            situacaoPeso = "Normal";
	        } else if (imc >= 25 && imc < 30) {
	            situacaoPeso = "Sobrepeso";
	        } else if (imc >= 30 && imc <= 40) {
	            situacaoPeso = "Obesidade";
	        } else {
	            situacaoPeso = "Obesidade Mórbida";
	        }

	        System.out.println("IMC: " + imc);
	        System.out.println("Situação de Peso: " + situacaoPeso);

	        input.close();
	}

}
