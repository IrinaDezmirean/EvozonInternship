package org.example.Suites;

import org.example.Tests.Admin.DeleteUserFromAdminTests;
import org.example.Tests.User.LogoutUserTest;
import org.example.Tests.User.RegisterTests;
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
