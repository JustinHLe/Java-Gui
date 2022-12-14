package com.java.gui.openwindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton btn = new JButton("New Window");

    public LaunchPage(){

        btn.setBounds(100, 160, 200, 40);
        btn.setFocusable(false);
        btn.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(btn);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == this.btn){
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
