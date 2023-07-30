import Model.*;
import Model.Activities.LeisureActivity;
import Model.Animals.Dog;
import Model.Animals.Husky;
import Model.Animals.Labrador;
import Model.People.Adopter;
import Model.Food.AnimalFood;
import Model.People.Nurse;
import Model.People.Person;
import Model.People.VetMed;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Adopter littleGirl = new Adopter("Ana", "girl", null, 7, 0,"little","red");
        littleGirl.setWhatAnimalLove("animal lover");

//        Husky husky = new Husky(-20,"summer");
//        husky.setName("Grivei");
//        husky.setPreferredFood("Meat balls");

        Dog labrador = new Labrador("Disabled children",10);
        labrador.setMoodLevel(1);
        labrador.setHealthLevel(1);
        labrador.setHungerLevel(1);
        labrador.setName("Goldie");

//        AnimalFood dogFood = new AnimalFood("dry food for dogs",12.44,500,new Date(2023, Calendar.SEPTEMBER,27),10);
//        LeisureActivity leisureActivity = new LeisureActivity("walking");
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


    }
}