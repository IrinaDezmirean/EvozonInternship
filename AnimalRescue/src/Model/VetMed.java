package Model;

public class VetMed
{
    private String name;

    private String specialization;

    public VetMed(String name, String specialization)
    {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    @Override
    public String toString()
    {
        return "I am a vet med and my name is " + this.name + "\n";
    }
}
