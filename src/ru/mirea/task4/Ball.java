package ru.mirea.task4;

public class Ball
{
    double x = 0.0;
    double y = 0.0;

    Ball() {}
    Ball(double x_, double y_)
    {   this.x = x_;
        this.y = y_;
    }

    public double getX()         {return x;}
    public void   setX(double x) {this.x = x;}

    public double getY()         {return y;}
    public void   setY(double y) {this.y = y;}

    public void setXY(double x_, double y_)
    {   this.x = x_;
        this.y = y_;
    }

    public void move(double xDisp, double yDisp)
    {   this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString()
    {   return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
