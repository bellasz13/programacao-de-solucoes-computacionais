package while2;
import java.util.Scanner;
public class Pratica3While2 {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        
        int matricula;
        
        System.out.println("Informe a matrícula do aluno (ou um número negativo para sair): ");
        matricula = input.nextInt();
        
        while (matricula >= 0) {
            System.out.println("Informe a primeira nota do aluno: ");
            double nota1 = input.nextDouble();
            
            System.out.println("Informe a segunda nota do aluno: ");
            double nota2 = input.nextDouble();
            
            System.out.println("Informe a terceira nota do aluno: ");
            double nota3 = input.nextDouble();
            
            double nota = nota1 + nota2 + nota3;
            
            if (nota >= 70) {
                System.out.println("Aluno aprovado. Nota final: " + nota);
            } else if (nota >= 60) {
                System.out.println("Aluno em recuperação. Nota final: " + nota);
            } else {
                System.out.println("Aluno reprovado. Nota final: " + nota);
            }
            
            System.out.println("Informe a matrícula do próximo aluno (ou um número negativo para sair): ");
            matricula = input.nextInt();
        }
        
        System.out.println("Programa encerrado.");
        input.close();
	}

}
