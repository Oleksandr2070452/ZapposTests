package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class NotFoundPage extends BasePage {
    private final String ERROR_MESSAGE = "//h1";

    public NotFoundPage(WebDriver driver) {
        super(driver);
    }

    public String getErrorMessage() {
        return waitUntilVisibilityOfElement(ERROR_MESSAGE).getText();
    }

}
