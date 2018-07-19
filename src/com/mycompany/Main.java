package com.mycompany;

import javax.swing.*;

public class Main extends JFrame{
    
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        this.setSize(700, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Complementary color");

        this.setVisible(true);
    }
}
