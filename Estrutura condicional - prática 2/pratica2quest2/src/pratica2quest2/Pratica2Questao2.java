package pratica2quest2;
import java.util.Scanner;
public class Pratica2Questao2 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Digite o comprimento do primeiro lado: ");
	        double lado1 = input.nextDouble();

	        System.out.print("Digite o comprimento do segundo lado: ");
	        double lado2 = input.nextDouble();

	        System.out.print("Digite o comprimento do terceiro lado: ");
	        double lado3 = input.nextDouble();

	        if (lado1 == lado2 && lado2 == lado3) {
	            System.out.println("Triângulo Equilátero: os três lados são iguais.");
	        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	            System.out.println("Triângulo Isósceles: 2 lados são iguais.");
	        } else {
	            System.out.println("Triângulo Escaleno: 3 lados diferentes.");
	        }

	        input.close();
	    }
	}