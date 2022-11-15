package com.java.gui;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutFrame {

    // FlowLayout places components in a row, sized at their preferred size
    // if there is overflow it will move on to the next row
    public FlowLayoutFrame(){

        //default frame uses border layout
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));


        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);

        frame.setVisible(true);
    }
}
