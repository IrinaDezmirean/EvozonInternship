package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToWishlistsTests
{

    private WebDriver driver;

    public void loadDriver()
    {
        driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
    }

    public void navigateToProduct(WebDriver driver)
    {
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-3.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div.col-main > ul > li:nth-child(1) > a > span")).click();
    }

    public void addToWishlist(WebDriver driver)
    {
        navigateToProduct(driver);

        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > ul > li:nth-child(1) > a")).click();

        String txt = driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.account-login > div > h1")).getText();

        if(!txt.equals("LOGIN OR CREATE AN ACCOUNT"))
            System.out.println("Wishlist failed");
        else
        {
            LoginTests login = new LoginTests();
            login.loginWithValidCredentials(driver);

            String txt2 = driver.findElement(By.cssSelector("body > div > div > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.my-wishlist > div > h1")).getText();
            if(txt2.equals("MY WISHLIST"))
            {
                System.out.println("Add to wishlist successful!");
            }
            else
            {
                System.out.println("Wishlist failed");
            }
        }
    }

    public void run()
    {
        loadDriver();
        addToWishlist(driver);
        driver.close();
    }
}
