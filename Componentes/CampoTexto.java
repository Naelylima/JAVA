package Componentes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class CampoTexto extends JTextField {
    public CampoTexto(int width, int height, int Xlocation, int Ylocation){
        this.setSize(width,height);
        this.setLocation(Xlocation,Ylocation);
        this.setBackground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(Color.white));
        this.setForeground(Color.white);
        Font font1 = new Font("Sans", Font.TRUETYPE_FONT, 16);
        this.setFont(font1);


    }



}
