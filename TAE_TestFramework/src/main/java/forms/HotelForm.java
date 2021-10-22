package forms;

import baseElements.BaseAbstractForm;
import core.TAEDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelForm extends BaseAbstractForm {
    public HotelForm(TAEDriver driver) {
        super(driver);
        PageFactory.initElements(driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='rooms']")
    public WebElement rooms;
    @FindBy(xpath = "//*[@id='adults']")
    public WebElement adults;
    @FindBy(xpath = "//*[@id='childs']")
    public WebElement childs;
    @FindBy(xpath = "//*[@class='dropdown-menu dropdown-menu-wrap']/..")
    public WebElement boxDropdownHotels;
    @FindBy(xpath = "//*[@id='submit']")
    public WebElement searchHotelButton;
    @FindBy(xpath = "//*[@*='no results']")
    public WebElement noMatch;

}
