public class Base {
    private String tom;
    private String marca;
    private double preco;

    public Base(String tom, String marca, double preco) {
        this.tom = tom;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Base [tom = " + tom + ", marca = " + marca + ", preco = " + preco + "]";
    }
}
