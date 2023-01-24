import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
public class BallPanel extends JPanel
{
    Ball blah;
    ArrayList <Ball> ballz = new ArrayList<>();

    public BallPanel()
    {
        setFocusable(true);
        blah = new Ball(this);
        setBackground(Color.RED);
        addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int key = e.getKeyCode();
                if (key == 68);
                //blah.moveRight();
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }



//        for (int i = 0; i < 1;i++)
//        {
//            ballz.add(new Ball(this));
//        }
    });
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

}