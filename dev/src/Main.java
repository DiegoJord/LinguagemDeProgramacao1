public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Volkswagen", "Golf", 2008);

        System.out.println("Marca: "+carro1.getMarca());
        System.out.println("Modelo: "+carro1.getModelo());
        System.out.println("Ano: "+carro1.getAno());
    }
}
