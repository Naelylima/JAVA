import Classes.Restaurante;
import Componentes.Janela;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Restaurante> restaurantes = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    public Janela pedidos = new Janela("Pedidos", "src/Images/pedidos.png");


    public Pedido() {
        pedidos.setVisible(false);


    }
}
