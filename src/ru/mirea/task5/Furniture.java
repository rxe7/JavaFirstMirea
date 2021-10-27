package ru.mirea.task5;

public abstract class Furniture
{
    String title;
    int price;
}

class Sofa extends Furniture
{
    Sofa(String title_, int price_)
    {   this.title = title_;
        this.price = price_;
    }
}

class Bed extends Furniture
{
    Bed(String title_, int price_)
    {   this.title = title_;
        this.price = price_;
    }
}

