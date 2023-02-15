import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
public class BallPanel extends JPanel implements KeyListener
{
    Ball blah;
    ArrayList <Ball> ballz = new ArrayList<>();

    public BallPanel() {

        blah = new Ball(this);
        setBackground(Color.RED);
        addKeyListener(this);
        setFocusable(true);
//        for (int i = 0; i < 1;i++)
//        {
//            ballz.add(new Ball(this));
//        }
    }

        protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
       blah.DrawBall(g);
//        for (Ball balz:ballz)
//        {
//            balz.DrawBall(g);
//            //System.out.println("testing 123");
//        }
        try {
            Thread.sleep(10);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println("testing");
        if (key == KeyEvent.VK_W);
        {
            blah.moveUp();
        }
        if (key == KeyEvent.VK_A);
        {
            blah.moveLeft();
        }
        if (key == KeyEvent.VK_D);
        {
            blah.moveRight();
        }
        if (key == KeyEvent.VK_S);
        {
            blah.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}