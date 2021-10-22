package forms;

import baseElements.BaseAbstractForm;
import core.TAEDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BannerForm extends BaseAbstractForm {
    @FindBy(id = "slideSkip")
    public WebElement skipBanner;

    public BannerForm(TAEDriver driver) {
        super(driver);
        PageFactory.initElements(driver.getDriver(), this);
        getLogger().info("Banner is initialized");
    }
}
