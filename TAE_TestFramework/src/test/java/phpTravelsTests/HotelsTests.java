package phpTravelsTests;

import baseTest.BaseAbstractTest;
import entities.Travellers;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.HotelsPage;
import taException.TAUnknownBrowserException;
import uicontrolls.CustomSelect;

public class HotelsTests extends BaseAbstractTest {

    private HotelsPage hotelsPage;

    public HotelsTests() throws TAUnknownBrowserException {
        super("chrome");
    }

    @BeforeTest
    public void setUpTests() {
        getDriver().getDriver().get("https://www.phptravels.net/");
        String city = "Krakow";
        HomePage homePage = new HomePage(getDriver());
        homePage.switchToHotelsPage();
        CustomSelect customSelect = new CustomSelect("HotelCity",getDriver(),"(//*[@role='combobox'])[1]");
        customSelect.selectItem(city);
        hotelsPage = new HotelsPage(getDriver());
    }

    @Test
    public void shouldGetMessageNotMatchFound() {
        Travellers travellers = new Travellers(2,2,2);
        hotelsPage.clickDropBoxHotelSetting();
        hotelsPage.clearForm();
        hotelsPage.setTravellers(travellers);
        hotelsPage.submit();
        Assert.assertTrue(hotelsPage.noMatchFoundIsDisplayed(),"Message with no result is displayed");
    }

    @Test
    public void shouldFillTravellersSetValue() {
        Travellers travellers = new Travellers(3,3,3);
        hotelsPage.clickDropBoxHotelSetting();
        hotelsPage.clearForm();
        hotelsPage.setTravellers(travellers);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("3", getDriver().getElement(By.xpath("//input[@id='rooms']"))
                .getAttribute("value").trim());
        softAssert.assertEquals("3", getDriver().getElement(By.xpath("//input[@id='adults']"))
                .getAttribute("value").trim());
        softAssert.assertEquals("3", getDriver().getElement(By.xpath("//input[@id='childs']"))
                .getAttribute("value").trim());
        softAssert.assertAll();
    }
}
