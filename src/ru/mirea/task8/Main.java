package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        /*1st task*/ ShowShapesFrame(frame);
        frame.setVisible(true);

    }
    public static void ShowShapesFrame(JFrame frame)
    {
        // Create shapes
        Shapes shapes = new Shapes();
        // Add shapes
        frame.add(shapes);
    }
}