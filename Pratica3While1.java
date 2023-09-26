package while1;
import java.util.Scanner;
public class Pratica3While1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        int contadorAprovados = 0;
        int contadorReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int totalAlunos = 0;

        System.out.println("Digite a nota final (ou uma nota negativa para encerrar): ");
        double nota = input.nextDouble();

        while (nota >= 0) {
            System.out.println("Digite o total de faltas do aluno: ");
            int faltas = input.nextInt();

            if (nota >= 90) {
                contadorAprovados++;
            } else if (nota < 70 || faltas >= 20) {
                contadorReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            somaNotas += nota;
            totalAlunos++;

            System.out.println("Digite a nota final (ou uma nota negativa para encerrar): ");
            nota = input.nextDouble();
        }

        if (totalAlunos > 0) {
            double mediaNotas = somaNotas / totalAlunos;
            System.out.println("Alunos com nota maior ou igual a 90: " + contadorAprovados);
            System.out.println("Alunos reprovados por nota ou falta: " + contadorReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + mediaNotas);
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }

        input.close();
	}

}
