package org.example;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
@RunWith(JUnit4.class)
public class DeleteUserFromAdminTests
{
    private static WebDriver driverAdmin;

    @BeforeClass
    public static void loadDriverAdmin()
    {
        driverAdmin = new ChromeDriver();
        driverAdmin.get("http://qa2magento.dev.evozon.com/admin");
    }

    @Before
    public void loginInAdmin()
    {
        driverAdmin.findElement(By.id("username")).sendKeys("testuser");
        driverAdmin.findElement(By.id("login")).sendKeys("password123");
        driverAdmin.findElement(By.cssSelector("input[title=\"Login\"]")).click();
    }


    @Test
    public void deleteUserAdmin()
    {
        driverAdmin.findElement(By.cssSelector("a[title=\"close\"]")).click();
        driverAdmin.findElement(By.cssSelector("#nav .parent.level0:nth-child(4)")).click();
        driverAdmin.findElement(By.cssSelector("#nav .parent.level0:nth-child(4) .level1:first-child")).click();

        List<WebElement> users = driverAdmin.findElements(By.cssSelector("#customerGrid_table tbody tr"));

        for(WebElement user: users)
        {

            String txt = user.getText();
            if(txt.contains("Irina Dezmi"))
            {
                user.click();
                break;
            }
            else
            {
                System.out.println("else");
            }
        }
        driverAdmin.findElement(By.cssSelector("[title=\"Delete Customer\"]")).click();
        driverAdmin.switchTo().alert().accept();
    }


    @AfterClass
    public static void closeDriver()
    {
        driverAdmin.close();
    }
}
