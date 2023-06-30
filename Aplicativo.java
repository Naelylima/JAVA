import Classes.Restaurante;
import Componentes.Botao;
import Componentes.Janela;
import Telas.*;

public class Aplicativo {
     public Aplicativo() {
          Janela j = new Janela("Aplicativo", "src/Images/OPEN.png");
          j.setVisible(true);

//          INSTANCIAS
          Restaurantes r = new Restaurantes();
          Restaurante res = new Restaurante("");
          CadastrarUser cadastrarUser = new CadastrarUser();
          CadastrarRestaurantes cadastroRestaurante = new CadastrarRestaurantes();
          Pedido pedido = new Pedido();


//          res.cadastrarRestaurante(new Restaurante("teste"));
//          res.cadastrarRestaurante(new Restaurante("teste2"));
//          res.mostrarRestaurantes();



//          restaurante.adicionarLanche(new Classes.Lanche("Big Mac", 50.0));
//          restaurante.adicionarLanche(new Classes.Lanche("X tudo", 40.0));
//          restaurante.removerLanche(0);
//          System.out.println(restaurante.imprimirCardapio());
//          System.out.println(restaurante.imprimirCardapio());

//          BOTÕES

          Botao bFazerPedido = new Botao("Botao", 200, 50, 100,350);
          j.add(bFazerPedido);
          bFazerPedido.addActionListener(e -> r.restaurantes.setVisible(true));

          Botao bCadastrarRestaurantes = new Botao("Botao", 200, 50, 100,443);
          j.add(bCadastrarRestaurantes);
          bCadastrarRestaurantes.addActionListener(e -> cadastroRestaurante.cadastrarRestaurantes.setVisible(true));


          Botao bCadastrarUsuario = new Botao("Botao", 200, 50, 100,540);
          j.add(bCadastrarUsuario);
          bCadastrarUsuario.addActionListener(e -> cadastrarUser.user.setVisible(true));

          Botao pedidos = new Botao("Botao", 40, 40, 30,35);
          j.add(pedidos);
          pedidos.addActionListener(e -> pedido.pedidos.setVisible(true));

     }
}

