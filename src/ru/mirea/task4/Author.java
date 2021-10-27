package ru.mirea.task4;

public class Author
{
    String name;
    String email;
    char gender;

    Author(String name_, String email_, char gender_)
    {   this.name   = name_;
        this.email  = email_;
        this.gender = gender_;
    }

    public String getName() { return this.name; }

    public String getEmail() {return email;}
    public void setEmail(String email_) {this.email = email_;}

    public char getGender() {return gender;}

    public String toString()
    {   return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
