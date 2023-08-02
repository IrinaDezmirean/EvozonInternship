package Model.Category;

import Model.Category.ProductCategory;

public class Fruit extends ProductCategory
{
    private String nutritionalQuality;

    public Fruit()
    {
        super("fruit");
    }

    public Fruit(String nutritionalQuality)
    {
        super("Fruit");
        this.nutritionalQuality = nutritionalQuality;
    }

    public String getNutritionalQuality()
    {
        return nutritionalQuality;
    }

    public void setNutritionalQuality(String nutritionalQuality)
    {
        this.nutritionalQuality = nutritionalQuality;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nutritionalQuality='" + nutritionalQuality + '\'' +
                '}';
    }
}
