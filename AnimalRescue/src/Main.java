import Model.*;
import Model.Animals.Dog;
import Model.Animals.Labrador;
import Model.People.Adopter;
import Model.People.Nurse;
import Model.People.VetMed;

public class Main
{
    public static void main(String[] args)
    {
        Adopter littleGirl = new Adopter("Ana", "girl", null, 7, 0,"little","red");
        littleGirl.setWhatAnimalLove("animal lover");

        Labrador labrador = new Labrador("Disabled children",10);
        labrador.setMoodLevel(1);
        labrador.setHealthLevel(1);
        labrador.setHungerLevel(1);
        labrador.setName("Goldie");

        Nurse nurse = new Nurse("Laura","female",43,null,null,10);
        VetMed vetMed = new VetMed("Dane","male",25,"domestic animals",null,null,nurse);

        Play play = new Play(littleGirl,labrador,vetMed);

        play.goToShelter();
        play.fallInLove();
        play.animalCondition();
        play.nameAnimal();
        play.feedAnimal();
        play.animalCondition();
        play.goToVet();
        play.gainWeight();
        play.putOnDiet();
        play.dailyRoutine();
        play.theEnd();
    }
}