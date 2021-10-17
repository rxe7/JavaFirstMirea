package ru.mirea.task1;

import java.util.Scanner;
import java.util.Random;

public class task1
{
    static Scanner scan;

/********************************************************************************************/
    public static void main(String[] args)
    {   scan = new Scanner(System.in); // Ввод с консоли

        /*
        * 3. Разработайте программу, в результате работы которой
        *    считается сумма элементов целочисленного массива
        *    с помощью циклов `for`, `while`, `do while`, результат выводится на экран.
        */
        //sumOfArrElem();

        /*
        * 4. Разработайте программу, в результате работы которой выводятся на экран
        *    аргументы командной строки в цикле `for`.
        * */
        //showCmdArgs(args);

        /*
        * 5. Разработайте программу, в результате работы которой выводятся на
        *    экран первые 10 чисел гармонического ряда (форматируйте вывод).
        * */
        //firstTenOfHarmSer();

        /*
        * 6. Разработайте программу, в результате работы которой генерируется
        * массив целых чисел случайным образом, выведите его на экран,
        * отсортируйте, и снова выведите на экран (используйте два подхода
        * к генерации случайных чисел – метод `random()` класса `Math` и класс `Random`).
        * */
        //randArraySort();

        /*
        * Разработайте программу, которая будет с помощью метода
        * вычислять факториал числа (используйте управляющую конструкцию цикла),
        * проверьте работу метода.
        * */
        //faktorial();
    }

/********************************************************************************************/

    public static void sumOfArrElem()
    {   int[] array = new int[10];
        int summary = 0;

        System.out.print("Введите 10 целочисленных чисел: ");

        for(int i = 0; i < 10; i++)
        {   array[i] = scan.nextInt();
            summary += array[i];
        }

        System.out.print("Сумма чисел массива: " + summary);
    }

    public static void showCmdArgs(String[] args)
    {   for (String s: args)
        {   System.out.println(s);
        }
    }

    public static void firstTenOfHarmSer()
    {   for (float i = 1; i < 10; i++)
        {   System.out.printf("%.2f; ", 1/i);
        }
    }

    public static void randArraySort()
    {   Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) // Заполняем массив и выводим
        {   arr[i] = rand.nextInt(99) + 1; // 1...99
            System.out.print(arr[i] + ", ");
        }

        for(int i = arr.length-1 ; i > 0 ; i--) // Сортируем
        {   for(int j = 0 ; j < i ; j++)
            {   if( arr[j] > arr[j+1] )
                {   int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        System.out.println();

        for(int i = 0; i < 10; i++) // Выводим
        {   System.out.print(arr[i] + ", ");
        }
    }

    public static void faktorial()
    {   int fakt = scan.nextInt();
        int sum = 1;

        for(int i = 1; i <= fakt; i++)
        {   sum *= i;
        }
        System.out.println(sum);
    }
}
