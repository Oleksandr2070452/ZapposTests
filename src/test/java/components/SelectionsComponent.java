package components;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class SelectionsComponent extends BasePage {
    private final String ALL_ACTIVE_SELECTIONS = "//ul[@id='searchSelectedFilters']/li/a";

    public SelectionsComponent(WebDriver driver) {
        super(driver);
    }

    public List<String> getActiveSelections() {
        return Utils.GetStringList(driver, ALL_ACTIVE_SELECTIONS);
    }
}
