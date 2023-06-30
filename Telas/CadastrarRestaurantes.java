package Telas;

import Classes.Restaurante;
import Componentes.Botao;
import Componentes.CampoTexto;
import Componentes.Janela;


import java.util.ArrayList;

public class CadastrarRestaurantes {
    Restaurante restaurante = new Restaurante("");
    public Janela cadastrarRestaurantes = new Janela("Cadastro Restaurantes", "src/Images/cadastroRestaurantes.png");

    public CadastrarRestaurantes() {
        cadastrarRestaurantes.setVisible(false);
        restaurante.cadastrarRestaurante(new Restaurante("restaurante"));
        restaurante.cadastrarRestaurante(new Restaurante("restaurante2"));
        restaurante.cadastrarRestaurante(new Restaurante("restaurante"));

//        Botões

       Botao bFinalizarPedido = new Botao("Botao", 230, 52, 80,615);
       cadastrarRestaurantes.add(bFinalizarPedido);
       

       CampoTexto nome = new CampoTexto(300,40,35,165);
       cadastrarRestaurantes.add(nome);

       CampoTexto cpf = new CampoTexto(300,40,35,265);
       cadastrarRestaurantes.add(cpf);

       CampoTexto rua = new CampoTexto(300,30,40,405);
       cadastrarRestaurantes.add(rua);

       CampoTexto bairro = new CampoTexto(300,30,40,490);
       cadastrarRestaurantes.add(bairro);

       CampoTexto num = new CampoTexto(300,30,40,570);
       cadastrarRestaurantes.add(num);



    }
//    public void cadastrar(Classes.Restaurante restaurante){
//        restaurantes.add(restaurante);
//        System.out.println(restaurantes);
//    }
}
