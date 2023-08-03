package org.example;

public class Main
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        RegisterTests registerTest = new RegisterTests();
        LoginTests loginTest = new LoginTests();
        AddToWishlistsTests wishlistsTests = new AddToWishlistsTests();
        FullWorkflowTests fullTests = new FullWorkflowTests();

        //registerTest.run();
        //loginTest.run();
        //wishlistsTests.run();
        fullTests.run();

    }
}