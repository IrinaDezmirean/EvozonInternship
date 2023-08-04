package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
    @FindBy(css = ".hello strong")
    private WebElement welcomeTextParagraph;

    public MyAccountPage(WebDriver driver)
    {
        super(driver);
    }

    public String getWelcomeText()
    {
        return welcomeTextParagraph.getText();
    }

}
