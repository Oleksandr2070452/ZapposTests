package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordComponents extends BasePage {

    public ChangePasswordComponents(WebDriver driver) {
        super(driver);
    }

    private final String SIGN_IN_BTN = "//a[@aria-label='Sign In']";
    //    private final String SIGN_IN_BTN = "//a[@class='Vh-z Yh-z Zh-z']";
    private final String SIGN_IN_WITH_ZAPPOS_BTN = "//a[@id='zapposSignIn']";
    private final String MY_ACCOUNT_MENU = "//a[text()='My Account']";
    private final String ACCOUNT_OVERVIEW_BTN = "//a[text()='Account Overview']";
    private final String MANAGE_ACCOUNT_INFO_BTN = "//a[text()='Manage Account Info']";
    private final String EDIT_PASSWORD_BTN = "//input[@id='auth-cnep-edit-password-button']";
    private final String INPUT_CURRENT_PASSWORD = "//input[@id='ap_password']";
    private final String INPUT_NEW_PASSWORD = "//input[@id='ap_password_new']";
    private final String INPUT_REENTER_PASSWORD = "//input[@id='ap_password_new_check']";
    private final String SAVE_CHANGES_BTN = "//div[@class='a-section a-spacing-large']/span";
    //    private final String SAVE_CHANGES_BTN = "//a[contains(text(),'Done')]";
//    private final String SAVE_CHANGES_BTN = "//input[@id='cnep_1D_submit_button']";
//    private final String SAVE_CHANGES_BTN = "//span[@class='a-button-text']";
//    private final String SAVE_CHANGES_BTN = "//span[contains(text(),'Save changes')]";
    private final String INCORRECT_PASS_MSG = "//h4[@class='a-alert-heading']";
    private final String DONE_BTN = "//a[@id='auth-cnep-done-button']";
//    private final String  = "";

    public WebElement getSignInBtn() {
        return waitUntilElementToBeClickable(SIGN_IN_BTN);
    }

    public WebElement getSignInWithZappos() {
        return waitUntilElementToBeClickable(SIGN_IN_WITH_ZAPPOS_BTN);
    }

    public WebElement getMyAccountMenu() {
        return waitUntilElementToBeClickable(MY_ACCOUNT_MENU);
    }

    public WebElement getAccountOverviewBtn() {
        return waitUntilElementToBeClickable(ACCOUNT_OVERVIEW_BTN);
    }

    public WebElement getManageAccountBtn() {
        return waitUntilElementToBeClickable(MANAGE_ACCOUNT_INFO_BTN);
    }

    public WebElement getEditPasswordBtn() {
        return waitUntilElementToBeClickable(EDIT_PASSWORD_BTN);
    }

    public WebElement getInputCurrentPassword() {
        return waitUntilVisibilityOfElement(INPUT_CURRENT_PASSWORD);
    }

    public WebElement getInputNewPassword() {
        return waitUntilVisibilityOfElement(INPUT_NEW_PASSWORD);
    }

    public WebElement getInputReenterPassword() {
        return waitUntilVisibilityOfElement(INPUT_REENTER_PASSWORD);
    }

    public WebElement getSaveChangesBtn() {
        return waitUntilElementToBeClickable(SAVE_CHANGES_BTN);
    }

    public WebElement getIncorrectPassMsg() {
        return waitUntilVisibilityOfElement(INCORRECT_PASS_MSG);
    }

    public WebElement getDoneBtn() {
        return waitUntilVisibilityOfElement(DONE_BTN);
    }

    //-------//-------//-------//-------
    public ChangePasswordComponents clickSignInBtn() {
        getSignInBtn().click();
        return this;
    }

    public ChangePasswordComponents clickSignInZapposBtn() {
        getSignInWithZappos().click();
        return this;
    }

    public ChangePasswordComponents clickMyAccountMenu() {
        getMyAccountMenu().click();
        return this;
    }

    public ChangePasswordComponents clickAccountOverviewBtn() {
        getAccountOverviewBtn().click();
        return this;
    }

    public ChangePasswordComponents clickManageAccountInfoBtn() {
        getManageAccountBtn().click();
        return this;
    }

    public ChangePasswordComponents clickEditPasswordBtn() {
        getEditPasswordBtn().click();
        return this;
    }

    public ChangePasswordComponents clickSaveChangesBtn() {
        getSaveChangesBtn().click();
        return this;
    }

    public ChangePasswordComponents clickDoneBtn() {
        getDoneBtn().click();
        return this;
    }


}