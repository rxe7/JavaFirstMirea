package ru.mirea.task6;

public class main
{
    public static void main(String[] args)
    {
        /*
        * 1. Создайте интерфейс Nameable с методом getName(), возвращающим имя объекта, реализующего интерфейс.
        * Проверьте его работу для различных объектов (например, можно создать классы, описывающие разные сущности,
        * которые могут иметь имя: планеты, машины, животные и т. д.).
        */
        Animal ani = new Animal("Doge");

        /*
        * 2. Реализуйте интерфейс Priceable, имеющий метод getPrice(), возвращающий некоторую цену для объекта.
        * Проверьте его работу для различных классов, сущности которых могут иметь цену.
        */
        Product apple = new Product(2.99f);
    }
}