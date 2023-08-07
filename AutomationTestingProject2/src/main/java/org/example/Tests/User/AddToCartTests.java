package org.example.Tests.User;

import org.example.Utils.Constants;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;


@RunWith(JUnit4.class)
public class AddToCartTests extends BaseTest
{

//    public void changeQuantity(WebDriver driver)
//    {
//        driver.findElement(By.id("qty")).clear();
//        driver.findElement(By.id("qty")).sendKeys("2", Keys.RETURN);
//
//        if(driver.findElement(By.id("qty")).getText().equals("2"))
//            System.out.println("Change quantity successful!");
//        else
//            System.out.println("Change quantity failed!");
//    }

    @Before
    public void navigateToProductsPage()
    {
        homepage.clickAccountLink();
        homepage.clickLoginLink();

        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();

        homepage.clickFirstMenuLink();
        homepage.clickFirstSubcategoryLink();
    }



    @Test
    public void addToCart()
    {

        List<WebElement> products = productsPage.getProducts();

        Random random = new Random();

        WebElement randomProduct = products.get(random.nextInt(products.size()));

        randomProduct.click();

        String name = productDetailsPage.getProductNameText().toLowerCase();

        List<WebElement> colors = productDetailsPage.getColorsLink();
        WebElement randColor = colors.get(random.nextInt(colors.size()));
        randColor.click();

        List<WebElement> sizes = productDetailsPage.getSizesLink();
        WebElement randSize = sizes.get(random.nextInt(sizes.size()));
        randSize.click();

        productDetailsPage.clickAddToCart();

        String msg = shoppingCartPage.getAddToCartMsg().toLowerCase();

        Assert.assertEquals(name + " was added to your shopping cart.", msg);

    }
}
