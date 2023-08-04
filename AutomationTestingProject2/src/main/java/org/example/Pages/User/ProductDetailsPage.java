package org.example.Pages.User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailsPage extends BasePage
{
    @FindBy(css = ".add-to-links .link-wishlist")
    private WebElement addToWishlistLink;

    @FindBy(css = ".product-name .h1")
    private WebElement productNameText;

    @FindBy(css = ".add-to-cart-buttons .button.btn-cart")
    private WebElement addToCartButton;

    @FindBy(css = "#configurable_swatch_color li a")
    private List<WebElement> colorsLink;

    @FindBy(css = "#configurable_swatch_size li a")
    private List<WebElement> sizesLink;


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

    public void clickAddToCart()
    {
        addToCartButton.click();
    }

    public List<WebElement> getSizesLink()
    {
        return sizesLink;
    }

    public List<WebElement> getColorsLink()
    {
        return colorsLink;
    }

}
