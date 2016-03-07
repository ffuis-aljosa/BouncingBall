package bouncingball;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BouncingBall {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        
        frame.setSize(800, 600);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        panel.setBackground(Color.red);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
