package com.java.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox extends JFrame implements ActionListener {
    //JCheckbox is a GUI component that can be selected or deselected
    private JButton btn;
    private JCheckBox checkBox;
    public Checkbox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btn = new JButton();
        btn.setText("submit");
        btn.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("Check me");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 24));

        this.add(checkBox);
        this.add(btn);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.btn){
            System.out.println(checkBox.isSelected());
        }
    }



}
