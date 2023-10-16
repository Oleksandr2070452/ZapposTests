package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    private final String BRANDS_BUTTON = "//a[@data-shyguy='navBrands']";
    private final String BRANDS_BY_LETTER = "//a[contains(@href,'/c/brands-%s')]";
    private final String DIESEL_BUTTON="//a[@href='/diesel/WgLGAuICAQs.zso']";
    private final String BRANDS_MODAL_WINDOW="//div[@data-headercategory='navBrands']";
    private final String BRANDS_LIST = "//a[@data-eventlabel='melodyBrandIndex']";
    private final String BRAND_NAME = "//a[contains(@data-eventvalue,'%s')]";
    private final String PRODUCT_BRAND_NAME = "//div[@id='products']//a[contains(@href,'%s')]";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickBrandsButton(){waitUntilElementToBeClickable(BRANDS_BUTTON).click();}
    public void clickBrandsByLetter(String letter){
        waitUntilElementToBeClickable(String.format(BRANDS_BY_LETTER, letter)).click();
    }
    public List<String> getBrandsList () {
        List<WebElement> webelBrandsList = waitUntilVisibilityOfElementsLocated(BRANDS_LIST);
        List<String> brandsList = new ArrayList<>();
        for (WebElement w : webelBrandsList) {
            brandsList.add(w.getText());
        }
        return brandsList;
    }
    public void clickBrandButtonByName(String brand){
        waitUntilElementToBeClickable(String.format(BRAND_NAME, brand)).click();
    }
    public boolean isBrandsModalWindowDisplayed(){
        return waitUntilVisibilityOfElement(BRANDS_MODAL_WINDOW).isDisplayed();
    }
    public List<String> getBrandNamesList (String brand) {
        List<WebElement> webelBrandNamesList = waitUntilVisibilityOfElementsLocated(String.format(PRODUCT_BRAND_NAME, brand.toLowerCase()));
        List<String> brandNamesList = new ArrayList<>();
        for (WebElement w : webelBrandNamesList) {
            brandNamesList.add(w.getText());
        }
        return brandNamesList;
    }

}
