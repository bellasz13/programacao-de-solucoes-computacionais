package pratica2quest10;
import java.util.Scanner;
public class Pratica2Questao10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Somar os dois números.");
        System.out.println("2 - Multiplicar os dois números.");
        System.out.println("3 - Subtrair o número maior pelo número menor.");
        System.out.println("4 - Dividir o primeiro número pelo segundo.");

        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                double soma = numero1 + numero2;
                System.out.println("Resultado da soma: " + soma);
                break;
            case 2:
                double multiplicacao = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + multiplicacao);
                break;
            case 3:
                double subtracao = Math.abs(numero1 - numero2);
                System.out.println("Resultado da subtração: " + subtracao);
                break;
            case 4:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + divisao);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        input.close();

	}

}
