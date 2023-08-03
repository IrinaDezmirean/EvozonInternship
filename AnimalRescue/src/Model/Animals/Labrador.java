package Model.Animals;

import Model.Food.DogFood;

public class Labrador extends Dog
{
    private String disabilityType; //children, old people, epilepsy people

    private int smartnessLevel;

    public Labrador(String disabilityType, int smartnessLevel)
    {
        super("labrador","soft","golden");
        this.disabilityType = disabilityType;
        this.smartnessLevel = smartnessLevel;
    }

    public String getDisabilityType()
    {
        return disabilityType;
    }

    public void setDisabilityType(String disabilityType)
    {
        this.disabilityType = disabilityType;
    }

    public int getSmartnessLevel()
    {
        return smartnessLevel;
    }

    public void setSmartnessLevel(int smartnessLevel)
    {
        this.smartnessLevel = smartnessLevel;
    }

    @Override
    public String sleep(){return "The dog went to sleep";}

    public void help()
    {
        System.out.println("I help children with disabilities");
    }

    @Override
    public String eat(DogFood dogFood)
    {
        if(dogFood.getType().equals("normal"))
            this.gainWeight();
        this.setHealthLevel(this.getHealthLevel()+1);
        this.setHungerLevel(this.getHungerLevel()+1);
        this.setMoodLevel(this.getMoodLevel()+1);
        return "ate";
    }
}
