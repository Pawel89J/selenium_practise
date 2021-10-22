package pages;

import baseElements.BaseAbstractPage;
import core.TAEDriver;
import entities.HotelSearch;
import entities.Travellers;
import forms.HotelForm;
import org.openqa.selenium.support.PageFactory;
import uicontrolls.CustomSelect;
import uicontrolls.TravellerControl;

public class HotelsPage extends BaseAbstractPage {
    public static String TITLE = "Search Hotels - PHPTRAVELS";
    CustomSelect cityDropdown;
    TravellerControl travellerControl;
    HotelForm hotelForm;

    public HotelsPage(TAEDriver driver) {
        super(driver, TITLE);
        PageFactory.initElements(driver.getDriver(), this);
        cityDropdown = new CustomSelect("HotelCity", driver,"//span[@role='combobox']");
        travellerControl = new TravellerControl("HotelCity",driver,"//*[@class = 'dropdown dropdown-contain']");
        hotelForm = new HotelForm(driver);
    }

    public HotelsPage selectCity(String cityName) {
        cityDropdown.selectItem(cityName);
        return this;
    }

    public HotelsPage setTravellers(Travellers travellers) {
        hotelForm.rooms.sendKeys(String.valueOf(travellers.getRooms()));
        hotelForm.adults.sendKeys(String.valueOf(travellers.getAdults()));
        hotelForm.childs.sendKeys(String.valueOf(travellers.getChilds()));
        getLogger().info("Travellers filled into forms");
        return this;
    }

    public HotelsPage submit() {
        getLogger().info("Search button clicked");
        hotelForm.searchHotelButton.click();
        return this;
    }

    public HotelsPage fillPage(HotelSearch hotelSearch) {
        selectCity(hotelSearch.getCityName());
        setTravellers(hotelSearch.getTravellers());
        return this;
    }

    public HotelsPage fillPageAndSearch(HotelSearch hotelSearch) {
        fillPage(hotelSearch);
        submit();
        return this;
    }

    public HotelsPage clearForm() {
        hotelForm.rooms.clear();
        hotelForm.adults.clear();
        hotelForm.childs.clear();
        getLogger().info("Form cleared");
        return this;
    }

    public HotelsPage clickDropBoxHotelSetting() {
        hotelForm.boxDropdownHotels.click();
        getLogger().info("Dropdown clicked");
        return this;
    }

    public boolean noMatchFoundIsDisplayed() {
        getLogger().info("Message displayed");
        return hotelForm.noMatch.isDisplayed();
    }

    public TravellerControl getTravellerControl() {
        return travellerControl;
    }
}
