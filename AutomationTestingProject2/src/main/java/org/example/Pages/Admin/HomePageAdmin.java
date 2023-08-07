package org.example.Pages.Admin;

import org.example.Pages.User.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageAdmin extends BasePage
{
    @FindBy(css = ".logo")
    private WebElement logoImg;

    @FindBy(css = "a[title=\"close\"]")
    private WebElement popupCloseButton;

    @FindBy(css = ".parent.level0:nth-child(4)")
    private WebElement navbarCustomersDropdown;

    @FindBy(css = ".parent.level0:nth-child(4) .level1:first-child a")
    private WebElement manageCustomersLink;

    @FindBy(css = ".link-logout")
    private WebElement logoutLink;

    public HomePageAdmin(WebDriver driver)
    {
        super(driver);
    }

    public String getLogoText()
    {
        return logoImg.getAttribute("alt");
    }

    public void clickPopupCloseButton()
    {
        popupCloseButton.click();
    }

    public void clickCustomersDropdown()
    {
        navbarCustomersDropdown.click();
    }

    public void clickManageCustomersLink()
    {
        manageCustomersLink.click();
    }

    public void clickLogoutLink()
    {
        logoutLink.click();
    }

}
