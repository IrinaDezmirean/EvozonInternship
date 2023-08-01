package Model.Product;

import Model.Category.Fruit;
import Model.Category.ProductCategory;
import Model.Category.Vegetable;

public class Potato extends Product
{
    public Potato(String nutritionalQuality, String producer)
    {
        super(new Vegetable(nutritionalQuality,producer), "bag", 6);
    }
}
