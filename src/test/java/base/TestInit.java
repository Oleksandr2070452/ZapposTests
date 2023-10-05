package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    WebDriver driver;

    private final String BASE_URL = "https://www.zappos.com/";

    @BeforeMethod
    public void openDriver() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterMethod
    public void closeTest() {
        driver.quit();
    }
}
