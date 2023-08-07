package org.example.Suites;

import org.example.Tests.User.AddToWishlistsTests;
import org.example.Tests.User.DeleteFromWishlistTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddToWishlistsTests.class,
        DeleteFromWishlistTests.class
})
public class WishlistSuite
{
}
