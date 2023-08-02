package Model.Category;

import Model.Category.ProductCategory;

public class Vegetable extends ProductCategory
{
    private String nutritionalQuality;
    private String producer;

    public Vegetable()
    {
        super("vegetable");
    }

    public Vegetable(String nutritionalQuality, String producer)
    {
        super("Vegetable");
        this.nutritionalQuality = nutritionalQuality;
        this.producer = producer;
    }

    public String getNutritionalQuality()
    {
        return nutritionalQuality;
    }

    public void setNutritionalQuality(String nutritionalQuality)
    {
        this.nutritionalQuality = nutritionalQuality;
    }

    public String getProducer()
    {
        return producer;
    }

    public void setProducer(String producer)
    {
        this.producer = producer;
    }

    @Override
    public String toString()
    {
        return "Vegetable{" +
                "nutritionalQuality='" + nutritionalQuality + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
