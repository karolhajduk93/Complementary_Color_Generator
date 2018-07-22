package com.mycompany;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Main extends JFrame{

    JColorChooser colorChooser;
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
        draw = new Draw(color);
        colorChooser = new JColorChooser(Color.BLACK);
        colorChooser.getSelectionModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                color = colorChooser.getColor();
                draw.setColor(color);
                draw.revalidate();
                draw.repaint();
            }
        });
        panel.add(colorChooser);


        this.add(draw, BorderLayout.CENTER);
        this.add(panel, BorderLayout.PAGE_END);
        this.setVisible(true);
    }
}
