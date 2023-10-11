package veiculo;

/**
 * Classe que permite o cadastro de veículos.
 */
public class Cadastro {

    private Veiculo[] veiculos;
    private int tamanho;
    private int capacidade;

    /**
     * Construtor da classe Cadastro.
     * 
     * @param capacidade A capacidade inicial do vetor de cadastro.
     */
    public Cadastro(int capacidade) {
        this.capacidade = capacidade;
        this.veiculos = new Veiculo[capacidade];
        this.tamanho = 0;
    }

    /**
     * Cadastra um veículo no vetor de cadastro.
     * 
     * @param veiculo O veículo a ser cadastrado.
     */
    public void cadastrarVeiculo(Veiculo veiculo) {
        if (tamanho < capacidade) {
            veiculos[tamanho] = veiculo;
            tamanho++;
        } else {
            System.out.println("O vetor de veículos está cheio.");
        }
    }

    /**
     * Imprime o vetor de cadastro de veículos.
     */
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
