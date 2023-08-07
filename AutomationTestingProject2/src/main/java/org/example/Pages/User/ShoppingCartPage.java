package org.example.Pages.User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage
{

    @FindBy(css = ".success-msg span")
    private WebElement addToCartMsg;

    public ShoppingCartPage(WebDriver  driver)
    {
        super(driver);
    }

    public String getAddToCartMsg()
    {
        return addToCartMsg.getText();
    }

}
