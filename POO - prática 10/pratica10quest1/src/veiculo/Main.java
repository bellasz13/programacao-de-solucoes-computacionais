package veiculo;

/**
 * Classe principal para testar o código.
 */
public class Main {
        public static void main(String[] args) {

                Cadastro cadastro = new Cadastro(10);

                Veiculo veiculo1 = new Veiculo("Ford", "Fiesta", "12345ABCDE", "XYZ123", "Azul");
                Veiculo veiculo2 = new Veiculo("Toyota", "Corolla", "67890FGHIJ", "ABC456", "Prata");

                cadastro.cadastrarVeiculo(veiculo1);
                cadastro.cadastrarVeiculo(veiculo2);

                cadastro.imprimirCadastro();
        }
}
