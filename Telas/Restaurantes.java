package Telas;

import Classes.Lanche;
import Classes.Pedido;
import Classes.Restaurante;
import Componentes.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

public class Restaurantes extends JFrame {

   private JPanel panel;
   public Janela restaurantes = new Janela("Classes.Aplicativo", "src/Images/restaurantes2.png");
   CadastrarRestaurantes cadastro = new CadastrarRestaurantes();
//   public Pedido pedido = new Pedido("1");


    //        Escolha do restaurante

    public Restaurantes() {
        restaurantes.setVisible(false);


//        BOTÕES
        Botao carrinho = new Botao(50,50,26,75);
        carrinho.addActionListener(e -> System.out.println("aq"));

//       COMBO BOX
        ArrayList<Restaurante>res = cadastro.restaurante.restaurantes;
        JComboBox<Restaurante> comboBox = new JComboBox<>(new Vector<>(res));
        comboBox.setBounds(100, 110, 200, 30);


        String teste ;
        teste=(comboBox.getSelectedItem().toString());
        Restaurante restaurante1 = new Restaurante(teste);
        restaurante1.adicionarLanche(new Lanche("lanchão restaurante", 11.0));
        restaurante1.adicionarLanche(new Lanche("lanchão 2 restaurante", 11.0));




//        System.out.println("combo"+comboBoxes);

//      CHECK BOX

//        Instancia
        cadastro.restaurante.adicionarLanche(new Classes.Lanche("Big Mac", 50.0));

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        ArrayList<JCheckBox> checkBoxes = new ArrayList<>();
        ArrayList<String> cardapio = restaurante1.obterporRestaurante();


        for (int i = 0; i <= cardapio.size() - 1; i++) {
            JCheckBox checkBox = new JCheckBox(String.valueOf(cardapio.get(i)));
            checkBoxes.add(checkBox);
            panel.add(checkBox);
        }
        JButton button = new JButton("Obter Selecionados");
        button.addActionListener(e -> {
            StringBuilder selecionados = new StringBuilder("Opções selecionadas:\n");

            for (JCheckBox checkBox : checkBoxes) {
                if (checkBox.isSelected()) {
                    selecionados.append(checkBox.getText()).append("\n");
                }
            }
            JOptionPane.showMessageDialog(Restaurantes.this, selecionados.toString());
        });
        panel.add(button);
        panel.setBounds(40,215,305,368);


//        Adicionar a tela

        restaurantes.add(panel);
        restaurantes.add(comboBox);
        restaurantes.add(carrinho);

    }

}
