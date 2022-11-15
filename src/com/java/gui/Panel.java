package com.java.gui;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public Panel(){
        ImageIcon image = new ImageIcon("C://Users/Justin/Java/Java Gui/src/com/java/gui/weed.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(new ImageIcon(new ImageIcon("C://Users/Justin/Java/Java Gui/src/com/java/gui/weed.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
//        label.setVerticalAlignment(JLabel.TOP); USED FOR BORDER LAYOUT
//        label.setHorizontalAlignment(JLabel.RIGHT); USED FOR BORDER LAYOUT
        label.setBounds(100, 100, 75, 75); // AVAILABLE WHEN NOT BORDER LAYOUT


        //JPanel is a GUI component that is used to hold other components
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);

        greenPanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);


    }
}
