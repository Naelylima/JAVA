package Componentes;

import javax.swing.*;

public class Janela extends JFrame {
    public Janela(String titulo, String teste){
        super(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,738);
        setLayout(null);

//        IMAGENM
        ImageIcon imagem = new ImageIcon(teste);
        setContentPane(new JLabel(new ImageIcon(teste)));
    }
}

