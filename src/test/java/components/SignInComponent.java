package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;

public class SignInComponent extends BasePage {
    private final String SIGN_WITH_ZAPPOS = "//a[@id='zapposSignIn']";

    public SignInComponent(WebDriver driver) {
        super(driver);
    }

    public SignInPage goSignInWithZappos() {
        waitUntilElementToBeClickable(SIGN_WITH_ZAPPOS).click();
        return new SignInPage(driver);
    }
}
