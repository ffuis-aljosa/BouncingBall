package bouncingball;

import javax.swing.JFrame;

public class Frame extends JFrame {

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;
    
    private Panel panel;
    
    public Frame() {
        setTitle("Bouncing Ball");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        panel = new Panel();
        
        add(panel);
        
        setVisible(true);
    }
    
}
