package Model;

import java.util.Date;

public class AnimalFood
{
    private String name;

    private double price;

    private int quantity;

    private Date expirationDate;

    private int stock;

    public AnimalFood(String name, double price, int quantity, Date expirationDate, int stock)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.stock = stock;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public Date getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    @Override
    public String toString()
    {
        return this.name + " animal food\n";
    }
}
