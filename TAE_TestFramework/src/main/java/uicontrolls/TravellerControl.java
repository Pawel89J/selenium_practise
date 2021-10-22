package uicontrolls;

import core.TAEDriver;
import baseControlls.BaseControl;
import entities.Travellers;
import org.openqa.selenium.By;
import pages.HotelsPage;

public class TravellerControl extends BaseControl {

    public TravellerControl(String name, TAEDriver driver, By locator) {
        super(name, driver, locator);
    }

    public TravellerControl(String name, TAEDriver driver, String xpath) {
        super(name, driver, xpath);
    }

    public void setTravellers(Travellers travellers) {
        HotelsPage hotelsPage = new HotelsPage(driver);
        hotelsPage.setTravellers(travellers);
    }
}
