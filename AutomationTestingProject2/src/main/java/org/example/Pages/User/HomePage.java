package org.example.Pages;
import org.example.Utils.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
public class HomePage extends BasePage
{
    @FindBy(css = ".skip-account .label")
    private WebElement accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElement loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElement registerLink;

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
}
