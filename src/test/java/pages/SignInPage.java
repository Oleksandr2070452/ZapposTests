package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    private final String EMAIL_INPUT_FIELD = "//input[@type='email']";
    private final String PASSWORD_INPUT_FIELD = "//input[@type='password']";
    private final String SIGN_IN_BUTTON = "//input[@id='signInSubmit']";

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage setEmail(String email) {
        waitUntilElementToBeClickable(EMAIL_INPUT_FIELD).sendKeys(email);
        return this;
    }

    public SignInPage setPassword(String pass) {
        waitUntilElementToBeClickable(PASSWORD_INPUT_FIELD).sendKeys(pass);
        return this;
    }

    public void SignIn() {
        waitUntilElementToBeClickable(SIGN_IN_BUTTON).click();
    }
}
