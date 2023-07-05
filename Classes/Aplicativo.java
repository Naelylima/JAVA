package Classes;

import Classes.Restaurante;
import Componentes.Botao;
import Componentes.ComboBox;
import Componentes.Janela;
import Telas.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
     public Aplicativo() {
          Janela j = new Janela("Classes.Aplicativo", "src/Images/OPEN.png");
          j.setVisible(true);


//          INSTANCIAS
          Restaurantes r = new Restaurantes();
          CadastrarUser cadastrarUser = new CadastrarUser();
//          r.pedido.obterPedido();
          CadastrarRestaurantes cadastroRestaurante = new CadastrarRestaurantes();
//          cadastroRestaurante.restaurante.adicionarLanche(new Lanche("TESTE", 12.0));
//          cadastroRestaurante.restaurante1.adicionarLanche(new Lanche("TESTE2", 12.0));

          Pedido pedido = new Pedido("1");


////          BOTÕES

          Botao bFazerPedido = new Botao( 200, 50, 100,350);
          j.add(bFazerPedido);
          bFazerPedido.addActionListener(e -> r.restaurantes.setVisible(true));

          Botao bCadastrarRestaurantes = new Botao( 200, 50, 100,443);
          j.add(bCadastrarRestaurantes);
          bCadastrarRestaurantes.addActionListener(e -> cadastroRestaurante.cadastrarRestaurantes.setVisible(true));


          Botao bCadastrarUsuario = new Botao( 200, 50, 100,540);
          j.add(bCadastrarUsuario);
          bCadastrarUsuario.addActionListener(e -> cadastrarUser.user.setVisible(true));

          Botao pedidos = new Botao( 40, 40, 20,33);
          j.add(pedidos);
          pedidos.addActionListener(e -> pedido.pedidos.setVisible(true));
     }

}

