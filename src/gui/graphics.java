package gui;

import data.logic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kristian on 04/05/2015.
 */
public class graphics {
    JTextArea jTextArea = new JTextArea();
    JWindow jWindow = new JWindow();
    JLayeredPane jLayeredPane = new JLayeredPane();
    data.logic Logic = new logic();

    public void test(int width, int height) {
        JPanel jPanel = new JPanel();

        jWindow.setLayout(new BorderLayout());
        jWindow.setAlwaysOnTop(true);
        jWindow.setBackground(new Color(0, 0, 0, 0));
        jWindow.setPreferredSize(new Dimension(width, height));
        jWindow.setLocation(Logic.setWidthLocation(), 10);
        jWindow.setOpacity(0.66f);
        jWindow.add(jLayeredPane, BorderLayout.CENTER);

        jLayeredPane.setBounds(0, 0, width, height);
        jPanel.setBounds(0, 0, width, height);
        jPanel.setBackground(Color.black);
        jPanel.setOpaque(true);

        Font font = new Font("Verdana", Font.BOLD, 34);
        jTextArea.setBounds(0, 0, width, height);
        jTextArea.setBackground(new Color(0, 0, 0, 0));
        jTextArea.setForeground(Color.white);
        jTextArea.setFont(font);
        jTextArea.setEditable(false);

        jLayeredPane.add(jPanel, 0, 0);
        jLayeredPane.add(jTextArea, 1, 0);

        jWindow.pack();
        jWindow.setVisible(true);
    }

    public void updateTime(String time) {
        SwingUtilities.invokeLater(() -> jTextArea.setText(time));
        jWindow.repaint();
    }
}
