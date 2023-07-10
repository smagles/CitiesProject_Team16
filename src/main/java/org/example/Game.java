package org.example;

import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(WelcomeWindow::new);
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
