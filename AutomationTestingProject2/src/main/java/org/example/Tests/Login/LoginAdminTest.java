package org.example.Tests.Login;


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
public class LoginAdminTest
{
    private static WebDriver driverAdmin;

    @BeforeClass
    public static void loadDriverAdmin()
    {
        driverAdmin = new ChromeDriver();
        driverAdmin.get("http://qa2magento.dev.evozon.com/admin");
    }

    @Test
    public void loginInAdmin()
    {
        driverAdmin.findElement(By.id("username")).sendKeys("testuser");
        driverAdmin.findElement(By.id("login")).sendKeys("password123");
        driverAdmin.findElement(By.cssSelector("input[title=\"Login\"]")).click();

        String txt = driverAdmin.findElement(By.cssSelector(".logo")).getText();

        Assert.assertEquals(txt,"Magento Logo");
    }


    @AfterClass
    public static void closeDriver()
    {
        driverAdmin.close();
    }
}
