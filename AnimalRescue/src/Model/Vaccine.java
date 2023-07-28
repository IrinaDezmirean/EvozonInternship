package Model;

public class Vaccine
{
    private String producer;
    private String periodicityPerYear;

    private String type;


    public Vaccine(String producer, String periodicityPerYear, String type)
    {
        this.producer = producer;
        this.periodicityPerYear = periodicityPerYear;
        this.type = type;
    }

    public String getProducer()
    {
        return producer;
    }

    public void setProducer(String producer)
    {
        this.producer = producer;
    }

    public String getPeriodicityPerYear()
    {
        return periodicityPerYear;
    }

    public void setPeriodicityPerYear(String periodicityPerYear)
    {
        this.periodicityPerYear = periodicityPerYear;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "Vaccine produced by " + this.producer + " " + this.periodicityPerYear + " for" + this.type + "\n";
    }
}
