package gloTests;

import baseTest.BaseAbstractChromeTest;
import config.TAEConfig;
import entities.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import taException.TAUnknownBrowserException;

public class LoginTests extends BaseAbstractChromeTest {
    public LoginTests() throws TAUnknownBrowserException {
        super();
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        getDriver().getDriver().get("https://glo.globallogic.com/apps/glo/login");
        User user = new User("fakeUser","fakePassword");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.tryLogin(user);

        Assert.assertNotEquals(getDriver().getDriver().getTitle(), LoginPage.TITLE,
                String.format("Verify that login attempt was unsuccessful for user with username: '%s', password: '%s'",
                        user.getUserName(),user.getPassword()));
    }

    @Test
    public void testPageInfoText() {
        getDriver().getDriver().get("https://glo.globallogic.com/apps/glo/login");

        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertEquals(loginPage.getPageInfoText(), LoginPage.INFO_TEXT,
                "Verify page info text corresponds to expected one");
    }

    @Test
    public void test1() {
        getDriver().getDriver().get("https://glo.globallogic.com/");
        User user = TAEConfig.getSuccessfulUser();
    }
}
