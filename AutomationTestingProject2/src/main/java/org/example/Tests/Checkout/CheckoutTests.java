package org.example.Tests.Checkout;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class CheckoutTests
{
    private static WebDriver driver;


    @BeforeClass
    public static void loadDriver()
    {
        driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
    }

    @Before
    public void loginWithValidCredentials()
    {
        driver.findElement(By.cssSelector(".skip-link.skip-account span.label")).click();
        driver.findElement(By.cssSelector("a[title=\"Log In\"]")).click();

        driver.findElement(By.id("email")).sendKeys("ana@maria.com");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");

        driver.findElement(By.id("send2")).click();

//        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-3.parent > a")).click();
//        driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div.col-main > ul > li:nth-child(1) > a > span")).click();
//        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > a")).click();
//        driver.findElement(By.cssSelector("#product_addtocart_form > div.add-to-cart-wrapper > div > div > div.add-to-cart-buttons > button")).click();
    }

    @Test
    public void proceedToCheckoutShipToDifferentAddress()
    {
        //TO DO: recheck this some steps are wrong
        driver.findElement(By.cssSelector(".header-minicart a[data-target-element]")).click();
        driver.findElement(By.cssSelector("a.button[title=\"Checkout\"]")).click();
        driver.findElement(By.cssSelector("label[for=\"billing:use_for_shipping_no\"]")).click();
        driver.findElement(By.cssSelector("#billing-buttons-container [title=\"Continue\"]")).click();
        driver.findElement(By.cssSelector("[for=\"shipping:same_as_billing\"]")).click();
        driver.findElement(By.cssSelector("#billing-buttons-container [title=\"Continue\"]")).click();
        driver.findElement(By.cssSelector("#billing-buttons-container [title=\"Continue\"]")).click();
        driver.findElement(By.cssSelector("#billing-buttons-container [title=\"Continue\"]")).click();
        driver.findElement(By.cssSelector("button[title=\"Place Order\"]")).click();

        String txt = driver.findElement(By.cssSelector(".page-title h1")).getText();

        Assert.assertEquals(txt,"our order has been received.");
    }

    @AfterClass
    public static void closeDriver()
    {
        driver.close();
    }
}
