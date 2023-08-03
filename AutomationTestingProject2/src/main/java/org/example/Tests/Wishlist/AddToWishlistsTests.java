package org.example;

import org.checkerframework.checker.units.qual.A;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


@RunWith(JUnit4.class)
public class AddToWishlistsTests
{

    private static  WebDriver driver;

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
    }

    @Test
    public void addToWishlist()
    {
        driver.findElement(By.cssSelector("a.level0.has-children")).click();
        driver.findElement(By.cssSelector(".catblocks li:nth-child(2) a")).click();

        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > ul > li:nth-child(1) > a")).click();

        String txt = driver.findElement(By.cssSelector(".page-title.title-buttons h1")).getText();

        Assert.assertEquals(txt,"MY WISHLIST");

    }

    @AfterClass
    public static void closeDriver()
    {
        driver.close();
    }
}
