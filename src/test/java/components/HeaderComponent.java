package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class HeaderComponent extends BasePage {
    private final String SIGN_IN_MENU = "//div[@class='Ai-z']/a";

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public SignInComponent goSignInMenu() {
        waitUntilElementToBeClickable(SIGN_IN_MENU).click();
        return new SignInComponent(driver);
    }

}