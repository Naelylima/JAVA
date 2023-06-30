import java.util.ArrayList;

public class Restaurante {
    String nomeRestaurante;
    String localizaçãoRestaurante;
    int ID;
    ArrayList <Lanche> cardapio = new ArrayList<>();
    ArrayList <String> teste = new ArrayList<>();

    void adicionarLanche(Lanche lanche){
        cardapio.add(lanche);
    }

    String imprimirCardapio(){
        System.out.println("------------- CARDAPIO -------------");
        String lista = "";

        for (Lanche lanche:cardapio
             ) {
            ID += 1;
            lista = lista.concat(ID + " "+lanche.nome + ".............." + " " + lanche.preco + "\n");

        }
        teste.add(lista);


        return lista;
    }

    void removerLanche(int index){
        cardapio.remove(index);

    }

}
