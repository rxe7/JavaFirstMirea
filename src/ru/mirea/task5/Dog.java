package ru.mirea.task5;

public abstract class Dog
{
    String name;
    int age;
    String nameOfPoroda;
}

class Poroda1 extends Dog
{
    Poroda1(String name_, int age_)
    {   this.name         = name_;
        this.age          = age_;
        this.nameOfPoroda = "Poroda1";
    }
}

class Poroda2 extends Dog
{
    Poroda2(String name_, int age_)
    {   this.name         = name_;
        this.age          = age_;
        this.nameOfPoroda = "Poroda2";
    }
}