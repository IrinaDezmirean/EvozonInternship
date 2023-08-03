package Model;

import Model.Animals.Animal;
import Model.Animals.Dog;
import Model.Animals.Labrador;
import Model.Food.DogFood;
import Model.People.Adopter;
import Model.People.VetMed;

public class Play
{
    private Adopter adopter;
    private Labrador dog;
    private VetMed veterinarian;

    public Play(Adopter adopter, Labrador dog, VetMed veterinarian)
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

    public void setDog(Labrador dog)
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

    public void goToShelter()
    {
        System.out.println("One day," + adopter.toString() + " " + adopter.goToShelter() + " with her dad to " + adopter.adopt() + ".");
    }

    public void fallInLove()
    {
        System.out.print(this.adopter.fallInLove() + "a " + this.dog.getBreed() + ".");
    }

    public void animalCondition()
    {
        System.out.print(this.dog+".");
    }

    public void nameAnimal()
    {
        System.out.println(this.adopter.getName() + " adopted the " + this.dog.getBreed() + " and "+ this.adopter.namedAnimal() + this.dog.getName()+".");
    }

    public void feedAnimal()
    {
        DogFood df = new DogFood("normal","beef","puppies");
        this.dog.setPreferredFood(df);
        System.out.print(this.adopter.getName() + " fed " + this.dog.getName() +" " + this.dog.getPreferredFood());

        String pov = "The dog ";
        for(int i = 0 ; i < 5; i++)
        {
            pov += this.dog.eat(df) + " and ";
        }
        pov += "after a while the ";
        System.out.print(pov);
    }
    public void goToVet()
    {
        System.out.println();
        System.out.print(this.adopter.goToVet(this.dog) + " and the " + this.veterinarian.vaccineAndDeworm(this.dog) + ". ");
        System.out.println(this.veterinarian.getNurse().comfort(this.dog)+".");
    }

    public void gainWeight()
    {
        DogFood df = new DogFood("wet", "beef", "adults");
        this.dog.setPreferredFood(df);
        this.dog.eat(df);
        this.dog.eat(df);
        System.out.print(this.adopter.getName() + " continued to feed " + this.dog.getName() +" " + this.dog.getPreferredFood() + "and he gained weight.");
    }

    public void putOnDiet()
    {
        DogFood df = new DogFood("wet", "beef", "adult");
        df.setType("diet");
        this.dog.setPreferredFood(df);
        this.dog.eat(df);
        this.dog.eat(df);
        System.out.println(this.adopter.putOnDiet(this.dog)+".");
    }

    public void dailyRoutine()
    {
        System.out.print(this.adopter.getName() + " made a daily routine for the dog: ");
        System.out.print("after waking up "+ this.adopter.feed(this.dog) + " with " + dog.getPreferredFood());
        System.out.print(this.adopter.walkAnimal(this.dog));
        System.out.print("Returning back, "  + this.adopter.doHomework() + " and " + this.dog.sleep()+ ". ");
        this.dog.setPreferredActivity("played with the ball in the garden");
        System.out.println(this.adopter.getName() + " and the dog " +  this.dog.getPreferredActivity());
        System.out.print("In the evening, "  + this.adopter.walkAnimal(this.dog));
        System.out.println(" After that, " + this.dog.getName() + " ate again and went to sleep");
    }

    public void theEnd()
    {
        System.out.println("With this routine, the dog kept its weight in control.");
    }


    @Override
    public String toString()
    {
        return "Play with: \n" + this.adopter.toString() + "\n" + this.dog.toString() + "\n" + this.veterinarian.toString();
    }
}