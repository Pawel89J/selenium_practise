package tests;

import baseTest.BaseAbstractChromeTest;
import org.testng.Assert;
import taException.TAUnknownBrowserException;
import org.testng.annotations.Test;

public class Test1 extends BaseAbstractChromeTest {
    public Test1() throws TAUnknownBrowserException {
    }

    @Test
    public void test(){
        getDriver().getDriver().get("https://www.phptravels.net/");
        Assert.assertTrue(false);
    }
}
