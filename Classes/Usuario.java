package Classes;

import java.util.ArrayList;

public class Usuario {
    String nome;
    String endereco;
    String cpf;

    ArrayList <Usuario> usuarios =new ArrayList<>();


    public Usuario(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    public void cadastrarUsuario(Usuario user){
        usuarios.add(user);

        String lista = "";
        for (Usuario restauranteFor: usuarios){
            lista = lista.concat(restauranteFor.nome+"\n");
        }
    }
}
