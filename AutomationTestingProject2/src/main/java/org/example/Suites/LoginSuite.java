package org.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RegisterTests.class,
        LogoutUserTest.class,
        DeleteUserFromAdminTests.class
})
public class LoginSuite
{
}
