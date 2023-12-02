package pratica13quest2;

import javax.swing.JOptionPane;

public class CadastroPessoa {

    public static void main(String[] args) {

        Pessoa objPessoa = null;
        double salario = 0;
        double saldo = 0;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a opção:\n\n1. Empregado\n2. Cliente"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o idade"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));

        if (opcao == 1) {
            int numeroSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção"));
            double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base"));
            double inss = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem descontada do INSS"));

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite a opção:\n\n1. Administrador\n2. Operario\n3. Vendedor"));

            if (opcao == 1) {
                double ajudaDeCusto = Double
                        .parseDouble(JOptionPane.showInputDialog("Digite o valor da ajuda de custo"));
                objPessoa = new Administrador(nome, idade, altura, peso, numeroSecao, salarioBase, inss, ajudaDeCusto);
                salario = salarioBase - inss + ajudaDeCusto;
                JOptionPane.showMessageDialog(null, "Salário: " + salario);

            } else if (opcao == 2) {
                double valorProducao = Double.parseDouble(
                        JOptionPane.showInputDialog("Digite o valor dos artigos produzidos pelo operário"));
                double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão do operário"));
                objPessoa = new Operario(nome, idade, altura, peso, numeroSecao, salarioBase, inss, valorProducao,
                        comissao);
                salario = salarioBase - (salarioBase * (inss / 100)) + (valorProducao * (comissao / 100));
                JOptionPane.showMessageDialog(null, "Salário: " + salario);

            } else if (opcao == 3) {
                double valorVenda = Double
                        .parseDouble(JOptionPane.showInputDialog("Digite o valor dos artigos vendidos pelo vendedor"));
                double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão do vendedor"));
                objPessoa = new Vendedor(nome, idade, altura, peso, numeroSecao, salarioBase, inss, valorVenda,
                        comissao);
                salario = salarioBase - (salarioBase * (inss / 100)) + (valorVenda * (comissao / 100));
                JOptionPane.showMessageDialog(null, "Salário: " + salario);
            }
        } else if (opcao == 2) {
            double credMax = Double.parseDouble(JOptionPane.showInputDialog("Digite o crédito máximo"));
            double valorEmDivida = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dívida"));
            objPessoa = new Cliente(nome, idade, altura, peso, credMax, valorEmDivida);
            saldo = credMax - valorEmDivida;
            JOptionPane.showMessageDialog(null, "Saldo disponível: " + saldo);
        }
    }
}