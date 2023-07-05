package Classes;

import Classes.Restaurante;
import Classes.Usuario;
import Componentes.Janela;
import Componentes.Rotulo;
import Componentes.Text;
import Telas.Restaurantes;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Restaurante> restaurantes = new ArrayList<>();
    public Janela pedidos = new Janela("Pedidos", "src/Images/pedidos.png");
    public Restaurantes rest = new Restaurantes();
    String num;


    public Pedido(String num) {
        pedidos.setVisible(false);
        this.num = num;

//        adicionarRestaurante(rest.restaurante);
        System.out.println("aqui"+ obterPedido());
//        String t = String.valueOf(rest.pedido.obterPedido());
//        Text rotulo =new Text(t);
//        System.out.println(rest.pedido.obterPedido());

    }
    public void adicionarRestaurante(Restaurante restaurantes){
        this.restaurantes.add(restaurantes);
    }
    public ArrayList<String>obterPedido(){
        ArrayList<String> item = new ArrayList<>();
        for (Restaurante res: restaurantes){
            item.add(res.nome);
        }
        return item;
    }



}

