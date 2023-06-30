public class Main {
    public static void main(String[] args) {
    Restaurante restaurante = new Restaurante();
    restaurante.adicionarLanche(new Lanche("Big Mac", 50.0));
    restaurante.adicionarLanche(new Lanche("X tudo", 40.0));
//    restaurante.removerLanche(0);
        System.out.println(restaurante.imprimirCardapio());
    }
}