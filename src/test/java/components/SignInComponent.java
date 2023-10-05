package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;

public class SignInComponent extends BasePage {
    private final String SIGN_WITH_ZAPPOS = "//div[@class='Gm-z']/a[contains(text(),'Sign in with Zappos')]";

    public SignInComponent(WebDriver driver) {
        super(driver);
    }

    public SignInPage goSignInWithZappos() {
        waitUntilElementToBeClickable(SIGN_WITH_ZAPPOS).click();
        return new SignInPage(driver);
    }
}
