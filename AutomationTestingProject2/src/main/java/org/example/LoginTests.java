package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests
{


    private WebDriver driver;

    public void loadDriver()
    {
        driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
    }

    public void loginWithValidCredentials(WebDriver driver)
    {
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();

        driver.findElement(By.id("email")).sendKeys("ana@maria.com");
        driver.findElement(By.id("pass")).sendKeys("anaaremere");

        driver.findElement(By.id("send2")).click();

        String helloText = driver.findElement(By.cssSelector("body > div > div > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello")).getText();

        if(helloText.equals("Hello, ana maria!"))
            System.out.println("Valid login successful!");
        else
            System.err.println("Login failed!");
    }


    public void run()
    {
        loadDriver();
        loginWithValidCredentials(driver);
        driver.close();
    }
}
