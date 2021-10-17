package ru.mirea.task2;

import java.util.Vector;

public class TestDog
{
    Vector<Dog> dogs = new Vector<Dog>();

    public void addDogs(Dog dog)
    {   this.dogs.add(dog);
    }

    public void addDogs(Dog[] dogs_)
    {   if (dogs_ == null) return;
        for (Dog dog : dogs_)
        {   this.dogs.add(dog);
        }
    }

    public void removeDog(int index)
    { this.dogs.remove(index);
    }
}
