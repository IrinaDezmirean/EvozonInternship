package Repo;

import Model.Category.Fruit;
import Model.Category.Other;
import Model.Category.ProductCategory;
import Model.Category.Vegetable;
import Model.Package;
import Model.Product.Product;

import javax.swing.plaf.basic.BasicBorders;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Warehouse
{
    private String fileName;

    private List<Package> storagePackages;

    private List<String> fruits;

    private List<String> vegetables;

    private List<String> others;

    private List<String> products;

    public Warehouse(String fileName)
    {
        this.fileName = fileName;
        this.fruits = new ArrayList<>();
        this.vegetables = new ArrayList<>();
        this.others = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    private List<String> readFile(String filename)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null)
            {
                this.products.add(line);
                line = br.readLine();
            }
            br.close();
        }
        catch(Exception e)
        {

        }
        return products;
    }

    private void writeFile(String fileName)
    {

    }

    private ProductCategory getRandomCategory()
    {
        Random random = new Random();
        ProductCategory[] categories = {new Fruit(), new Vegetable(), new Other()};
        return categories[random.nextInt(categories.length)];
    }

    private String getRandomProductName(ProductCategory category)
    {
        Random random = new Random();
        if (category instanceof Fruit)
        {
            return fruits.get(random.nextInt(fruits.size()));
        }
        else if (category instanceof Vegetable)
        {
            return vegetables.get(random.nextInt(vegetables.size()));
        }
        else if (category instanceof Other)
        {
           return others.get(random.nextInt(others.size()));
        }
        return null;
    }

    private String getRandomMsUnit()
    {
        String[] msUnits = {"kg", "bag", "box", "pack"};
        Random random = new Random();
        String msUnit = msUnits[random.nextInt(msUnits.length)];
        if(msUnit.equals("bag"))
        {
            msUnit += "(" + random.nextInt(1,26)+ "kg)";
        }
        return msUnit;
    }

    private float getRandomPrice()
    {
        Random random = new Random();
        return random.nextFloat(100);
    }

    public LocalDate getRandomExpDate()
    {
        LocalDate currentDate = LocalDate.now();
        Random random = new Random();
        int randDays = random.nextInt(6*30); // maximum 6 months (each with 30 days)
        LocalDate expDate = currentDate.plus(randDays, ChronoUnit.DAYS);
        return expDate;
    }

    public Package getRandomPackage(Product prod)
    {
        Random random = new Random();
        int msUnit;
        if(prod.getMsUnit().equals("kg"))
        {
            msUnit = random.nextInt(50,251);
        }
        else if(prod.getMsUnit().equals("box"))
        {
            msUnit = random.nextInt(30,61);
        }
        else if(prod.getMsUnit().equals("pack"))
        {
            msUnit = random.nextInt(100,501);
        }
        else
        {
            msUnit = random.nextInt(15,26);
        }
        return new Package(prod,msUnit,getRandomExpDate());
    }



    public void generatePackages()
    {
        this.fruits = readFile("Fruits.txt");
        this.vegetables = readFile("Vegetables.txt");
        this.others = readFile("Others.txt");


        for(int i = 0; i < 200; i++)
        {
            ProductCategory category = getRandomCategory();
            String name = getRandomProductName(category);
            String msUnit = getRandomMsUnit();
            Float price = getRandomPrice();

            Product product = new Product(category,name,msUnit,price);

            Package pack = getRandomPackage(product);


        }
    }
}
