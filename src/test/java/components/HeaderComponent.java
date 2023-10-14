package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent extends BasePage {
    private final String SIGN_IN_MENU = "//div[@class='Ai-z']/a";
    private final String SEARCH_INPUT = "//input[@id='searchAll']";
    private final String SEARCH_BUTTON = "//button[@class='ob-z']";
    private final String DROP_DOWN_MENU_AFTER_CLICK_SEARCH_INPUT = "//div[@class='Zg-z']";
    private final  String THE_STYLE_ROOM_LOGO = "//a[@aria-label='The Style Room']";

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

   public HeaderComponent clickOnSearchInput(){
        waitUntilElementToBeClickable(SEARCH_INPUT).click();
        return this;
   }

   public WebElement getDropDownMenuAfterClickSearchInput(){
        return waitUntilVisibilityOfElement(DROP_DOWN_MENU_AFTER_CLICK_SEARCH_INPUT);
   }

    public WebElement getTheStyleRoomLogo() {
        return waitUntilVisibilityOfElement(THE_STYLE_ROOM_LOGO);
    }

    public HeaderComponent clickTheStyleRoomLogo() {
        waitUntilElementToBeClickable(THE_STYLE_ROOM_LOGO).click();
        return this;
    }

   public HeaderComponent clickSearchButton(){
       waitUntilElementToBeClickable(SEARCH_BUTTON).click();
       return this;
   }
}