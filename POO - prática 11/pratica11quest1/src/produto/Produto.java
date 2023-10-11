package produto;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    static int ultimo_id = 0;

    public Produto() {
        this.id = ++ultimo_id;
        this.nome = "Nome não informado";
        this.preco = 0;
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
    }

    public void reajustaPreco(double percentual) {
        double novoPreco = preco * (1 + percentual / 100);
        setPreco(novoPreco);
    }

}
