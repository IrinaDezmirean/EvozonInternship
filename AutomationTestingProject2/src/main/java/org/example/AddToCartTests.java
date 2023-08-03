package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTests
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

    public void changeQuantity(WebDriver driver)
    {
        driver.findElement(By.id("qty")).clear();
        driver.findElement(By.id("qty")).sendKeys("2", Keys.RETURN);

        if(driver.findElement(By.id("qty")).getText().equals("2"))
            System.out.println("Change quantity successful!");
        else
            System.out.println("Change quantity failed!");
    }


    public void addToCart(WebDriver driver)
    {

        navigateToProduct(driver);

        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > a")).click();

        changeQuantity(driver);

        driver.findElement(By.cssSelector("#product_addtocart_form > div.add-to-cart-wrapper > div > div > div.add-to-cart-buttons > button")).click();
    }

    public void proceedToCheckout(WebDriver driver)
    {
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.cart.display-single-price > div.cart-totals-wrapper > div > ul > li > button"));
        if(driver.findElement(By.cssSelector("#opc-billing > div.step-title > h2")).getText().equals("Billing Information"))
        {
            System.out.println("Billing info section");
        }
        else
        {
            System.out.println("Proceed to checkout failed");
        }

    }

    public void run()
    {
        loadDriver();
        addToCart(driver);
        proceedToCheckout(driver);
        driver.close();
    }
}
