package com.yaba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1;
    private JMenuItem menuitem1, menuitem2, menuitem3;

    public Formulario(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Colores");
        menubar.add(menu1);

        menuitem1 = new JMenuItem("Rojo");
        menuitem1.addActionListener(this);
        menu1.add(menuitem1);

        menuitem2 = new JMenuItem("Verde");
        menuitem2.addActionListener(this);
        menu1.add(menuitem2);

        menuitem3 = new JMenuItem("Azul");
        menuitem3.addActionListener(this);
        menu1.add(menuitem3);
    }

    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();

        if(e.getSource() == menuitem1){
            fondo.setBackground(new Color(255,0,0));  // (Rojo, Verde, Azul)
        }
        if(e.getSource() == menuitem2){
            fondo.setBackground(new Color(0,255,0));
        }
        if(e.getSource() == menuitem3){
            fondo.setBackground(new Color(0,0,255));
        }
    }

    public static void main(String args[]){
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,400,300); // se le da dimensiones a la interfaz
        formulario1.setVisible(true); // quiero que se vea
        formulario1.setLocationRelativeTo(null);
    }
}