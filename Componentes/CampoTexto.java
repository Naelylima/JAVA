package Componentes;

import javax.swing.*;

public class CampoTexto extends JTextField {
    public CampoTexto(int width, int height, int Xlocation, int Ylocation){
        this.setSize(width,height);
        this.setLocation(Xlocation,Ylocation);
    }
}
