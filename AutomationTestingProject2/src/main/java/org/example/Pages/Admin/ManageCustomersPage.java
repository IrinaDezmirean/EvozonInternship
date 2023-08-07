package org.example.Pages.Admin;

import org.example.Pages.User.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ManageCustomersPage extends BasePage
{
    @FindBy(css = "#customerGrid_table tbody tr")
    private List<WebElement> customersTableRows;

    public ManageCustomersPage(WebDriver driver)
    {
        super(driver);
    }

    public List<WebElement> getAllCustomers()
    {
        return customersTableRows;
    }
}
