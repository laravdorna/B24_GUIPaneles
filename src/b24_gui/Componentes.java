/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b24_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author lvazquezdorna
 */
public class Componentes {

    JFrame marco;
    JPanel panel, panel1, panel2;
    JLabel lNome, lPassword;
    JTextField tfNome;
    JPasswordField pfPassword;
    JButton premer, limpar, boton;
    JTextArea atComentarios;
    JList lItems;
    String[] items = {"Element", "HOLA", "adios"};

    public void instanciarComponentes() {

        //inicializar
        marco = new JFrame("Boletin 24");
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        premer = new JButton("PREMER");
        limpar = new JButton("LIMPAR");
        boton = new JButton("boton");
        lNome = new JLabel("NOME: ");
        tfNome = new JTextField();
        lPassword = new JLabel("PASSWORD: ");
        pfPassword = new JPasswordField(6);
        atComentarios = new JTextArea("Area de texto ", 20, 10);
        lItems = new JList(items);

        //caracteristicas
        marco.setSize(600, 800);
        panel.setSize(600, 800);
        panel1.setSize(250, 300);
        panel2.setSize(250, 300);
        panel.setBackground(Color.yellow);
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.BLUE);

    }

    public void crearVentana() {

        instanciarComponentes();
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
        instanciarComponentes();
        panel1.add(lNome);
        panel1.add(tfNome);

        panel1.add(lPassword);
        panel1.add(pfPassword);

        panel1.add(premer);
        panel1.add(limpar);

    }

    public void ordenarPanel2() {
        instanciarComponentes();
        panel2.add(atComentarios);
        panel2.add(lItems);
        panel2.add(boton);

    }

    /*
 public void boxLayaut() {
        instanciarComponentes();

        //linea que eliges el eje de cordenadas
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //hacer visible el marco 
        añadirComponentes();
        marco.setVisible(true);
        //que cierre cuando se le de a la x
        marco.setDefaultCloseOperation(3);//el 3 es la constante JFrame.EXIT_ON_CLOSE

    }
    public void crearPanel1() {
        instanciarComponentes();

    }

    public void crearPanel2() {

    }
     */
}
