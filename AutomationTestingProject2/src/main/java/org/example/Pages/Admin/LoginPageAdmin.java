package org.example.Pages.Admin;

import org.example.Pages.User.BasePage;
import org.example.Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageAdmin extends BasePage
{
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "login")
    private WebElement passwordField;

    @FindBy(css = "input[title=\"Login\"]")
    private WebElement loginButton;

    @FindBy(css = ".login-form h2")
    private WebElement loggedOutParagraph;

    public LoginPageAdmin(WebDriver driver)
    {
        super(driver);
    }

    public void open()
    {
        driver.get(Constants.BASE_URL_ADMIN);
    }

    public void setUsernameField(String username)
    {
        usernameField.sendKeys(Constants.USER_NAME_ADMIN);
    }

    public void setPasswordField(String password)
    {
        passwordField.sendKeys(Constants.ADMIN_PASSWORD);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    public String getLoggedOutMessage()
    {
        return loggedOutParagraph.getText();
    }
}
