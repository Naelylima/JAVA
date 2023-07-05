package Telas;

import Classes.Lanche;
import Classes.Restaurante;
import Componentes.Botao;
import Componentes.CampoTexto;
import Componentes.Janela;


import java.util.ArrayList;

public class CadastrarRestaurantes {
    public Restaurante restaurante = new Restaurante("");
    public Janela cadastrarRestaurantes = new Janela("Cadastro Restaurantes", "src/Images/cadastroRestaurantes.png");

    public CadastrarRestaurantes() {
        cadastrarRestaurantes.setVisible(false);
        restaurante.cadastrarRestaurante(new Restaurante("restaurante"));
        restaurante.cadastrarRestaurante(new Restaurante("restaurante2"));
        restaurante.cadastrarRestaurante(new Restaurante("restaurante3"));


//      TEXTOS INPUTS
        CampoTexto nome = new CampoTexto(301,40,32,165);
        cadastrarRestaurantes.add(nome);

        CampoTexto cpf = new CampoTexto(301,40,32,265);
        cadastrarRestaurantes.add(cpf);

        CampoTexto rua = new CampoTexto(300,30,35,405);
        cadastrarRestaurantes.add(rua);

        CampoTexto bairro = new CampoTexto(300,30,33,490);
        cadastrarRestaurantes.add(bairro);

        CampoTexto num = new CampoTexto(300,30,35,570);
        cadastrarRestaurantes.add(num);

//        Botões

       Botao bFinalizarPedido = new Botao( 230, 52, 80,615);
       cadastrarRestaurantes.add(bFinalizarPedido);
       bFinalizarPedido.addActionListener(e -> restaurante.cadastrarRestaurante(new Restaurante(nome.getText())));
       restaurante.adicionarLanche(new Lanche("lache bom",10.0));
       System.out.println(restaurante.obterporRestaurante() + restaurante.nome);

    }
}
