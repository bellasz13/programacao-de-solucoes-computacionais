package veiculo;

public class Cadastro {

	private Veiculo[] veiculos;
    private int tamanho;
    private int capacidade;

  
    public Cadastro(int capacidade) {
        this.capacidade = capacidade;
        this.veiculos = new Veiculo[capacidade];
        this.tamanho = 0;
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        if (tamanho < capacidade) {
            veiculos[tamanho] = veiculo;
            tamanho++;
        } else {
            System.out.println("O vetor de veículos está cheio.");
        }
    }

    public void imprimirCadastro() {
        System.out.println("=== Cadastro de Veículos ===");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Veículo " + (i + 1) + ":");
            System.out.println("Marca: " + veiculos[i].getMarca());
            System.out.println("Modelo: " + veiculos[i].getModelo());
            System.out.println("Número do Chassi: " + veiculos[i].getNumeroChassi());
            System.out.println("Placa: " + veiculos[i].getPlaca());
            System.out.println("Cor: " + veiculos[i].getCor());
            System.out.println("--------------------");
        }
	}

}
