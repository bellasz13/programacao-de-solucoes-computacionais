package pratica1quest10;
import java.util.Scanner;
public class Pratica1Quest10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double raio, comprimentoDaEsfera, areaDaEsfera, volumeDaEsfera;
		
		System.out.print("Digite o valor do raio: ");
		raio = input.nextDouble();
		
		comprimentoDaEsfera = 2 * 3.14 * raio;
		System.out.println(comprimentoDaEsfera);
		
		areaDaEsfera = 3.14 * Math.pow (raio, 2);
		System.out.println(areaDaEsfera);
		
		volumeDaEsfera = 0.75 * 3.14 * Math.pow (raio, 3);
		System.out.println(volumeDaEsfera);

	}

}
