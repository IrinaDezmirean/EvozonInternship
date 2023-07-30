package Model.Animals;

public class Husky extends Dog
{
    private int lowTemperatureTolerance;

    private String sheddingSeason;


    public Husky(int lowTemperatureTolerance, String sheddingSeason)
    {
        super("husky", "harsh", "multicolor");
        this.lowTemperatureTolerance = lowTemperatureTolerance;
        this.sheddingSeason = sheddingSeason;
    }

    public Husky(String breed, String furType, String furColor, int lowTemperatureTolerance, String sheddingSeason)
    {
        super(breed, furType, furColor);
        this.lowTemperatureTolerance = lowTemperatureTolerance;
        this.sheddingSeason = sheddingSeason;
    }


    public int getLowTemperatureTolerance()
    {
        return lowTemperatureTolerance;
    }

    public void setLowTemperatureTolerance(int lowTemperatureTolerance)
    {
        this.lowTemperatureTolerance = lowTemperatureTolerance;
    }

    public String getSheddingSeason()
    {
        return sheddingSeason;
    }

    public void setSheddingSeason(String sheddingSeason)
    {
        this.sheddingSeason = sheddingSeason;
    }

    public String sleep(){return "I sleep during the day";}

    public void shed()
    {
        System.out.println("As a husky I shed in the summer");
    }



}
