package com.java.gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        this.setTitle("Weed Frame");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420); //sets x dimension and y dimension
        this.setVisible(true);
        ImageIcon image = new ImageIcon("C://Users/Justin/Java/Java Gui/src/com/java/gui/weed.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(100,150,100));

    }
}
