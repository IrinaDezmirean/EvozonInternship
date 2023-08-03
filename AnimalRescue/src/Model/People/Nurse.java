package Model.People;

import Model.Animals.Dog;

public class Nurse extends Person
{
    private int kindnessLevel;

    public Nurse(String name, String gender, int age, String height, String hairColor,int kindnessLevel)
    {
        super(name, gender, "nurse", age, height, hairColor);
        this.kindnessLevel = kindnessLevel;
    }

    public int getKindnessLevel()
    {
        return kindnessLevel;
    }

    public void setKindnessLevel(int kindnessLevel)
    {
        this.kindnessLevel = kindnessLevel;
    }

    public void speak()
    {
        System.out.println("I am " + this.getName() +"\n");
    }

    public void work()
    {
        System.out.println("I work as a " + this.getJob() +"\n");
    }

    public String comfort(Dog dog)
    {
        String kindness = "unkind";
        if(kindnessLevel > 5 && kindnessLevel <= 7)
            kindness = "kind";
        else if(kindnessLevel > 7)
            kindness = "very kind";
        return "The " + this.getJob() + " was " + kindness +" with " + dog.getName();
    }

    @Override
    public String toString()
    {
        return "I am a nurse and my name is " + this.getName() + "\n";
    }
}
