package ru.mirea.task3;

public class Book
{
    String author;
    String title;
    int    year;

    Book(String author_, String title_, int year_)
    {   this.author = author_;
        this.title  = title_;
        this.year   = year_;
    }

    public String getAuthor() {return author;}
    public String getTitle()  {return title; }
    public int getYear()   {return year;  }

    public String toString()
    {   return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
