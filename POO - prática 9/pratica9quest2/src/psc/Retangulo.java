package psc;

/**
 * A classe Retangulo representa um retângulo com altura e largura.
 */

public class Retangulo {
    private float altura, largura;

    /**
     * Construtor padrão que inicializa altura e largura com 0.
     */
    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    /**
     * Obtém a altura do retângulo.
     *
     * @return A altura do retângulo.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Define a altura do retângulo.
     *
     * @param alt A nova altura do retângulo.
     */
    public void setAltura(float alt) {
        altura = alt;
    }

    /**
     * Obtém a largura do retângulo.
     *
     * @return A largura do retângulo.
     */
    public float getLargura() {
        return largura;
    }

    /**
     * Define a largura do retângulo.
     *
     * @param larg A nova largura do retângulo.
     */
    public void setLargura(float larg) {
        largura = larg;
    }

    /**
     * Calcula a área do retângulo.
     *
     * @return A área do retângulo.
     */
    public float calculaArea() {
        return altura * largura;
    }

    /**
     * Calcula o perímetro do retângulo.
     *
     * @return O perímetro do retângulo.
     */
    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    /**
     * Exibe informações sobre o retângulo, incluindo altura, largura, área e
     * perímetro.
     *
     * @return Uma string formatada com as informações do retângulo.
     */
    public String exibe() {
        return "Altura: " + String.format("%.2f", altura) + "\n" +
                "Largura: " + String.format("%.2f", largura) + "\n" +
                "Área: " + String.format("%.2f", calculaArea()) + "\n" +
                "Perímetro: " + String.format("%.2f", calculaPerimetro());
    }
}