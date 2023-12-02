package pratica14quest2;

import javax.swing.JOptionPane;

public class CadastrarEmpregados {

	public static void main(String[] args) {
		int opcao = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a opção: \n\n1. Empregado\n2. Gerente\n3. Diretor"));
		String nome = JOptionPane.showInputDialog("Digite o nome");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
		int anoContratacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de contratação"));

		Empregado objEmpregado;

		if (opcao == 1) {
			objEmpregado = new Empregado(nome, salario, anoContratacao);
		} else if (opcao == 2) {
			objEmpregado = new Gerente(nome, salario, anoContratacao);
		} else if (opcao == 3) {
			objEmpregado = new Diretor(nome, salario, anoContratacao, "TI");
		} else {
			
			return;
		}

		double percentualAjuste = Double
				.parseDouble(JOptionPane.showInputDialog("Digite o percentual de ajuste de salário"));
		objEmpregado.reajustaSalario(percentualAjuste);

		exibirInformacoes(objEmpregado);
	}

	private static void exibirInformacoes(Empregado empregado) {
		JOptionPane.showMessageDialog(null, empregado.toString());
	}
}