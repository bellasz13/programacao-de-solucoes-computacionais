package produto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do primeiro produto: ");
        String nomeProduto1 = scanner.nextLine();
        System.out.print("Informe o preço do primeiro produto: ");
        double precoProduto1 = scanner.nextDouble();

        Produto produto1 = new Produto(nomeProduto1, precoProduto1);

        System.out.print("Informe o nome do segundo produto: ");
        scanner.nextLine(); 
        String nomeProduto2 = scanner.nextLine();
        System.out.print("Informe o preço do segundo produto: ");
        double precoProduto2 = scanner.nextDouble();

        Produto produto2 = new Produto(nomeProduto2, precoProduto2);

        System.out.print("Informe o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        produto1.reajustaPreco(percentualReajuste);
        produto2.reajustaPreco(percentualReajuste);

        System.out.println("\nInformações do Produto 1:");
        produto1.exibe();

        System.out.println("\nInformações do Produto 2:");
        produto2.exibe();

        System.out.println("\nÚltimo ID gerado: " + Produto.ultimo_id);
	}
}
