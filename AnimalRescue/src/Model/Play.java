package Model;

public class Play
{
    private Adopter adopter;
    private Animal dog;
    private VetMed veterinarian;

    public Play(Adopter adopter, Animal dog, VetMed veterinarian)
    {
        this.adopter = adopter;
        this.dog = dog;
        this.veterinarian = veterinarian;
    }

    public Adopter getAdopter()
    {
        return adopter;
    }

    public void setAdopter(Adopter adopter)
    {
        this.adopter = adopter;
    }

    public Animal getDog()
    {
        return dog;
    }

    public void setDog(Animal dog)
    {
        this.dog = dog;
    }

    public VetMed getVeterinarian()
    {
        return veterinarian;
    }

    public void setVeterinarian(VetMed veterinarian)
    {
        this.veterinarian = veterinarian;
    }

    @Override
    public String toString()
    {
        return "Play with: \n" + this.adopter.toString() + "\n" + this.dog.toString() + "\n" + this.veterinarian.toString();
    }
}
