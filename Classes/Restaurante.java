package Classes;

import java.util.ArrayList;

public class Restaurante {
    String nome ;
    public Restaurante(String nome) {
        this.nome = nome + " ";

    }

    int ID;
    ArrayList <Lanche> cardapio = new ArrayList<>();
    ArrayList <String> teste = new ArrayList<>();
    ArrayList <Restaurante> restaurantes = new ArrayList<>();

    String lista = "";

    public void adicionarLanche(Lanche lanche){
        cardapio.add(lanche);
    }
    public void cadastrarRestaurante(Restaurante restaurante){
        restaurantes.add(restaurante);
    }
    public String mostrarRestaurantes(){
        String lista = "";
        for (Restaurante restauranteFor: restaurantes){
            lista = lista.concat(restauranteFor.nome+ "\n");
        }
        return lista;
    }

    String imprimirCardapio(){
        System.out.println("------------- CARDAPIO -------------");

        for (Lanche lanche:cardapio) {
            if (!lista.contains(lanche.nome)){
                ID += 1;
                lista = lista.concat(ID + " "+lanche.nome + ".............." + " " + lanche.preco + "\n");
            }


        }
        return lista;
    }

    void removerLanche(int index){
        cardapio.remove(index);

    }

}
