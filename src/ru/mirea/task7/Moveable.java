package ru.mirea.task7;

public interface Moveable
{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MoveablePoint implements Moveable
{
    // [0,0] координата лево-вверх приложения
    int x=0, y=0;
    int xSpeed=1, ySpeed=1;

    MoveablePoint(){}

    MoveablePoint(int x, int y, int xSpeed, int ySpeed)
    {   this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp()
    {   this.y -= ySpeed;
    }

    @Override
    public void moveDown()
    {   this.y += ySpeed;
    }

    @Override
    public void moveLeft()
    {   this.x -= xSpeed;
    }

    @Override
    public void moveRight()
    {   this.x += xSpeed;
    }

    public String toString()
    {   return "MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

class MoveableCircle extends MoveablePoint
{
    int radius=1;
    MoveablePoint center;

    MoveableCircle()
    {   this.center = new MoveablePoint();
    }

    MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {   this.radius = radius;
        this.center = new MoveablePoint(this.x, this.y, this.xSpeed, this.ySpeed);
    }

    @Override
    public void moveUp()
    {   this.center.moveUp();
    }

    @Override
    public void moveDown()
    {   this.center.moveDown();
    }

    @Override
    public void moveLeft()
    {   this.center.moveLeft();
    }

    @Override
    public void moveRight()
    {   this.center.moveRight();
    }

    @Override
    public String toString()
    {   return "MoveableCircle{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", radius=" + radius +
                ", center=" + center +
                '}';
    }
}

class MoveableRecrangle extends MoveablePoint
{
    MoveablePoint topLeft;
    MoveablePoint bottomRight;

    MoveableRecrangle()
    {   topLeft     = new MoveablePoint();
        bottomRight = new MoveablePoint();
    }

    MoveableRecrangle(int x, int y, int x2, int y2, int xSpeed, int ySpeed)
    {   this.topLeft = new MoveablePoint(x, y, xSpeed, ySpeed);
        this.bottomRight = new MoveablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp()
    {   topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown()
    {   topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft()
    {   topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight()
    {   topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString()
    {   return "MoveableRecrangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}






