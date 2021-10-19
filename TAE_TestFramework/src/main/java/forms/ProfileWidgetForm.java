package forms;

import baseElements.BaseAbstractForm;
import core.TAEDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileWidgetForm extends BaseAbstractForm {
    public ProfileWidgetForm(TAEDriver driver) {
        super(driver);
        PageFactory.initElements(driver.getDriver(), this);
    }

    public static String FULLNAME = "Pawel Jakubus";
    public static String POSITION = "Trainee Test Engineer,Quality Assurance";
    public static String FOLLOWERS = "6";
    public static String FOLLOW = "7";
    public static String TEAMMATES = "204";
    public static String COMMUNITIES = "24";

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/div[1]/div/div/div[2]/h2")
    public WebElement userFullName;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/div[1]/div/div/div[2]/p")
    public WebElement userPosition;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/div[1]/div/div/div[2]/div[1]/div[2]")
    public WebElement userFollowers;
    @FindBy(xpath = "//*[@id=\"follow_count\"]")
    public WebElement userFollow;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/div[1]/div/div/div[2]/div[3]/div[2]")
    public WebElement userTeammates;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/div[1]/div/div/div[2]/div[4]/div[2]")
    public WebElement userCommunities;

    public String getUserFullName() {
        return userFullName.getText();
    }

    public String getUserPosition() {
        return userPosition.getText();
    }

    public String getUserFollowers() {
        return userFollowers.getText();
    }

    public String getUserFollow() {
        return userFollow.getText();
    }

    public String getUserTeammates() {
        return userTeammates.getText();
    }

    public String getUserCommunities() {
        return userCommunities.getText();
    }
}
