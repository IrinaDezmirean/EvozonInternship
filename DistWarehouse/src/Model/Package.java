package Model;

import Model.Product.Product;

import java.time.LocalDate;
import java.util.Date;

public class Package
{
    private Product prodType;

    private int msUnit;

    private LocalDate expDate;

    public Package(){}

    public Package(Product prodType, int msUnit, LocalDate date)
    {
        this.prodType = prodType;
        this.msUnit = msUnit;
        this.expDate = date;
    }

    public Product getProdType()
    {
        return prodType;
    }

    public void setProdType(Product prodType)
    {
        this.prodType = prodType;
    }

    public int getMsUnit()
    {
        return msUnit;
    }

    public void setMsUnit(int msUnit)
    {
        this.msUnit = msUnit;
    }

    public LocalDate getExpDate()
    {
        return expDate;
    }

    public void setExpDate(LocalDate expDate)
    {
        this.expDate = expDate;
    }

    @Override
    public String toString()
    {
        return "Package{" +
                "prodType=" + prodType +
                ", msUnit='" + msUnit + '\'' +
                ", expDate=" + expDate +
                '}';
    }
}
