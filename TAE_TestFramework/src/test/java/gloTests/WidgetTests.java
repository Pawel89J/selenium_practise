package gloTests;

import baseTest.BaseAbstractChromeTest;
import entities.User;
import forms.Banner;
import forms.ProfileWidgetForm;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import taException.TAUnknownBrowserException;

    public class WidgetTests extends BaseAbstractChromeTest {
        public WidgetTests() throws TAUnknownBrowserException {
            super();
        }

        private Banner banner;

        @BeforeTest
        public void setUpTest() {
            getDriver().getDriver().get("https://glo.globallogic.com/apps/glo/login");
            User user = new User("pawel.jakubas","Haslo123");
            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.tryLogin(user);
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            skipBanner();
        }

        public void skipBanner() {
            banner = new Banner(getDriver());
            banner.skipBanner.click();
        }

        @Test
        public void testUserFullName() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserFullName(),ProfileWidgetForm.FULLNAME);
        }

        @Test
        public void testUserPosition() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserPosition(),ProfileWidgetForm.POSITION);
        }

        @Test
        public void testUserFollowers() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserFollowers(),ProfileWidgetForm.FOLLOWERS);
        }

        @Test
        public void testUserFollow() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserFollow(),ProfileWidgetForm.FOLLOW);
        }

        @Test
        public void testUserTeammates() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserTeammates(),ProfileWidgetForm.TEAMMATES);
        }

        @Test
        public void testUserCommunities() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserCommunities(),ProfileWidgetForm.COMMUNITIES);
        }
}
