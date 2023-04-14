import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
public class BallPanel extends JPanel
{
    Ball blah;
    ArrayList <Ball> ballz = new ArrayList<>();

    public BallPanel() {

        blah = new Ball(this);
        setBackground(Color.RED);
        this.setFocusable(true);
        setPreferredSize(new Dimension(500,500));
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("HI");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                System.out.println(key);
                System.out.println("testing");
                if (key == 38)
                {
                    blah.moveUp();
                }
                if (key == 37)
                {
                    blah.moveLeft();
                }
                if (key == 39)
                {
                    blah.moveRight();
                }
                if (key == 40)
                {
                    blah.moveDown();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

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
            Thread.sleep(1);
        }
        catch(Exception e) {
            System.out.println(e);
        }


        repaint();
    }


}