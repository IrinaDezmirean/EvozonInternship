package org.example.Tests.Admin;


import org.example.Utils.Constants;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class LogoutAdminTests extends BaseTestAdmin
{
    @Before
    public void logInAdmin()
    {
        loginPageAdmin.setUsernameField(Constants.USER_NAME_ADMIN);
        loginPageAdmin.setPasswordField(Constants.ADMIN_PASSWORD);
        loginPageAdmin.clickLoginButton();

        homePageAdmin.clickPopupCloseButton();
    }

    @Test
    public void logoutAdmin()
    {
        homePageAdmin.clickLogoutLink();
        Assert.assertEquals("Log in to Admin Panel", loginPageAdmin.getLoggedOutMessage());

    }
}
