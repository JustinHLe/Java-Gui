package com.java.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame implements ActionListener {
    private JButton btn;
    private JTextField textField;
    public TextField(){
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.red);
        textField.setBackground(Color.DARK_GRAY);
        textField.setCaretColor(Color.BLUE);
        textField.setText("Enter text");

        btn = new JButton("Submit");
        btn.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(btn);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            System.out.println(textField.getText());
            textField.setEditable(false);
            btn.setEnabled(false);
        }

    }
}
