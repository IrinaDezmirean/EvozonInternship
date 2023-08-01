package Model.Product;

import Model.Category.ProductCategory;

public class Product
{
    private ProductCategory prodCat;
    private String msUnit;

    private float priceUnit;

    public Product(ProductCategory prodCat, String msUnit, float priceUnit)
    {
        this.prodCat = prodCat;
        this.msUnit = msUnit;
        this.priceUnit = priceUnit;
    }

    protected String getMsUnit()
    {
        return msUnit;
    }

    protected void setMsUnit(String msUnit)
    {
        this.msUnit = msUnit;
    }

    protected float getPriceUnit()
    {
        return priceUnit;
    }

    protected void setPriceUnit(float priceUnit)
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

    @Override
    public String toString()
    {
        return "Product{" +
                "prodCat=" + prodCat +
                ", msUnit='" + msUnit + '\'' +
                ", priceUnit=" + priceUnit +
                '}';
    }
}
