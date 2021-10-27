package ru.mirea.task3;

public class Human
{
    String name;
    int age;
    Leg leg;
    Hand hand;
    Head head = new Head();

    Human(String name_, int age_)
    {   this.name = name_;
        this.age  = age_;
        this.leg = new Leg(2);
        this.hand = new Hand(2);
    }

    Human(String name_, int age_, int legs)
    {   this.name = name_;
        this.age  = age_;
        this.leg = new Leg(legs);
        this.hand = new Hand(2);
    }

    Human(String name_, int age_, int legs, int hands)
    {   this.name = name_;
        this.age  = age_;
        this.leg = new Leg(legs);
        this.hand = new Hand(hands);
    }

    public int getAge()
    {   return age;
    }

    public void setAge(int age)
    {   this.age = age;
    }

    public String getName()
    {   return name;
    }

    public String toString()
    {   return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Leg
{
    int numberOfLegs;
    Leg(int leg)
    {   this.numberOfLegs = leg;
    }
}

class Hand
{
    int numberOfHand;
    Hand(int hand)
    {   this.numberOfHand = hand;
    }
}

class Head
{
    /* Свойста... */
}