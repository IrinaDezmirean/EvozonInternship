package org.example.Suites;

import org.example.Tests.DeleteCustomer.DeleteUserFromAdminTests;
import org.example.Tests.Logout.LogoutUserTest;
import org.example.Tests.Register.RegisterTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RegisterTests.class,
        LogoutUserTest.class,
        LoginSuite.class,
        DeleteUserFromAdminTests.class
})
public class LoginSuite
{
}
