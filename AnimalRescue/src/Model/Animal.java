package Model;

public class Animal
{
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String preferredFood;
    private String preferredActivity;


    public Animal(){}

    public Animal(String name, int age, int healthLevel, int hungerLevel,int moodLevel, String preferredFood, String preferredActivity)
    {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
        this.preferredFood = preferredFood;
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

    public String getPreferredFood()
    {
        return preferredFood;
    }

    public void setPreferredFood(String preferredFood)
    {
        this.preferredFood = preferredFood;
    }

    public String getPreferredActivity()
    {
        return preferredActivity;
    }

    public void setPreferredActivity(String preferredActivity)
    {
        this.preferredActivity = preferredActivity;
    }

    @Override
    public String toString()
    {
        return "I am an animal and my name is " + this.name + "\n";
    }
}
