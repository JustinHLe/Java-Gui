package com.java.gui.openwindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    private JFrame frame = new JFrame();
    private JLabel label = new JLabel("hello");
    public NewWindow(){

        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 24));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

    }
}
