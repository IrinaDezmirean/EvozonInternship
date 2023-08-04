package org.example.Pages.User;
import org.example.Pages.User.BasePage;
import org.example.Utils.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomePage extends BasePage
{
    @FindBy(css = ".skip-account .label")
    private WebElement accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElement loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElement registerLink;

    @FindBy(css = ".level0.nav-1.first.parent .level0.has-children")
    private WebElement menuFirstLink;


    @FindBy(css = ".catblocks li:first-child a")
    private WebElement firstSubCategoryLink;

    public HomePage(WebDriver driver)
    {
        super(driver);
    }


    public void open()
    {
        driver.get(Constants.BASE_URL);
    }

    public void clickAccountLink()
    {
        accountLink.click();
    }

    public void clickLoginLink()
    {
        loginLink.click();
    }

    public void clickRegisterLink()
    {
        registerLink.click();
    }

    public void clickFirstMenuLink()
    {
        menuFirstLink.click();
    }

    public void clickFirstSubcategoryLink()
    {
        firstSubCategoryLink.click();
    }
}
