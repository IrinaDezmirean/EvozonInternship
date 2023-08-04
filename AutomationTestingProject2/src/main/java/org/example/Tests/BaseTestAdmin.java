package org.example.Tests;

import org.example.Pages.Admin.EditCustomerPage;
import org.example.Pages.Admin.HomePageAdmin;
import org.example.Pages.Admin.LoginPageAdmin;
import org.example.Pages.Admin.ManageCustomersPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestAdmin
{
    protected WebDriver driver;

    protected LoginPageAdmin loginPageAdmin;

    protected HomePageAdmin homePageAdmin;

    protected ManageCustomersPage manageCustomersPage;

    protected EditCustomerPage editCustomerPage;

    @Before
    public void initDriver()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPageAdmin = new LoginPageAdmin(driver);
        homePageAdmin = new HomePageAdmin(driver);
        manageCustomersPage = new ManageCustomersPage(driver);
        editCustomerPage = new EditCustomerPage(driver);
        loginPageAdmin.open();
    }

    @After
    public void closeDriver()
    {
        driver.close();
    }
}
