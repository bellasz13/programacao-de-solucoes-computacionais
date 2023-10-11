package pratica6quest3;
import java.util.Scanner;
public class Pratica6Questao3 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

         double[] numeros = new double[10];

         for (int i = 0; i < 10; i++) {
             System.out.print("Digite o " + (i + 1) + "º número real: ");
             numeros[i] = scanner.nextDouble();
         }

         double menor = numeros[0];
         double maior = numeros[0];

         for (int i = 1; i < 10; i++) {
             if (numeros[i] < menor) {
                 menor = numeros[i];
             }
             if (numeros[i] > maior) {
                 maior = numeros[i];
             }
         }

         System.out.println("Números informados:");
         for (int i = 0; i < 10; i++) {
             System.out.println(numeros[i]);
         }

         System.out.println("Menor número: " + menor);
         System.out.println("Maior número: " + maior);

         scanner.close();

	}

}
