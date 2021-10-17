package ru.mirea.task2;

public class Shape
{
    String type;
    int angles;

    Shape(String type_, int angles_)
    {   this.type = type_;
        this.angles = angles_;
    }

    public String toString()
    {
        return "Shape{" +
                "type=" + type +
                ", angles=" + angles +
                '}';
    }
}
