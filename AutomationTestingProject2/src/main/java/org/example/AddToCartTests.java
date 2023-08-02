package org.example;

import org.openqa.selenium.By;
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


    public void addToCart(WebDriver driver)
    {

        navigateToProduct(driver);

        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.add-to-cart-wrapper > div > div > div.add-to-cart-buttons > button")).click();


    }

    public void run()
    {
        loadDriver();
        addToCart(driver);
        driver.close();
    }
}
