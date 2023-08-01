package Model;

import Model.Product.Product;

public class Package
{
    private Product prodType;

    private String msUnit;

    private float priceUnit;

    public Package(){}

    public Package(Product prodType, String msUnit, float priceUnit)
    {
        this.prodType = prodType;
        this.msUnit = msUnit;
        this.priceUnit = priceUnit;
    }

    public Product getProdType()
    {
        return prodType;
    }

    public void setProdType(Product prodType)
    {
        this.prodType = prodType;
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

    @Override
    public String toString()
    {
        return "Package{" +
                "prodType=" + prodType +
                ", msUnit='" + msUnit + '\'' +
                ", priceUnit=" + priceUnit +
                '}';
    }
}
