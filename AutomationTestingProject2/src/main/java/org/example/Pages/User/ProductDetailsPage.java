package org.example.Pages.User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage
{
    @FindBy(css = ".add-to-links .link-wishlist")
    private WebElement addToWishlistLink;

    @FindBy(css = ".product-name .h1")
    private WebElement productNameText;


    public ProductDetailsPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickAddToWishlistLink()
    {
        addToWishlistLink.click();
    }

    public String getProductNameText()
    {
        return productNameText.getText();
    }

}
