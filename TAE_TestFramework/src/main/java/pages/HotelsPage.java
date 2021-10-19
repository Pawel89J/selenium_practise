package pages;

import baseElements.BaseAbstractPage;
import core.TAEDriver;
import entities.HotelSearch;
import entities.Travellers;
import uicontrolls.CustomSelect;

public class HotelsPage extends BaseAbstractPage {
    public static String TITLE = "Search Hotels - PHPTRAVELS";
    CustomSelect cityDropdown;

    public HotelsPage(TAEDriver driver) {
        super(driver, TITLE);
        cityDropdown = new CustomSelect("HotelCity", driver,"//span[@role='combobox']");
    }

    public HotelsPage selectCity(String cityName) {
        cityDropdown.selectItem(cityName);
        return this;
    }

    public HotelsPage setTravellers(Travellers travellers) {
        //
        return this;
    }

    public HotelsPage submit() {
        //
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
}
