class Produto {
    private int Codigo;
    private String Nome;
    private double Preco;
    
    public Produto (int newCodigo, String newNome, double newPreco){
        this.Codigo = newCodigo;
        this.Nome = newNome;
        this.Preco = newPreco;
    }

    public void setCodigo(int newCodigo){
        this.Codigo = newCodigo;
    }

    public void setNome (String newNome){
        this.Nome = newNome;
    }

    public void setPreco (double newPreco){
        this.Preco = newPreco;
    }

    public int getCodigo(){
        return this.Codigo;
    }

    public String getNome(){
        return this.Nome;
    }

    public double getPreco(){
        return this.Preco;
    }
}
