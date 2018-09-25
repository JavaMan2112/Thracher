package com.company;

import javax.swing.*;

public class Main{
    public static void main(String[] args) {

        WindowEngine windowEngine = new WindowEngine();
        windowEngine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowEngine.setLocationRelativeTo(null);
        windowEngine.setVisible(true);
        windowEngine.setSize(580, 235);
        windowEngine.setResizable(false);


    }
}
