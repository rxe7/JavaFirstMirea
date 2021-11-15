package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Shapes extends JComponent
{
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        Rectangle2D.Double rect = new Rectangle2D.Double(50, 50, 100, 150);
        g2d.setColor(Color.RED);
        g2d.fill(rect);

        rect = new Rectangle2D.Double(150, 150, 100, 100);
        g2d.setColor(new Color(59, 70, 90));
        g2d.fill(rect);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(250, 10, 100, 100);
        g2d.setColor(new Color(100, 20, 10));
        g2d.fill(ellipse);

        ellipse = new Ellipse2D.Double(250, 100, 50, 300);
        g2d.setColor(new Color(10, 10 , 255));
        g2d.fill(ellipse);

        Line2D.Double line = new Line2D.Double(10, 10, 500, 500);
        g2d.setColor(Color.BLACK);
        g2d.draw(line);

        /**/
        rect = new Rectangle2D.Double(450, 450, 100, 100);
        g2d.setColor(new Color(59, 70, 90));
        g2d.fill(rect);

        ellipse = new Ellipse2D.Double(450, 40, 100, 100);
        g2d.setColor(new Color(100, 20, 10));
        g2d.fill(ellipse);

        ellipse = new Ellipse2D.Double(450, 400, 50, 300);
        g2d.setColor(new Color(10, 10 , 255));
        g2d.fill(ellipse);

        line = new Line2D.Double(40, 40, 500, 500);
        g2d.setColor(Color.BLACK);
        g2d.draw(line);

    }
}
