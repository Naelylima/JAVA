package Telas;

import Componentes.Botao;
import Componentes.CampoTexto;
import Componentes.Janela;

public class CadastrarUser {
    public Janela user = new Janela("Aplicativo", "src/Images/user.png");

    public CadastrarUser() {

        user.setVisible(false);

//        BOTÕES
        CampoTexto nome = new CampoTexto(300,40,35,165);
        user.add(nome);

        CampoTexto cpf = new CampoTexto(300,40,35,265);
        user.add(cpf);

        CampoTexto rua = new CampoTexto(300,30,40,405);
        user.add(rua);

        CampoTexto bairro = new CampoTexto(300,30,40,490);
        user.add(bairro);

        CampoTexto num = new CampoTexto(300,30,40,570);
        user.add(num);

        Botao bFinalizarPedido = new Botao("Botao", 230, 52, 80,615);
        user.add(bFinalizarPedido);
    }
}
