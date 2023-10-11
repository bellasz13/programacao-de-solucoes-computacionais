package circulo;
import java.util.Scanner;
public class Circulo {

	 private int x;
	    private int y;
	    private double raio;

	    public Circulo(int x, int y, double raio) {
	        this.x = x;
	        this.y = y;
	        this.raio = raio;
	    }

	    public Circulo() {
	        this(0, 0, 0);
	    }

	    public double calcularArea() {
	        return Math.PI * Math.pow(raio, 2);
	    }

	    public double calcularPerimetro() {
	        return 2 * Math.PI * raio;
	    }

	    public void moveX(int x1) {
	        x += x1;
	    }

	    public void moveY(int y1) {
	        y += y1;
	    }

	    public void aumenta(double n) {
	        raio *= n;
	    }

	    public String exibe() {
	        String info = "Centro: (" + x + ", " + y + ")\n";
	        info += "Raio: " + raio + "\n";
	        info += "Área: " + calcularArea() + "\n";
	        info += "Perímetro: " + calcularPerimetro();
	        return info;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Informe as coordenadas e o raio do círculo:");
	        System.out.print("Coordenada X: ");
	        int x = scanner.nextInt();
	        System.out.print("Coordenada Y: ");
	        int y = scanner.nextInt();
	        System.out.print("Raio: ");
	        double raio = scanner.nextDouble();

	        Circulo circulo = new Circulo(x, y, raio);

	        int escolha;
	        do {
	            System.out.println("\nEscolha uma opção:");
	            System.out.println("1 - Mover");
	            System.out.println("2 - Aumentar");
	            System.out.println("3 - Imprimir");
	            System.out.println("4 - Sair");

	            escolha = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    System.out.println("Escolha a direção de movimento:");
	                    System.out.println("1 - Mover X");
	                    System.out.println("2 - Mover Y");
	                    int direcao = scanner.nextInt();
	                    System.out.print("Informe a quantidade de movimento: ");
	                    int movimento = scanner.nextInt();

	                    if (direcao == 1) {
	                        circulo.moveX(movimento);
	                    } else if (direcao == 2) {
	                        circulo.moveY(movimento);
	                    }
	                    break;

	                case 2:
	                    System.out.print("Informe o fator de aumento: ");
	                    double aumento = scanner.nextDouble();
	                    circulo.aumenta(aumento);
	                    break;

	                case 3:
	                    System.out.println(circulo.exibe());
	                    break;
	            }
	        } while (escolha != 4);
	}

}
