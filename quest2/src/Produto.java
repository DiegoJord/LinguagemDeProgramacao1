public class Produto {
    private String produto;
    private double preco;
    private String produtotipo;
    public Produto(String produto, double preco, String produtotipo){
        this.produto = produto;
        this.preco = preco;
        this.produtotipo = produtotipo;


    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getProdutotipo() {
        return produtotipo;
    }

    public void setProdutotipo(String produtotipo) {
        this.produtotipo = produtotipo;
    }
}
