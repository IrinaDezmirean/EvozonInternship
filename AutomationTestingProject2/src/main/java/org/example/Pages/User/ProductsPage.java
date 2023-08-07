package org.example.Pages.User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage
{

    @FindBy(css = ".products-grid.products-grid--max-4-col.first.last.odd .item.last")
    private List<WebElement> products;

    public ProductsPage(WebDriver driver)
    {
        super(driver);
    }

    public List<WebElement> getProducts()
    {
        return products;
    }
}
