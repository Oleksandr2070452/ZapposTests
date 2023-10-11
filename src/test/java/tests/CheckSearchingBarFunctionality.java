package tests;

import base.TestInit;
import components.HeaderComponent;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckSearchingBarFunctionality extends TestInit {

    @Test
    public void CheckSearchingBarFunctionalityTest() {
        HeaderComponent headerComponent = new HeaderComponent(driver);

        headerComponent.clickOnSearchInput();

        Assert.assertTrue(headerComponent.getDropDownMenuAfterClickSearchInput().isDisplayed());
        Assert.assertTrue(headerComponent.getTheStyleRoomLogo().isDisplayed());

        headerComponent.clickTheStyleRoomLogo();
        switchToTheNextWindow();

        Assert.assertEquals(getUrl(), "https://www.zappos.com/c/the-style-room-women");
    }
}
