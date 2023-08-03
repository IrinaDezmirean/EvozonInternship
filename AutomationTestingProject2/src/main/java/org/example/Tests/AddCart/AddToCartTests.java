package org.example.Tests.AddCart;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(JUnit4.class)
public class AddToCartTests
{
    private static WebDriver driver;

    @BeforeClass
    public static void loadDriver()
    {
        driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
    }

//    public void changeQuantity(WebDriver driver)
//    {
//        driver.findElement(By.id("qty")).clear();
//        driver.findElement(By.id("qty")).sendKeys("2", Keys.RETURN);
//
//        if(driver.findElement(By.id("qty")).getText().equals("2"))
//            System.out.println("Change quantity successful!");
//        else
//            System.out.println("Change quantity failed!");
//    }

    @Before
    public void loginWithValidCredentials()
    {
        driver.findElement(By.cssSelector(".skip-link.skip-account span.label")).click();
        driver.findElement(By.cssSelector("a[title=\"Log In\"]")).click();

        driver.findElement(By.id("email")).sendKeys("ana@maria.com");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");

        driver.findElement(By.id("send2")).click();
    }

    @Test
    public void addToCart()
    {

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-3.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div.col-main > ul > li:nth-child(1) > a > span")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.add-to-cart-wrapper > div > div > div.add-to-cart-buttons > button")).click();

        String txt = driver.findElement(By.cssSelector(".success-msg span")).getText();

        Assert.assertTrue(txt.contains("was added to your shopping cart."));

    }

//    public void proceedToCheckout(WebDriver driver)
//    {
//        driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.cart.display-single-price > div.cart-totals-wrapper > div > ul > li > button"));
//        if(driver.findElement(By.cssSelector("#opc-billing > div.step-title > h2")).getText().equals("Billing Information"))
//        {
//            System.out.println("Billing info section");
//        }
//        else
//        {
//            System.out.println("Proceed to checkout failed");
//        }
//
//    }

    @AfterClass
    public static void closeDriver()
    {
        driver.close();
    }
}
