package Model.Category;

public abstract class ProductCategory
{
    private String catName;


    public ProductCategory(){}

    public ProductCategory(String catName)
    {
        this.catName = catName;
    }

    public String getCatName()
    {
        return catName;
    }

    public void setCatName(String catName)
    {
        this.catName = catName;
    }

    @Override
    public String toString()
    {
        return "ProductCategory{" +
                "catName='" + catName + '\'' +
                '}';
    }
}
