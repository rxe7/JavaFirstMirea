package ru.mirea.task2;

public class Dog
{
    String nickname;
    int age;

    Dog(String nickname_, int age_)
    {   this.nickname = nickname_;
        this.age      = age_;
    }

    public String getNickname()
    {   return nickname;
    }

    public void setNickname(String nickname_)
    {   this.nickname = nickname_;
    }

    public int getAge()
    {   return age;
    }

    public void setAge(int age_)
    {   this.age = age_;
    }

    public int toHumanAge()
    {   return this.age * 7;
    }

    @Override
    public String toString()
    {   return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
