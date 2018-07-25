package com.mycompany;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    JButton colorChooser;
    JPanel panel;
    Draw draw;
    Color color;

    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        this.setSize(700, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Complementary color");

        panel = new JPanel();

        JLabel label = new JLabel("Chosen color");


        draw = new Draw(color);
        colorChooser = new JButton();

        ImageIcon butIcon = new ImageIcon("C:\\Users\\Karol_Hajduk\\IdeaProjects\\Complementary_Color\\color.png");
        Image img = butIcon.getImage();
        Image newimg = img.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;
        butIcon = new ImageIcon( newimg );

        colorChooser.setIcon(butIcon);
        colorChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = JColorChooser.showDialog(null, "Pick your color", Color.BLACK);
                draw.setColor(color);

                //draw.revalidate();
                draw.repaint();
            }
        });

        panel.add(colorChooser, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER);

        this.add(panel, BorderLayout.NORTH);
        this.add(draw, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
