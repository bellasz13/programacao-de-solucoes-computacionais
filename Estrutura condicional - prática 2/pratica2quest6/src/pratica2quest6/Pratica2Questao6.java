package pratica2quest6;
import java.util.Scanner;
public class Pratica2Questao6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro lado em cm: ");
        double a = input.nextDouble();

        System.out.print("Informe o segundo lado em cm: ");
        double b = input.nextDouble();

        System.out.print("Informe o terceiro lado em cm: ");
        double c = input.nextDouble();

        boolean condicao1 = Math.abs(b - c) < a && a < b + c;
        boolean condicao2 = Math.abs(a - c) < b && b < a + c;
        boolean condicao3 = Math.abs(a - b) < c && c < a + b;

        boolean podeSerTriangulo = condicao1 && condicao2 && condicao3;

        if (podeSerTriangulo) {
            System.out.println("Resposta: os três valores informados podem ser os comprimentos dos lados de um triângulo.");
        } else {
            System.out.println("Resposta: os três valores informados NÃO podem ser os comprimentos dos lados de um triângulo.");
        }

        input.close();

	}

}
