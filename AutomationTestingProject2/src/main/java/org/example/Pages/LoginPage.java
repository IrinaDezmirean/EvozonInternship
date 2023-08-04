package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

    @FindBy(id ="email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "send2")
    private WebElement loginButton;

    @FindBy(css = ".error-msg span")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void setEmailField(String email)
    {
        emailField.sendKeys(email);
    }

    public void setPasswordField(String password)
    {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    public String getErrorMessage()
    {
        return errorMessage.getText();
    }
}
