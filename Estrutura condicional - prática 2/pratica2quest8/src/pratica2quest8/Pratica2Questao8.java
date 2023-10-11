package pratica2quest8;
import java.util.Scanner;
public class Pratica2Questao8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.println("Código   Produto   Preço");
        System.out.println("1        Sapato    R$ 99,99");
        System.out.println("2        Bolsa     R$ 103,89");
        System.out.println("3        Camisa    R$ 49,98");
        System.out.println("4        Calça     R$ 89,72");
        System.out.println("5        Blusa     R$ 97,35");

        System.out.print("Digite o código do produto: ");
        int codigoProduto = input.nextInt();

        double preco = 0.0;

        switch (codigoProduto) {
            case 1:
                preco = 99.99;
                break;
            case 2:
                preco = 103.89;
                break;
            case 3:
                preco = 49.98;
                break;
            case 4:
                preco = 89.72;
                break;
            case 5:
                preco = 97.35;
                break;
            default:
                System.out.println("Código de produto inválido.");
                System.exit(0);
        }

        System.out.println("O preço do produto é: R$ " + preco);

        input.close();
	}

}
