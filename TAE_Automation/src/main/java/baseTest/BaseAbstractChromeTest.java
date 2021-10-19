package baseTest;

import taException.TAUnknownBrowserException;

public class BaseAbstractChromeTest extends BaseAbstractTest{
    public BaseAbstractChromeTest() throws TAUnknownBrowserException {
        super("chrome");
    }
}
