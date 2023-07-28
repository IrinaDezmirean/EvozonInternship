import Model.*;

import java.lang.foreign.PaddingLayout;
import java.util.Calendar;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Adopter adopter = new Adopter("Ana", 100);
        Animal dog = new Animal("Grivei",1,2,2,2,"Bobite","none");
        AnimalFood dogFood = new AnimalFood("dry food for dogs",12.44,500,new Date(2023, Calendar.SEPTEMBER,27),10);
        LeisureActivity leisureActivity = new LeisureActivity("walking");
        VetMed vetMed = new VetMed("Gigel","pets");
        Play play = new Play(adopter,dog,vetMed);

    }
}