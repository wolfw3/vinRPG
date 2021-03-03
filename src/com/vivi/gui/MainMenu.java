package com.vivi.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    private JPanel panel;
    private JButton btnNewGame;
    private JButton btnLoadGame;
    private JButton btnOptions;
    private JButton btnQuit;
    private JLabel lblTitle;
    JFrame frame = new JFrame("viviRPG");

    public MainMenu() {
        btnQuit.addActionListener(actionEvent -> System.exit(0));

        btnNewGame.addActionListener(actionEvent -> {
            new CharacterCreator().init();
            frame.setVisible(false);
            frame.dispose();
        });
    }

    public void init() {
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
