package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class Draw extends JComponent {

    Color color;
    @Override
    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(color);
        //g2.
        g2.drawRect(20, 20, 100, 100);
        g2.fillRect(20, 20, 100, 100);
    }



    public void setColor(Color color) {
        this.color = color;
    }

    public Draw(Color color){
        this.color = color;
    }
}
