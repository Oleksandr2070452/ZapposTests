package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;

public class FooterComponent extends BasePage {
    public FooterComponent(WebDriver driver) {

        super(driver);
    }
    private static final String ABOUT_BTN = "//a[@href='/c/about']";
    public AboutUsPage scrollAndClickAboutBtn(){
        scrollToElement(waitUntilElementToBeClickable(ABOUT_BTN), driver);
        waitUntilElementToBeClickable(ABOUT_BTN).click();
        return new AboutUsPage(driver);
    }
}
