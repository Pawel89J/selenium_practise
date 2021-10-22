package gloTests;

import baseTest.BaseAbstractChromeTest;
import entities.User;
import forms.BannerForm;
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

        private BannerForm banner;

        public static String FULLNAME = "Pawel Jakubus";
        public static String POSITION = "Trainee Test Engineer,Quality Assurance";
        public static String FOLLOWERS = "6";
        public static String FOLLOW = "7";
        public static String TEAMMATES = "204";
        public static String COMMUNITIES = "24";

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
            banner = new BannerForm(getDriver());
            banner.skipBanner.click();
        }

        @Test
        public void testUserFullName() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserFullName(),FULLNAME);
        }

        @Test
        public void testUserPosition() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserPosition(),POSITION);
        }

        @Test
        public void testUserFollowers() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserFollowers(),FOLLOWERS);
        }

        @Test
        public void testUserFollow() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserFollow(),FOLLOW);
        }

        @Test
        public void testUserTeammates() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserTeammates(),TEAMMATES);
        }

        @Test
        public void testUserCommunities() {
            ProfileWidgetForm gloHome = new ProfileWidgetForm(getDriver());
            Assert.assertEquals(gloHome.getUserCommunities(),COMMUNITIES);
        }
}
