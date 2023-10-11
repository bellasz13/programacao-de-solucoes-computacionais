package pratica2quest9;
import java.util.Scanner;
public class Pratica2Questao9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        double[] gravidades = {3.7, 8.8, 9.8, 3.8, 26.4, 11.5, 9.3, 12.2, 0.6};
        String[] planetas = {"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão"};

        System.out.println("Escolha um planeta para jogar a bola:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println((i + 1) + " - " + planetas[i]);
        }

        int escolhaPlaneta = input.nextInt();
        double g = gravidades[escolhaPlaneta - 1]; 

        System.out.print("Digite a velocidade inicial (v0) em m/s: ");
        double v0 = input.nextDouble();

        System.out.print("Digite o instante (t) em segundos: ");
        double t = input.nextDouble();

        double v = v0 - g * t;
        double h = v0 * t - 0.5 * g * t * t; 

        System.out.println("Velocidade da bola no instante t: " + v + " m/s");
        System.out.println("Altura da bola acima do lançamento no instante t: " + h + " metros");

        input.close();
	}

}
