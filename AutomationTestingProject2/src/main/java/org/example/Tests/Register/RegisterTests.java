package org.example.Tests.Register;

import org.example.Tests.BaseTest;
import org.example.Utils.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



@RunWith(JUnit4.class)
public class RegisterTests extends BaseTest
{
    @Test
    public void registerWithValidCredentials()
    {
        homepage.clickAccountLink();
        homepage.clickRegisterLink();

        registerPage.setFirstnameField(Constants.FIRST_NAME);
        registerPage.setLastnameField(Constants.LAST_NAME);
        registerPage.setEmailAddressField(Constants.USER_EMAIL);
        registerPage.setPasswordField(Constants.USER_PASSWORD);
        registerPage.setPasswordConfirmationField(Constants.USER_PASSWORD);
        registerPage.checkSubscriptionCheckbox();
        registerPage.clickRegisterButton();

        String actual = accountPage.getWelcomeText();

        Assert.assertEquals("Hello, " + Constants.USER_NAME +"!",actual);
    }
}
