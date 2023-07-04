package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private final JTextField inputField;
    private final JLabel computerLabel;
    private final JButton playButton;

    public JButton getMakeMoveButton() {
        return playButton;
    }

    public JTextField getCityTextField() {
        return inputField;
    }

    public JLabel getComputerResponseLabel() {
        return computerLabel;
    }

    public GameWindow() {
        setTitle("Гра Міста");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inputField = new JTextField();
        computerLabel = new JLabel();
        computerLabel.setText("Компьютер:");
        playButton = new JButton("Зробити хід");

        JPanel panel = new JPanel();
        JLabel cityLabel = new JLabel();
        cityLabel.setText("Введіть назву міста:");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(1, 2));
        panel.add(cityLabel);
        panel.add(inputField);
        //panel1.add(playButton,BorderLayout.WEST);
        //panel1.add(computerLabel);
        panel1.setLayout(new GridLayout(1, 2));
        panel1.add(playButton);
        panel1.add(computerLabel);
        JLabel imageLabel = new JLabel();
        panel2.add(imageLabel,BorderLayout.CENTER);
        ImageIcon image=new ImageIcon("logo.png");
        Image scaledImage = image.getImage().getScaledInstance(500, 310, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        imageLabel.setIcon(scaledIcon);

        add(panel, BorderLayout.NORTH);
        add(panel1,BorderLayout.CENTER);
        add(panel2,BorderLayout.SOUTH);

        setVisible(true);
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playButton.doClick(); // Enter = "Зробити хід"
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameWindow::new);
    }
}

