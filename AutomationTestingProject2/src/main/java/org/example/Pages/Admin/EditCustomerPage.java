package org.example.Pages.Admin;

import org.example.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerPage extends BasePage
{
    @FindBy(css = "[title=\"Delete Customer\"]")
    private WebElement deleteCustomerButton;

    public EditCustomerPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickDeleteCustomerButton()
    {
        deleteCustomerButton.click();
    }
}
