package org.example.Pages.User;
import org.example.Pages.User.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{

    @FindBy(id = "firstname")
    private WebElement firstnameField;

    @FindBy(id = "lastname")
    private WebElement lastnameField;

    @FindBy(id = "email_address")
    private WebElement emailAddressField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmation")
    private WebElement passwordConfirmationField;

    @FindBy(css = "label[for=\"is_subscribed\"]")
    private WebElement subscriptionCheckbox;

    @FindBy(css = "button[title=\"Register\"]")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver)
    {
        super(driver);
    }

    public void setFirstnameField(String firstname)
    {
        firstnameField.sendKeys(firstname);
    }

    public void setLastnameField(String lastname)
    {
        lastnameField.sendKeys(lastname);
    }

    public void setEmailAddressField(String email)
    {
        emailAddressField.sendKeys(email);
    }

    public void setPasswordField(String password)
    {
        passwordField.sendKeys(password);
    }

    public void setPasswordConfirmationField(String passwordConfirmation)
    {
        passwordConfirmationField.sendKeys(passwordConfirmation);
    }


    public void checkSubscriptionCheckbox()
    {
        subscriptionCheckbox.click();
    }

    public void clickRegisterButton()
    {
        registerButton.click();
    }

}
