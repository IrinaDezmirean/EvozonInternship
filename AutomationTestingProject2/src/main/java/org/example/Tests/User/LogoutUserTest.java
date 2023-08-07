package org.example.Tests.User;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(JUnit4.class)
public class LogoutUserTest
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

        driver.findElement(By.id("email")).sendKeys("ii.dd@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("12341234");

        driver.findElement(By.id("send2")).click();
    }

    @Test
    public void logOut()
    {
        driver.findElement(By.cssSelector(".skip-link.skip-account span.label")).click();
        driver.findElement(By.cssSelector("a[title=\"Log Out\"]")).click();

        String txt = driver.findElement(By.cssSelector(".page-title h1")).getText();

        Assert.assertEquals(txt,"YOU ARE NOW LOGGED OUT");
    }

    @AfterClass
    public static void closeDriver()
    {
        driver.close();
    }
}
