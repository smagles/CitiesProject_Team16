package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeWindow extends JFrame {

    public WelcomeWindow() {
        setTitle("Гра Міста");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Ласкаво просимо до гри Міста!");
        JButton startButton = new JButton("Старт");
        getRootPane().setDefaultButton(startButton);

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(startButton);

        add(panel);

        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Закрити вітальне вікно
                openGameWindow(); // Відкрити вікно гри
                new UserTurn().makeMove();
            }
        });
    }

    private void openGameWindow() {
        GameWindow gameWindow = new GameWindow();
        gameWindow.setVisible(true);
    }
}