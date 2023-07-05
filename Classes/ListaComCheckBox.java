package Classes;

import Telas.CadastrarRestaurantes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListaComCheckBox extends JFrame {

    private JPanel panel;

    public ListaComCheckBox() {
        setTitle("Lista com Check Box");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        ArrayList<JCheckBox> checkBoxes = new ArrayList<>();
        CadastrarRestaurantes cadastro = new CadastrarRestaurantes();

        ArrayList<Restaurante>res = cadastro.restaurante.restaurantes;

        for (int i = 0; i <= res.size() - 1; i++) {
            JCheckBox checkBox = new JCheckBox(String.valueOf(res.get(i)));
            checkBoxes.add(checkBox);
            panel.add(checkBox);
            System.out.println(res.size());
        }

        JButton button = new JButton("Obter Selecionados");
        button.addActionListener(e -> {
            StringBuilder selecionados = new StringBuilder("Opções selecionadas:\n");

            for (JCheckBox checkBox : checkBoxes) {
                if (checkBox.isSelected()) {
                    selecionados.append(checkBox.getText()).append("\n");
                }
            }

            JOptionPane.showMessageDialog(ListaComCheckBox.this, selecionados.toString());
        });

        panel.add(button);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ListaComCheckBox::new);
    }
}
