package org.example.Tests.User;


import org.example.Utils.Constants;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;


@RunWith(JUnit4.class)
public class AddToWishlistsTests extends BaseTest
{
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
    public void addToWishlist()
    {
        List<WebElement> products = productsPage.getProducts();
        Random random = new Random();

        WebElement randomProduct = products.get(random.nextInt(products.size()));

        randomProduct.click();

        String name = productDetailsPage.getProductNameText().toLowerCase();

        productDetailsPage.clickAddToWishlistLink();

        String msg = wishlistPage.getWishlistSuccessMsg().toLowerCase();

        Assert.assertTrue(msg.contains(name + " has been added to your wishlist"));

    }

}
