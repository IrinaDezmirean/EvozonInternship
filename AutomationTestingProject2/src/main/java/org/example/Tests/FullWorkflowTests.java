package org.example.Tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(JUnit4.class)
public class FullWorkflowTests
{
    private static WebDriver driver;

    @BeforeClass
    public static void loadDriver()
    {
       driver = new ChromeDriver();
       driver.get("http://qa2magento.dev.evozon.com/");
    }



    public void run()
    {
//        loadDriver();
//
//        LoginAsUserTests loginTests = new LoginAsUserTests();
//        loginTests.loginWithValidCredentials();
//
//        AddToCartTests addCart = new AddToCartTests();
//        addCart.addToCart(driver);
//
//        driver.close();
    }
}
