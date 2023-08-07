package org.example.Tests.User;

import org.example.Pages.User.*;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class BaseTest
{
    protected WebDriver driver;
    protected HomePage homepage;
    protected LoginPage loginPage;
    protected MyAccountPage accountPage;

    protected RegisterPage registerPage;

    protected ProductsPage productsPage;

    protected ProductDetailsPage productDetailsPage;

    protected WishlistPage wishlistPage;

    protected ShoppingCartPage shoppingCartPage;

    @Before
    public void initDriver()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        accountPage = new MyAccountPage(driver);
        productsPage = new ProductsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        wishlistPage = new WishlistPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        homepage.open();
    }

    @After
    public void closeDriver()
    {
        driver.close();
    }
}
