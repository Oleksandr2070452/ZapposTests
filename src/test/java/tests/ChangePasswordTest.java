package tests;

import components.ChangePasswordComponents;
import components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.SignInPage;
import utils.UserData;

import static org.testng.Assert.assertEquals;

public class ChangePasswordTest {
    private final String BASE_URL = "https://www.zappos.com/";
    private String incorrectPassMsg = "There was a problem";
    private String urlVerify = "https://www.zappos.com/account";
    WebDriver driver;

    @Test
    public void changePasswordTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();

        ChangePasswordComponents changePasswordComponent = new ChangePasswordComponents(driver);
        HeaderComponent headerComponent = new HeaderComponent(driver);
        SignInPage signInPage = new SignInPage(driver);

        changePasswordComponent
                .clickSignInBtn()
                .clickSignInZapposBtn();
        signInPage
                .setEmail(UserData.SECOND_USER_EMAIL)
                .setPassword(UserData.SECOND_USER_PASSWORD)
                .clickSignInBtn();

        changePasswordComponent
                .clickMyAccountMenu()
                .clickAccountOverviewBtn()
                .clickManageAccountInfoBtn()
//        signInPage
//                .clickSignInBtn();
//        changePasswordComponent
                .clickEditPasswordBtn()
                .getInputCurrentPassword().sendKeys(UserData.SECOND_USER_PASSWORD);
        changePasswordComponent
                .getInputNewPassword().sendKeys(UserData.WRONG_USER_PASSWORD);
        changePasswordComponent
                .getInputReenterPassword().sendKeys(UserData.WRONG_USER_PASSWORD);
        changePasswordComponent
                .clickSaveChangesBtn();

//        signInPage
//                .setEmail(UserData.SECOND_USER_EMAIL)
//                .setPassword(UserData.WRONG_USER_PASSWORD)
//                .clickSignInBtn();

        changePasswordComponent
                .clickDoneBtn();
        assertEquals(driver.getCurrentUrl(), urlVerify);

        driver.quit();
    }
}
