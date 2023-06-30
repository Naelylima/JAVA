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
        JLabel background;
        background = new JLabel("", imagem, JLabel.CENTER);
        background.setBounds(0,0,400,700);
        JLabel label = new JLabel(imagem);


        add(label);
        add(background);
    }

    public static void main(String[] args) {
//        new Janela("oi", "src/")
    }
}

