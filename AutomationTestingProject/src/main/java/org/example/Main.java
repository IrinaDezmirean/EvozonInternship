package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver_win32/chromedriver.exe");
        RegisterTests registerTest = new RegisterTests();
        registerTest.run();

    }
}