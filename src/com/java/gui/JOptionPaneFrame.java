package com.java.gui;

import javax.swing.*;

public class JOptionPaneFrame {

    //JOptionFrame is a modal that pop ups to inform the user about something

    public JOptionPaneFrame(){
//        JOptionPane.showMessageDialog(null, "Modal Opened", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Modal Opened", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Modal Opened", "title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Modal Opened", "title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Modal Opened", "title", JOptionPane.ERROR_MESSAGE);


//        int answer = JOptionPane.showConfirmDialog(null, "Confirming", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("What is your name? ");
//        System.out.println(name);
        String[] response = {"No you're awesome", "hi", "goodbye", "thanks"};
        JOptionPane.showOptionDialog(null, "you are awesome", "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null , response, 0);
    }
}
