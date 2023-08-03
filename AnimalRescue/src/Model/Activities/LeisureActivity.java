package Model.Activities;

public class LeisureActivity
{
    private String name;

    public LeisureActivity(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name + " (leisure activity)";
    }
}
