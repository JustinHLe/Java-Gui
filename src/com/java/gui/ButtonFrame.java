package com.java.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    public ButtonFrame(){
        ImageIcon image = new ImageIcon("C://Users/Justin/Java/Java Gui/src/com/java/gui/weed.png");

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Click me");
        button.setFocusable(false);
        button.setIcon(new ImageIcon(new ImageIcon("C://Users/Justin/Java/Java Gui/src/com/java/gui/weed.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 24));
        button.setForeground(Color.cyan);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

//        button.addActionListener(e -> { lambda expression does the same things as line 12
//            System.out.println("Btn clicked");
//        });
        label = new JLabel();
        label.setText("I am a label");
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Btn clicked");
        if(e.getSource() == this.button){
            System.out.println("Btn clicked");
            this.label.setVisible(true);
        }
    }
}
