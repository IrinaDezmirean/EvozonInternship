package Model.Food;

import java.util.Date;

public class DogFood extends AnimalFood
{

    private String type; // normal or dietetic
    private String meat;
    private String suitableFor;  // puppy or adult

    public DogFood(String type, String meat, String suitableFor)
    {
        this.type = type;
        this.meat = meat;
        this.suitableFor = suitableFor;
    }

    public DogFood(String name, double price, int quantity, Date expirationDate, int stock, String type, String meat, String suitableFor)
    {
        super(name, price, quantity, expirationDate, stock);
        this.type = type;
        this.meat = meat;
        this.suitableFor = suitableFor;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getMeat()
    {
        return meat;
    }

    public void setMeat(String meat)
    {
        this.meat = meat;
    }

    public String getSuitableFor()
    {
        return suitableFor;
    }

    public void setSuitableFor(String suitableFor)
    {
        this.suitableFor = suitableFor;
    }

    @Override
    public String toString()
    {
        return this.type  + " dog food with " + this.meat + " suitable for " + this.suitableFor + "\n";
    }
}
