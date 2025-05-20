public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public void setCodigo(int newCodigo) {
        this.codigo = newCodigo;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }

    public void setPreco(double newPreco){
        this.preco = newPreco;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString(){
        return "produto: " + this.nome + ", código: " + this.codigo + ", preço: " + this.preco;
    }
}
