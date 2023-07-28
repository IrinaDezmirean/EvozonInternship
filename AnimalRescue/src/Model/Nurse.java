package Model;

public class Nurse
{
    private String name;
    private int kindnessLevel;

    public Nurse(String name, int kindnessLevel)
    {
        this.name = name;
        this.kindnessLevel = kindnessLevel;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getKindnessLevel()
    {
        return kindnessLevel;
    }

    public void setKindnessLevel(int kindnessLevel)
    {
        this.kindnessLevel = kindnessLevel;
    }

    @Override
    public String toString()
    {
        return "I am a nurse and my name is " + this.name + "\n";
    }
}
