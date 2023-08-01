package Model.Product;

import Model.Category.ProductCategory;

public class Product
{
    private ProductCategory prodCat;
    private String name;
    private String msUnit;

    private float priceUnit;

    public Product(ProductCategory prodCat, String name, String msUnit, float priceUnit)
    {
        this.prodCat = prodCat;
        this.name = name;
        this.msUnit = msUnit;
        this.priceUnit = priceUnit;
    }

    public String getMsUnit()
    {
        return msUnit;
    }

    public void setMsUnit(String msUnit)
    {
        this.msUnit = msUnit;
    }

    public float getPriceUnit()
    {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit)
    {
        this.priceUnit = priceUnit;
    }

    public ProductCategory getProdCat()
    {
        return prodCat;
    }

    public void setProdCat(ProductCategory prodCat)
    {
        this.prodCat = prodCat;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "prodCat=" + prodCat +
                ", name='" + name + '\'' +
                ", msUnit='" + msUnit + '\'' +
                ", priceUnit=" + priceUnit +
                '}';
    }
}
