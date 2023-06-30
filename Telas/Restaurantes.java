package Telas;

import Classes.Restaurante;
import Componentes.Botao;
import Componentes.CampoTexto;
import Componentes.Janela;
import Componentes.Text;

public class Restaurantes {

   public Janela restaurantes = new Janela("Aplicativo", "src/Images/restaurantes.png");
   Restaurante restaurante =new Restaurante("");
   CadastrarRestaurantes cadastro = new CadastrarRestaurantes();


    public Restaurantes() {
        restaurantes.setVisible(false);
        Botao bFazerPedido = new Botao("Botao", 200, 50, 100,350);
        System.out.println(cadastro.restaurante.mostrarRestaurantes());
        restaurantes.add(bFazerPedido);
        Text campo = new Text(cadastro.restaurante.mostrarRestaurantes());



        restaurantes.add(campo);

    }
}
