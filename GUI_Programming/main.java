package Main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static class Line extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;
            //Line 1
            g2.drawLine(50, 500, 250, 500);
            g2.drawLine(300, 500, 500, 500);
            g2.drawLine(550, 500, 750, 500);
        }
    }

    public static void main(String[] args) {

        JFrame window = new JFrame("My First Java Game");

        window.setSize(800, 600);
        window.setLayout(null);

        // Create text
        JLabel label = new JLabel("Hello World");
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // x, y, width, height
        label.setBounds(250, 50, 300, 40);

        window.add(label);

        // Create drawing panel
        Line line = new Line();
        line.setBounds(0, 0, 800, 600);
        window.add(line);
        
        //Add a checkbox
        JCheckBox checkBox = new JCheckBox("Enable tutorial");

        //Checkbox panel x,y,width, height
        checkBox.setBounds(325, 260,125, 26);

        window.add(checkBox);
        
        //Add to delegate, the method to call when the checkbox
        //state has changed
        checkBox.addActionListener(e -> {
            if (checkBox.isSelected()) {
                System.out.println("Welcome to Tic-Tac-Toe!");
            } else {
                System.out.println("Tutorial OFF");
            }
        });
        
        //Radio button1
        JRadioButton easyButton = new JRadioButton("Easy");
        JRadioButton mediumButton = new JRadioButton("Medium");
        JRadioButton hardButton = new JRadioButton("Hard");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(easyButton);
        buttonGroup.add(mediumButton);
        buttonGroup.add(hardButton);
        
        easyButton.setBounds(325, 90,125, 26);
        mediumButton.setBounds(325, 110,125, 26);
        hardButton.setBounds(325, 130,125, 26);
        
        window.add(easyButton);
        window.add(mediumButton);
        window.add(hardButton);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
