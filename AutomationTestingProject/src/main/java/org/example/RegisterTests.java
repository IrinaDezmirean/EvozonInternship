package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.util.List;

public class RegisterTests
{

    public void registerWithValidCredentials()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa2magento.dev.evozon.com/");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Irina");
        driver.findElement(By.id("lastname")).sendKeys("Dezmi");
        driver.findElement(By.id("email_address")).sendKeys("ii.dd@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("12341234");
        driver.findElement(By.id("confirmation")).sendKeys("12341234");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();

        String helloText = driver.findElement(By.cssSelector("body > div > div > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello")).getText();
        String welcomeText = driver.findElement(By.cssSelector("body > div > div > div.header-language-background > div > p")).getText();

        if(helloText.equals("Hello, Irina Dezmi!") && welcomeText.equals("Welcome, Irina Dezmi!"))
            System.out.println("Valid registration successful!");
        else
            System.err.println("Registration failed!");
        driver.close();
    }

    public void deleteCustomerFormAdmin()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa2magento.dev.evozon.com/admin");

        loginInAdmin(driver);

        deleteUserAdmin(driver);

        driver.close();
    }

    public void loginInAdmin(WebDriver driver)
    {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("login")).sendKeys("password123");
        driver.findElement(By.cssSelector("#loginForm > div > div.form-buttons > input")).click();
    }

    public void navigateToCustomers(WebDriver driver)
    {
        driver.findElement(By.cssSelector("#message-popup-window > div.message-popup-head > a > span")).click();
        driver.findElement(By.cssSelector("#nav > li:nth-child(4) > a > span")).click();
        driver.findElement(By.cssSelector("#nav > li:nth-child(4) > ul > li:nth-child(1) > a > span")).click();
    }

    public void deleteUserAdmin(WebDriver driver)
    {
        navigateToCustomers(driver);

        List<WebElement> users = driver.findElements(By.cssSelector("#customerGrid_table > tbody > tr"));

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
        driver.findElement(By.cssSelector("[title=\"Delete Customer\"]")).click();
        driver.switchTo().alert().accept();
    }


    public void run()
    {
        registerWithValidCredentials();
        deleteCustomerFormAdmin();
    }
}
