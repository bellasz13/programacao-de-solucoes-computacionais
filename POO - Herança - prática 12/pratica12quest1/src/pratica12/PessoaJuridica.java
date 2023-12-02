package pratica12;

public class PessoaJuridica extends Pessoa {

	private String CNPJ;

    public void setCNPJ(String cnpj) {
        this.CNPJ = cnpj;
    }

    public String getCNPJ() {
        return CNPJ;
    }
}
