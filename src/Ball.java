import java.awt.*;
import javax.swing.*;
public class Ball
{
  //im in replit
    private int x = 0;
    private int y = 0;
    private int size = 0;
    private int xSpeed = 0;
    private int ySpeed = 0;
    //String color = 0;
    private int random1 = (int)((Math.random()*10)+5);
    private int random2 = (int)((Math.random()*100)+20);
    private int random3 = (int)((Math.random()*10)+5);
    BallPanel ballie;
    Color rainbow = Color.BLUE;
    public Ball(BallPanel ballie)
    {
        this.ballie = ballie;
        x = random1;
        y = random1;
        size = random2;
        xSpeed = random3;
        ySpeed = random3;
        rainbow = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    }

    public void DrawBall(Graphics bull)
    {
        bull.setColor(rainbow);
        bull.fillOval(x,y,size,size);
//        x+= xSpeed;
//        y+= ySpeed;
        if (x >= ballie.getWidth()-size || x <= 0)
        {
            xSpeed *= -1;
        }
        if (y >= ballie.getHeight()-size || y <= 0)
        {
            ySpeed *= -1;
        }
    }
    public void moveRight ()
    {
        x += xSpeed;
    }
    public void moveLeft ()
    {
        x -= xSpeed;
    }
    public void moveUp ()
    {
        y += ySpeed;
    }
    public void moveDown ()
    {
        y -= ySpeed;
    }
}