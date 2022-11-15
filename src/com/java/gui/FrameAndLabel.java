package com.java.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FrameAndLabel {

    public FrameAndLabel(){
        ImageIcon image = new ImageIcon("C://Users/Justin/Java/Java Gui/src/com/java/gui/weed.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);


        //JLabel is a GUI display area for text and images
        JLabel label = new JLabel();
        label.setText("Bro do you even code?!");
        label.setIcon(new ImageIcon(new ImageIcon("C://Users/Justin/Java/Java Gui/src/com/java/gui/weed.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        label.setHorizontalTextPosition(JLabel.CENTER); // set text center, left, or right of image horizontally
        label.setVerticalTextPosition(JLabel.TOP); // set text top, center, or bottom of image vertically
        label.setForeground(Color.green); //set font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); //set front (font name, style, size)
        label.setIconTextGap(100); //set gap between text and image
        label.setBackground(Color.black);
        label.setOpaque(true); //display bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical alignment of contents within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal alignment of contents within label
//        label.setBounds(100,100,250, 250); //positions label first two parameters is new position of label last two parameters are size of label


        //JFrame is a GUI window to add components to
        JFrame frame = new JFrame();
        frame.setTitle("Weed Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //without this line JFrame becomes hidden rather closed
        /*
            DO_NOTHING_ON_CLOSE - make closing the application impossible
            HIDE_ON_CLOSE - default value, hides the frame but does not exit program
         */
//        frame.setSize(420, 420); //sets x dimension and y dimension
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
//        frame.setLayout(null);
        frame.add(label);
        frame.pack(); //automatically set frame size to hold all components within the label

//        frame.getContentPane().setBackground(new Color(255,255,255)); //set frame Color
//        System.out.println(new File("").getAbsolutePath());
//        frame.setResizable(false); // makes frame resizable or not
//        new MyFrame();



    }
}
