package veiculo;

/**
 * Classe que representa um veículo.
 */
public class Veiculo {

	private String marca;
	private String modelo;
	private String numeroChassi;
	private String placa;
	private String cor;

	/**
	 * Obtém a marca do veículo.
	 * 
	 * @return
	 */
	public Veiculo(String marca, String modelo, String numeroChassi, String placa, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroChassi = numeroChassi;
		this.placa = placa;
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	/**
	 * Define a marca do veículo.
	 * 
	 * @param marca A marca do veículo.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Obtém o modelo do veículo.
	 * 
	 * @return O modelo do veículo.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Define o modelo do veículo.
	 * 
	 * @param modelo O modelo do veículo.
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Obtém o número do chassi do veículo.
	 * 
	 * @return O número do chassi do veículo.
	 */
	public String getNumeroChassi() {
		return numeroChassi;
	}

	/**
	 * Define o número do chassi do veículo.
	 * 
	 * @param numeroChassi O número do chassi do veículo.
	 */
	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public String getPlaca() {
		return placa;
	}

	/**
	 * Obtém a placa do veículo.
	 * 
	 * @return A placa do veículo.
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * Define a placa do veículo.
	 * 
	 * @param placa A placa do veículo.
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * Obtém a cor do veículo.
	 * 
	 * @return A cor do veículo.
	 */
	public void setCor(String cor) {
		this.cor = cor;
		/**
		 * Define a cor do veículo.
		 * 
		 * @param cor A cor do veículo.
		 */
	}

}
