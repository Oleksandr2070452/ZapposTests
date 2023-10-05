package base;

import components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.UserData;

public class TestInit {

    protected static WebDriver driver;

    private final String BASE_URL = "https://www.zappos.com/";

    @BeforeMethod
    public void openDriveWithLogin() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        HeaderComponent headerComponent = new HeaderComponent(driver);
        headerComponent.goSignInMenu()
                .goSignInWithZappos()
                .setEmail(UserData.USER_EMAIL)
                .setPassword(UserData.USER_PASSWORD)
                .SignIn();
    }

    @AfterMethod
    public void closeTest() {
        driver.quit();
    }

    public void navigateGoBack() {
        driver.navigate().back();
    }
}
