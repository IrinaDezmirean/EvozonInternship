package Model.People;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Person
{
    private String name;
    private String gender;
    private String job;
    private int age;
    private String height;

    private String hairColor;


    public Person(String name, String gender, String job, int age, String height, String hairColor)
    {
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.age = age;
        this.height = height;
        this.hairColor = hairColor;
    }


    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getJob()
    {
        return job;
    }

    public void setJob(String job)
    {
        this.job = job;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getHeight()
    {
        return height;
    }

    public void setHeight(String height)
    {
        this.height = height;
    }

    public String getHairColor()
    {
        return hairColor;
    }

    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }

    public abstract void speak();

    public abstract void work();

    public String fallInLove()
    {
        return this.name + " fell in love with ";
    }

}
