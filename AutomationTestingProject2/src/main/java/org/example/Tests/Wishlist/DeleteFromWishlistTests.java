package org.example;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class DeleteFromWishlistTests
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
    }

    @Test
    public void deleteFromWishList()
    {
        driver.findElement(By.cssSelector(".skip-link.skip-account span.label")).click();

        String cnt = driver.findElement(By.cssSelector("a[title*=\"My Wishlist\"]")).getText();
        String[] arr = cnt.split(" ");
        cnt = arr[2];
        int counterBefore = Integer.parseInt(cnt.substring(1));

        driver.findElement(By.cssSelector("a[title*=\"My Wishlist\"]")).click();
        driver.findElement(By.cssSelector(".first.odd .btn-remove.btn-remove2")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.cssSelector(".skip-link.skip-account span.label")).click();

        String after = driver.findElement(By.cssSelector("a[title*=\"My Wishlist\"]")).getText();

        Assert.assertEquals(counterBefore,1);
        Assert.assertEquals(after,"My Wishlist");


    }

    @AfterClass
    public static void closeDriver()
    {
        driver.close();
    }
}
