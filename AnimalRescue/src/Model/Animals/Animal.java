package Model.Animals;

import Model.Food.AnimalFood;

public abstract class Animal
{
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;

    private int weight;
    private AnimalFood foodType;
    private String preferredActivity;


    public Animal(){}

    public Animal(String name, int age, int healthLevel, int hungerLevel,int moodLevel, AnimalFood preferredFood, String preferredActivity)
    {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
        this.foodType = preferredFood;
        this.preferredActivity = preferredActivity;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getHealthLevel()
    {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel)
    {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel()
    {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel)
    {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel()
    {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel)
    {
        this.moodLevel = moodLevel;
    }

    public AnimalFood getPreferredFood()
    {
        return foodType;
    }

    public void setPreferredFood(AnimalFood preferredFood)
    {
        this.foodType = preferredFood;
    }

    public String getPreferredActivity()
    {
        return preferredActivity;
    }

    public void setPreferredActivity(String preferredActivity)
    {
        this.preferredActivity = preferredActivity;
    }

    public void eat()
    {
        System.out.println("I eat animal food\n");
    }

    public abstract  void speak();

    public abstract String sleep();

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public void gainWeight()
    {
        this.weight += 2;
    }

    public void loseWight()
    {
        this.weight -= 2;
    }

    @Override
    public String toString()
    {
        return "I am an animal and my name is " + this.name + "\n";
    }
}
