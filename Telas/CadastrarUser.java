package Telas;

import Classes.Restaurante;
import Classes.Usuario;
import Componentes.Botao;
import Componentes.CampoTexto;
import Componentes.Janela;

public class CadastrarUser {
    public Janela user = new Janela("Classes.Aplicativo", "src/Images/user.png");
    Usuario usuario = new Usuario("", "", "");
    public CadastrarUser() {

        user.setVisible(false);

//        BOTÕES
        CampoTexto nome = new CampoTexto(300,35,35,165);
        user.add(nome);

        CampoTexto cpf = new CampoTexto(300,35,35,265);
        user.add(cpf);

        CampoTexto rua = new CampoTexto(300,35,40,405);
        user.add(rua);

        CampoTexto bairro = new CampoTexto(300,35,40,490);
        user.add(bairro);

        CampoTexto num = new CampoTexto(300,35,40,570);
        user.add(num);


        Botao bFinalizarCadastroUser = new Botao( 230, 52, 80,615);
        user.add(bFinalizarCadastroUser);
        bFinalizarCadastroUser.addActionListener(e -> usuario.cadastrarUsuario(new Usuario(nome.getText(), rua.getText(), cpf.getText())));

//        Cadastrar user
        usuario.cadastrarUsuario(new Usuario("Naely","Teste", "490.589.828-58"));
    }
}
