package bouncingball;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener {
    
    private final int BALL_SIZE = 50;
    private final int INIT_BALL_X = 50;
    private final int INIT_BALL_Y = 100;
    private final int BALL_SPEED_X = 7;
    private final int BALL_SPEED_Y = 5;
    private int ballDirectionX = 1;
    private int ballDirectionY = -1;
    
    private final BasicStroke mainStroke = new BasicStroke(2);
    
    Ellipse2D.Float ball;
    Timer timer;
    
    public Panel() {
        setBackground(Color.WHITE);
        
        ball = new Ellipse2D.Float(INIT_BALL_X, INIT_BALL_Y, BALL_SIZE, BALL_SIZE);
        
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2D.setPaint(Color.red);
        g2D.fill(ball);
        
        g2D.setPaint(Color.black);
        g2D.setStroke(mainStroke);
        g2D.draw(ball);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        handleBounce();
        moveBall();
        repaint();
    }
    
    private void handleBounce()
    {
        Dimension size = this.getSize();
        
        if (ball.y <= 0 || ball.y + ball.height >= size.height)
            ballDirectionY *= -1;
        if (ball.x <= 0 || ball.x + ball.width >= size.width)
            ballDirectionX *= -1;
    }
    
    private void moveBall()
    {
        ball.x += ballDirectionX * BALL_SPEED_X;
        ball.y += ballDirectionY * BALL_SPEED_Y;
    }
}
