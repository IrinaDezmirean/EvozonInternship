package org.example.Tests.User;

import com.github.javafaker.Faker;
import org.example.Utils.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LoginUserTest extends BaseTest
{

    @Test
    public void loginWithValidCredentials()
    {
        homepage.clickAccountLink();
        homepage.clickLoginLink();

        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();

        Assert.assertEquals("Hello, "+Constants.USER_NAME+"!", accountPage.getWelcomeText());
    }


    @Test
    public void loginUnregisteredCredentials()
    {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        Faker faker = new Faker();

        loginPage.setEmailField(faker.internet().emailAddress());
        loginPage.setPasswordField(faker.internet().password());
        loginPage.clickLoginButton();

        String actual = loginPage.getErrorMessage();
        Assert.assertEquals("Invalid login or password.",actual);
    }

}
