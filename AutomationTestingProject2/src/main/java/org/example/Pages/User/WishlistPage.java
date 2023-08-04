package org.example.Pages.User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage
{
    @FindBy(css = ".success-msg span")
    private WebElement wishlistSuccessMsg;

    public WishlistPage(WebDriver driver)
    {
        super(driver);
    }

    public String getWishlistSuccessMsg()
    {
        return wishlistSuccessMsg.getText();
    }
}
