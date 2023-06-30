package Componentes;

import javax.swing.*;
import java.awt.*;

public class Text extends JLabel {
    public Text(String texto){
        this.setBounds(100,100,400,300);
        this.setForeground(new Color(255,0,200));
        this.setFont(new Font("Arial", Font.BOLD, 10));
        this.setText(texto);
    }
}
