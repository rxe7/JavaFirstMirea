package ru.mirea.task7;

public abstract class Shape
{
    protected String color;
    protected boolean filled;

    Shape() {}
    Shape(String color, boolean filled)
    {   this.color  = color;
        this.filled = filled;
    }

    public String getColor()
    {   return color;
    }
    public void setColor(String color)
    {   this.color = color;
    }

    public boolean isFilled()
    {   return filled;
    }

    public void setFilled(boolean filled)
    {   this.filled = filled;
    }
/*
    public double getArea()
    {
    }

    public double getPerimeter()
    {
    }
*/
    public String toString()
    {   return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circle extends Shape
{
    protected double radius;
    Circle() {}
    Circle(double radius, String color, boolean filled)
    {   this.radius = radius;
        this.color  = color;
        this.filled = filled;
    }

    public double getRadius()
    {   return radius;
    }

    public void setRadius(double radius)
    {   this.radius = radius;
    }

    public double getArea()
    {   return Math.PI*(this.radius*this.radius);
    }
    public double getPerimeter()
    {   return 2*this.radius*Math.PI;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
}

class Rectangle extends Shape
{
    protected double width;
    protected double length;

    Rectangle() {}
    Rectangle(double width, double length)
    {   this.length = length;
        this.width  = width;
    }
    Rectangle(double width, double length, String color, boolean filled)
    {   this.width  = width;
        this.length = length;
        this.color  = color;
        this.filled = filled;
    }

    public double getWidth()
    {   return width;
    }

    public void setWidth(double width)
    {   this.width = width;
    }

    public double getLength()
    {   return length;
    }

    public void setLength(double length)
    {   this.length = length;
    }

    public double getArea()
    {   return this.width*this.length;
    }

    public double getPerimeter()
    {   return this.width*2 + this.length*2;
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

class Square extends Rectangle
{
    Square(){}
    Square(double side)
    {   this.width  = side;
        this.length = side;
    }
    Square(double side, String color, boolean filled)
    {   this.width  = side;
        this.length = side;
        this.color  = color;
        this.filled = filled;
    }

    public double getSide()
    {   return this.width;
    }
    public void setSide(double side)
    {   this.width  = side;
        this.length = side;
    }
}








