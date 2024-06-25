public class Batom {
    private String cor;
    private String marca;
    private double preco;

    public Batom(String cor, String marca, double preco) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Batom [cor = " + cor + ", marca = " + marca + ", preco = " + preco + "]";
    }
}
