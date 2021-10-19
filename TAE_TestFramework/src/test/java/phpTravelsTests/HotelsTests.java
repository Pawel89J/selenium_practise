package phpTravelsTests;

import baseTest.BaseAbstractTest;
import entities.HotelSearch;
import entities.Travellers;
import org.testng.annotations.Test;
import pages.HomePage;
import taException.TAUnknownBrowserException;

public class HotelsTests extends BaseAbstractTest {

    public HotelsTests() throws TAUnknownBrowserException {
        super("chrome");
    }

    @Test
    public void testHotelsPage() {
        getDriver().navigateTo("https://www.phptravels.net/");

        String city = "Krakow";
        Travellers travellers = new Travellers();
        HotelSearch hotelSearch = new HotelSearch();

        new HomePage(getDriver()).switchToHotelsPage().fillPageAndSearch(hotelSearch);

        int a = 5+6;
    }
}
