import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//need this for listeners
public class Main
{
    public static void main(String[] args)
    {
        //JFrame myFrame = new JFrame();
        JFrame myFrame2 = new JFrame();

        myFrame2.setSize(500,500);

        //DrawPanel myPanel = new DrawPanel();
        BallPanel myPanel2 = new BallPanel();

        //myFrame.add(myPanel);
        myFrame2.add(myPanel2);

        myFrame2.setVisible(true);
    }
}
