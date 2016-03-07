package bouncingball;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener {

    Ellipse2D.Float ball = new Ellipse2D.Float(50, 100, 150, 150);
    Timer timer;
    
    public Panel() {
        setBackground(Color.WHITE);
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setPaint(Color.red);
        g2D.fill(ball);
        
        g2D.setPaint(Color.black);
        g2D.setStroke(new BasicStroke(5));
        g2D.draw(ball);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ball.x += 2;
        ball.y += 1;
        
        repaint();
    }
    
}
