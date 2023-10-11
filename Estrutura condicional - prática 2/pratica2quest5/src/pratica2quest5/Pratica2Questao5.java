package pratica2quest5;
import java.util.Scanner;
public class Pratica2Questao5 {

	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor para x: ");
        double x = input.nextDouble();

        double resultado;

        if (x < -2) {
            resultado = 2 * x + 2;
        } else if (x <= -2 && x < 3) {
            resultado = 3;
        } else {
            resultado = -x;
        }

        System.out.println("f(x) = " + resultado);

        input.close();
	}

}
