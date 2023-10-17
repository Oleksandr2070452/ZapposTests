package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class AboutUsPage extends BasePage {
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    private final String TITLE_ABOUT_US = "//h1";

    public boolean isAboutUsDisplayed() {
        return waitUntilVisibilityOfElement(TITLE_ABOUT_US).isDisplayed();
    }
}

