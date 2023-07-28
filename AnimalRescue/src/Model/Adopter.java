package Model;

public class Adopter
{
    private String name;

    private float availableMoneyAmount;

    public Adopter(String name, float availableMoneyAmount)
    {
        this.name = name;
        this.availableMoneyAmount = availableMoneyAmount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public float getAvailableMoneyAmount()
    {
        return availableMoneyAmount;
    }

    public void setAvailableMoneyAmount(float availableMoneyAmount)
    {
        this.availableMoneyAmount = availableMoneyAmount;
    }

    @Override
    public String toString()
    {
        return "I am an adopter and my name is " + this.name + "\n";
    }
}
