package Model.Product;

import Model.Category.Fruit;
import Model.Category.ProductCategory;

public class Apple extends Product
{
    public Apple(String nutritionalQuality)
    {
        super(new Fruit(nutritionalQuality), "kg", 6);
    }
}
