package Model;

public class Dog
{
    private String breed;

    private String furType;

    public Dog(String breed, String furType)
    {
        this.breed = breed;
        this.furType = furType;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getFurType()
    {
        return furType;
    }

    public void setFurType(String furType)
    {
        this.furType = furType;
    }

    @Override
    public String toString()
    {
        return "I am a dog and my breed is" + this.breed + "\n";
    }
}
