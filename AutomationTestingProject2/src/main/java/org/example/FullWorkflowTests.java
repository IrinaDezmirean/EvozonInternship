package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullWorkflowTests
{
    private WebDriver driver;

    public void loadDriver()
    {
       driver = new ChromeDriver();
       driver.get("http://qa2magento.dev.evozon.com/");
    }



    public void run()
    {
        loadDriver();

        LoginTests loginTests = new LoginTests();
        loginTests.loginWithValidCredentials(driver);

        AddToCartTests addCart = new AddToCartTests();
        addCart.addToCart(driver);

        driver.close();
    }
}
