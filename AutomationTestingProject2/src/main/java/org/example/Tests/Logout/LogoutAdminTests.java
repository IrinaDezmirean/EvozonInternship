package org.example;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class LogoutAdminTests {
    private static WebDriver driverAdmin;

    @BeforeClass
    public static void loadDriver()
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
    public void logoutAdmin()
    {
        driverAdmin.findElement(By.cssSelector(".link-logout")).click();

        String txt  = driverAdmin.findElement(By.cssSelector(".login-form h2")).getText();

        Assert.assertEquals(txt,"Log in to Admin Panel");

    }

    @AfterClass
    public static void closeDriver()
    {
        driverAdmin.close();
    }

}
