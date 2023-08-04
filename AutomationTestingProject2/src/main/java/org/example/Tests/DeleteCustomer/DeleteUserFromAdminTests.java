package org.example.Tests.DeleteCustomer;

import org.example.Tests.BaseTestAdmin;
import org.example.Utils.Constants;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
@RunWith(JUnit4.class)
public class DeleteUserFromAdminTests extends BaseTestAdmin
{
    @Before
    public void navigateToManageCustomersPage()
    {
        loginPageAdmin.setUsernameField(Constants.USER_NAME_ADMIN);
        loginPageAdmin.setPasswordField(Constants.ADMIN_PASSWORD);
        loginPageAdmin.clickLoginButton();

        homePageAdmin.clickPopupCloseButton();

        homePageAdmin.clickCustomersDropdown();

        homePageAdmin.clickManageCustomersLink();
    }


    @Test
    public void deleteUserAdmin()
    {
        List<WebElement> users  = manageCustomersPage.getAllCustomers();
        WebElement wantedUser;

        for(WebElement user: users)
        {

            String txt = user.getText();
            if(txt.contains(Constants.USER_NAME))
            {
                wantedUser = user;
                user.click();

                editCustomerPage.clickDeleteCustomerButton();
                driver.switchTo().alert().accept();

                List<WebElement> usersUpdated = manageCustomersPage.getAllCustomers();
                Assert.assertFalse(usersUpdated.contains(wantedUser));
                break;
            }
            else
            {
                System.out.println("else");
            }
        }
    }
}
