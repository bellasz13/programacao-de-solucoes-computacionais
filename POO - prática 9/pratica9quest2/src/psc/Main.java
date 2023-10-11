package psc;

import java.util.Scanner;

public class Main {
    public static void main(String Args[]) {
        Retangulo ret = new Retangulo();
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Informe a altura do retângulo: ");
            ret.setAltura(input.nextFloat());
            System.out.print("Informe a largura do retângulo: ");
            ret.setLargura(input.nextFloat());
        }
        System.out.println("A área é: " + ret.calculaArea());
        System.out.println("O perímetro é: " + ret.calculaPerimetro());

        // Exibir informações do retângulo
        System.out.println(ret.exibe());
    }
}
