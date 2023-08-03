package Model.People;

import Model.Animals.Animal;
import Model.Animals.Dog;

public class Adopter extends Person
{

    private float availableMoneyAmount;
    private String whatAnimalLove;

    public Adopter(String name, String gender, String job, int age, float availableMoneyAmount, String height, String hairColor)
    {
        super(name, gender, job, age,height, hairColor);
        this.availableMoneyAmount = availableMoneyAmount;
    }

    public float getAvailableMoneyAmount()
    {
        return availableMoneyAmount;
    }

    public void setAvailableMoneyAmount(float availableMoneyAmount)
    {
        this.availableMoneyAmount = availableMoneyAmount;
    }

    public String getWhatAnimalLove()
    {
        return whatAnimalLove;
    }

    public void setWhatAnimalLove(String whatAnimalLove)
    {
        this.whatAnimalLove = whatAnimalLove;
    }

    public void speak()
    {
        System.out.println("I am " + this.getName() + ", an adopter");
    }

    public void work()
    {
        System.out.println("I work as a " + this.getJob());
    }

    public String adopt()
    {
        return "adopt an animal";
    }

    public String goToShelter()
    {
        return "went to shelter";
    }

    public String namedAnimal()
    {
        return this.getName() + " named it ";
    }

    public String goToVet(Dog dog)
    {
        return this.getName() + " went to the vet with " + dog.getName();
    }

    public String putOnDiet(Dog dog)
    {
        return this.getName() + " put " + dog.getName() + " on a low calorie diet";
    }

    public String feed(Dog dog)
    {
        return this.getName() + " fed " + dog.getName();
    }

    public String walkAnimal(Dog dog)
    {
        return this.getName() + " walked " + dog.getName() + " outside.";
    }

    public  String doHomework()
    {
        return this.getName() + " did homework";
    }



    @Override
    public String toString()
    {
        return " a " + this.getAge() + " years old "+ this.getHeight() + " " + this.whatAnimalLove + " "  + this.getGender() + " with " + this.getHairColor()+ " hair, named " + this.getName();
    }
}
