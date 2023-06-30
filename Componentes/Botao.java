package Componentes;

import javax.swing.*;

public class Botao extends JButton {
    public Botao(String text, int width, int height, int xLocation, int yLocation){
        super(text);
        this.setSize(width,height);
        this.setLocation(xLocation,yLocation);
//        setContentAreaFilled(false);

    }
}
