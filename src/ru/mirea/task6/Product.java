package ru.mirea.task6;

public class Product implements Priceable
{
    float price;
    Product(float price_)
    {   this.price = price_;
    }
    public float getPrice()
    {   return this.price;
    }
}
