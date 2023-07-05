package Classes;

import Telas.Restaurantes;

import java.util.ArrayList;

public class Restaurante {
    public String nome ;
    public Restaurante(String nome) {
        this.nome = nome + " ";
    }

    int ID;
    public ArrayList <Lanche> cardapio = new ArrayList<>();
    public ArrayList <Restaurante> restaurantes = new ArrayList<>();

    String lista = "";

    public void adicionarLanche(Lanche lanche){
        cardapio.add(lanche);
    }
    public ArrayList<String>obterporRestaurante(){

        ArrayList<String> lanches= new ArrayList<>();

        for (Lanche lanche: cardapio){
            lanches.add(lanche.nome);
        }
        return lanches;
    }
    public void cadastrarRestaurante(Restaurante restaurante){
        restaurantes.add(restaurante);

    }
//    public String mostrarRestaurantes(){
//        String lista = "<html>";
//
//        for (Restaurante restauranteFor: restaurantes){
//            lista = lista.concat(restauranteFor.nome+ "<br/>");
//        }
//        lista=lista.concat("</html>");
//
//        return lista;
//
//    }

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

    @Override
    public String toString() {
        return nome;
    }

}
