package phpTravelsTests;

import baseTest.BaseAbstractChromeTest;
import org.openqa.selenium.By;
import taException.TAUnknownBrowserException;
import org.testng.annotations.Test;
import org.testng.Assert;
import uicontrolls.CustomSelect;

public class FirstTest extends BaseAbstractChromeTest {
    public FirstTest() throws TAUnknownBrowserException {
        super();
    }

    @Test
    public void citySearch() {
        getDriver().getDriver().get("https://www.phptravels.net/");
        changeLanguage();
        CustomSelect customSelect = new CustomSelect("HotelCity", getDriver(), "(//*[@role='combobox'])[1]");
        customSelect.selectItem("Krakow");
        Assert.assertTrue(customSelect.getSelectedItem().contains("Krakow"),"Verify selected item is Krakow");
    }

    private void changeLanguage() {
        getDriver().getElement(By.id("languages")).click();
        getDriver().getElement(By.xpath("//ul/li/a[text()=' English']")).click();
    }
}
