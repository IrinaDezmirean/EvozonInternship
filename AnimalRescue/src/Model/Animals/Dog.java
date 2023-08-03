package Model.Animals;

import Model.Food.AnimalFood;
import Model.Food.DogFood;

public abstract class Dog extends Animal
{
    private String breed;

    private String furType;

    private String furColor;

    public Dog(){}

    public Dog(String breed, String furType, String furColor)
    {
        this.breed = breed;
        this.furType = furType;
        this.furColor = furColor;
    }

    public Dog(String name, int age, int healthLevel, int hungerLevel, int moodLevel, AnimalFood preferredFood, String preferredActivity, String breed, String furType, String furColor)
    {
        super(name, age, healthLevel, hungerLevel, moodLevel, preferredFood, preferredActivity);
        this.breed = breed;
        this.furType = furType;
        this.furColor = furColor;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getFurType()
    {
        return furType;
    }

    public void setFurType(String furType)
    {
        this.furType = furType;
    }

    public String getFurColor()
    {
        return furColor;
    }

    public void setFurColor(String furColor)
    {
        this.furColor = furColor;
    }

    public void speak()
    {
        System.out.println("Wof, wof");
    }

    public abstract String sleep();

    public String eat(DogFood df)
    {
        return "I eat " + df.getName();
    }

    public void fetch()
    {
        System.out.println("Getting the stick back");
    }

    @Override
    public String toString()
    {
        String mood = "very unhappy";
        String health = "weak";
        String appetite = "no appetite";
        if(this.getMoodLevel() > 4 && this.getMoodLevel() < 7)
            mood = "happier";
        else if(this.getMoodLevel() >= 7)
            mood = "very happy";
        if(this.getHealthLevel() > 4 && this.getHealthLevel() < 7)
            health = "better";
        else if(this.getHealthLevel() >= 7)
            health = "healthy";
        if(this.getHungerLevel() > 4 && this.getHungerLevel() < 7)
            appetite = "more appetite";
        else if(this.getHealthLevel() >= 7)
            appetite = "with appetite";

        return "Dog was " + mood + ", " + health + " and with " + appetite;
    }
}
