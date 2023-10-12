package tests;

import base.TestInit;
import components.FooterComponent;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;

public class FooterTest extends TestInit {
    @Test
    public void checkAboutTheFooter() {
        FooterComponent footerComponent = new FooterComponent(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);

        footerComponent.scrollAndClickAboutBtn();

        Assert.assertTrue(aboutUsPage.isAboutUsDisplayed());
    }
}
