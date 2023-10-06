package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;

public class HeaderComponent extends BasePage {
    private final String SIGN_IN_MENU = "//a[@aria-label='Sign In']";
    private final String GENERAL_TAB = "//a[contains(@data-shyguy,'%s')]";
    private final String GENERAL_SUBCATEGORIES = "//section/a[@data-hfsubnav='nav%s=%s']/following-sibling::ul//a[contains(text(),'%s')]";

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public HeaderComponent selectExactTab(String tabValue) {
        waitUntilElementToBeClickable(exactTab(tabValue)).click();
        return this;
    }

    public void selectExactSubcategory(String tab, String category, String subcategory) {
        waitUntilElementToBeClickable(exactSubcategory(tab, category, subcategory)).click();
    }

    public SignInComponent goSignInMenu() {
        waitUntilElementToBeClickable(SIGN_IN_MENU).click();
        return new SignInComponent(driver);
    }

    private String exactSubcategory(String tab, String category, String subcategory) {
        return format(GENERAL_SUBCATEGORIES, tab, category, subcategory);
    }

    private String exactTab(String tabValue) {
        return format(GENERAL_TAB, tabValue);
    }
}
