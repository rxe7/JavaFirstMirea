package ru.mirea.task6;

public class Animal implements Nameable
{
    String name;
    Animal(String name_)
    {   this.name = name_;
    }
    public String getName()
    {   return this.name;
    }
}
