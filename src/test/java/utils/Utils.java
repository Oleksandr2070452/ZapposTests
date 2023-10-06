package utils;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Utils extends BasePage{
    public Utils(WebDriver driver) {
        super(driver);
    }

    public static List<String> GetStringList(WebDriver driver, String locator) {
        List<String> selections = new ArrayList<>();
        for (WebElement element : getElements(driver, locator)) {
            selections.add(element.getText());
        }
        return selections;
    }

    public static List<WebElement> getElements(WebDriver driver, String locator) {
        return driver.findElements(By.xpath(locator));
    }
}
