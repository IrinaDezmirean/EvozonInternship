package org.example.Tests.Login;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class LoginAsUserTests
{

    private static WebDriver driver;

    @BeforeClass
    public static void loadDriver()
    {
        driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
    }


    @Test
    public void loginWithValidCredentials()
    {
        driver.findElement(By.cssSelector(".skip-link.skip-account span.label")).click();
        driver.findElement(By.cssSelector("a[title=\"Log In\"]")).click();

        driver.findElement(By.id("email")).sendKeys("ii.dd@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("12341234");

        driver.findElement(By.id("send2")).click();

        String helloText = driver.findElement(By.cssSelector(".hello")).getText();

        if(helloText.equals("Hello, Irina Dezmi!"))
            System.out.println("Valid login successful!");
        else
            System.err.println("Login failed!");
    }

    @AfterClass
    public static void closeDriver()
    {
        driver.close();
    }
}
