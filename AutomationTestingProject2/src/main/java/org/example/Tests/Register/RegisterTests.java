package org.example.Tests.Register;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@RunWith(JUnit4.class)
public class RegisterTests
{
    private static WebDriver driverUser; ///mdofificare ca sa fac commit

    @BeforeClass
    public static void loadDriverUser()
    {
        driverUser = new ChromeDriver();
        driverUser.get("http://qa2magento.dev.evozon.com/");
    }

    @Test
    public void registerWithValidCredentials()
    {
        driverUser.findElement(By.cssSelector(".skip-link.skip-account span.label")).click();
        driverUser.findElement(By.cssSelector("a[title=\"Register\"]")).click();
        driverUser.findElement(By.id("firstname")).sendKeys("Irina");
        driverUser.findElement(By.id("lastname")).sendKeys("Dezmi");
        driverUser.findElement(By.id("email_address")).sendKeys("ii.dd@yahoo.com");
        driverUser.findElement(By.id("password")).sendKeys("12341234");
        driverUser.findElement(By.id("confirmation")).sendKeys("12341234");
        driverUser.findElement(By.cssSelector("label[for=\"is_subscribed\"]")).click();
        driverUser.findElement(By.cssSelector("button[title=\"Register\"]")).click();

        String helloText = driverUser.findElement(By.cssSelector(".hello")).getText();

        Assert.assertEquals(helloText,"Hello, Irina Dezmi!");
    }

    @AfterClass
    public static void closeDriver()
    {
        driverUser.close();
    }
}
