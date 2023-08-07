package org.example.Tests.Admin;

import org.example.Utils.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LoginAdminTest extends BaseTestAdmin
{

    @Test
    public void loginInAdmin()
    {
        loginPageAdmin.setUsernameField(Constants.USER_NAME_ADMIN);
        loginPageAdmin.setPasswordField(Constants.ADMIN_PASSWORD);
        loginPageAdmin.clickLoginButton();

        homePageAdmin.clickPopupCloseButton();

        String logoTxt = homePageAdmin.getLogoText();

        Assert.assertEquals("Magento Logo",logoTxt);
    }

}
