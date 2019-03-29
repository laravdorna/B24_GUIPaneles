/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b24_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author lvazquezdorna
 */
public class Componentes implements ActionListener {

    JFrame marco;
    JPanel panel, panel1, panel2;
    JLabel lNome, lPassword;
    JTextField tfNome;
    JPasswordField pfPassword;
    JButton bPremer, bLimpar, boton;
    JTextArea atComentarios;
    JList lItems;
    String[] items = {"DAM1", "DAM2", "ASIR1", "ASIR2"};

    /**
     * ***********************************
     ** METODOS DE VISUALIZACION DEL GUI **
     * ************************************
     */
    public void instanciarComponentesVentana() {

        //inicializar
        marco = new JFrame("Boletin 24");
        panel = new JPanel();

        //caracteristicas
        marco.setSize(600, 800);
        panel.setSize(600, 800);
        panel.setBackground(Color.yellow);
    }

    public void instanciarPanel1() {
        panel1 = new JPanel();
        bPremer = new JButton("PREMER");
        bLimpar = new JButton("LIMPAR");
        lNome = new JLabel("NOME: ");
        tfNome = new JTextField();
        lPassword = new JLabel("PASSWORD: ");
        pfPassword = new JPasswordField(6);

        panel1.setSize(250, 300);
        panel1.setBackground(Color.red);

    }

    public void instanciarPanel2() {
        panel2 = new JPanel();
        boton = new JButton("boton");
        atComentarios = new JTextArea("Area de texto ", 20, 10);
        lItems = new JList(items);

        panel2.setSize(250, 300);
        panel2.setBackground(Color.BLUE);
    }

    public void crearVentana() {
        instanciarComponentesVentana();
        ordenarPanel1();
        ordenarPanel2();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(panel1);
        panel.add(panel2);

        marco.add(panel);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);

    }

    public void ordenarPanel1() {
        instanciarPanel1();
        panel1.add(lNome);
        panel1.add(tfNome);

        panel1.add(lPassword);
        panel1.add(pfPassword);

        panel1.add(bPremer);
        panel1.add(bLimpar);

    }

    public void ordenarPanel2() {
        instanciarPanel2();
        panel2.add(lItems);
        panel2.add(atComentarios);
        panel2.add(boton);

    }

    /**
     * ***********************************
     ** METODOS DE CREACION DE EVENTOS ** ***********************************
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bLimpar) {
            //poner en blanco todos los campos
            tfNome.setText("");
            pfPassword.setText("");
            atComentarios.setText("");
            lItems.clearSelection();
        } else if (e.getSource() == bPremer) {

        } else if (e.getSource() == boton) {
            if (lItems.isSelectionEmpty() == true) {
                atComentarios.setText(tfNome.getText()
                        + "\nCurso sin seleccionar");
            } else {
                atComentarios.setText(tfNome.getText() + "\n"
                        + lItems.getSelectedValue());

            }
        }
    }

}
