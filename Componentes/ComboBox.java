package Componentes;

import Classes.Restaurante;

import javax.swing.JComboBox;
import java.util.ArrayList;
import java.util.Vector;

public class ComboBox{
    public ComboBox(ArrayList<Restaurante> res) {
        JComboBox<Restaurante> comboBox = new JComboBox<>(new Vector<>(res));
        comboBox.setBounds(50, 50, 200, 100);
    }
}
