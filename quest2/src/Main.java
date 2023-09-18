public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans preta");

        System.out.println("PRODUTO 1:");
        System.out.println("Nome do Produto: "+produto1.getProduto());
        System.out.println("Preço do Produto: "+produto1.getPreco());
        System.out.println("Tipo do Produto: "+produto1.getProdutotipo());
        System.out.println("PRODUTO 2:");
        System.out.println("Nome do Produto: "+produto2.getProduto());
        System.out.println("Preço do Produto: "+produto2.getPreco());
        System.out.println("Tipo do Produto: "+produto2.getProdutotipo());
    }
}
