package ru.mirea.task5;

public abstract class Dish
{
    String name;
}

class Tarelka extends Dish
{
    int radius;

    Tarelka(String name_, int radius_)
    {   this.name   = name_;
        this.radius = radius_;
    }
}

class Vilka extends Dish
{
    int size;

    Vilka(String name_, int size_)
    {   this.name   = name_;
        this.size = size_;
    }
}