package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent extends BasePage {
    private final String SIGN_IN_MENU = "//div[@class='Ai-z']/a";
    private final String SEARCH_INPUT = "//input[@id='searchAll']";
    private final String SEARCH_BUTTON = "//button[@class='ob-z']";

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public SignInComponent goSignInMenu() {
        waitUntilElementToBeClickable(SIGN_IN_MENU).click();
        return new SignInComponent(driver);
    }

   public HeaderComponent setTextInSearchInput(String text){
        waitUntilVisibilityOfElement(SEARCH_INPUT).sendKeys(text);
        return this;
   }

   public HeaderComponent clickSearchButton(){
       waitUntilElementToBeClickable(SEARCH_BUTTON).click();
       return this;
   }
}