package Model.People;

import Model.Animals.Dog;

public class VetMed extends Person
{
    private String specialization;

    private Nurse nurse;

    public VetMed(String name, String gender, int age,String height, String hairColor, String specialization, Nurse nurse)
    {
        super(name, gender, "veterinarian", age,height,hairColor);
        this.specialization = specialization;
        this.nurse = nurse;
    }


    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    public Nurse getNurse()
    {
        return nurse;
    }

    public void setNurse(Nurse nurse)
    {
        this.nurse = nurse;
    }

    public void speak()
    {
        System.out.println("I am " + this.getName() +"\n");
    }

    public void work()
    {
        System.out.println("I work as a " + this.getJob() + ", specialization " + this.specialization);
    }

    public String vaccineAndDeworm(Dog dog)
    {
        return this.getJob() + " vaccinated and dewormed " + dog.getName();
    }

    @Override
    public String toString()
    {
        return "I am a vet med and my name is " + this.getName() + "\n";
    }
}
