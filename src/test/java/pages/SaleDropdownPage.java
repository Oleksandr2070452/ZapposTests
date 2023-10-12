package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SaleDropdown extends BasePage {
    public SaleDropdown(WebDriver driver) {
        super(driver);
    }

    private final String TITLE_SALE = "//a[@href='/sale']";
    private final String SALE_SUBCATEGORIES = "//div[@class='pi-z']//a[contains(@data-hfsubnav,'navSale')]";

    private final String TITLE_BROOKS = "//a[text()='Brands on Sale']/following-sibling::ul//a[contains(@href,'brooks-sneakers-athletic-shoes')]";
    private final String SELECTIONS = "//div[@id='products']/article";
    private final String FIRST_PRODUCT ="//a[@data-style-id='5503631']";
    private final String ORIGINAL_PRICE ="//span[@class='Ts-z Us-z']";
    private final String SALE_PRICE ="//span//span[@aria-hidden='true']";


    public SaleDropdown saleDropdownClick() {
        waitUntilElementToBeClickable(TITLE_SALE).click();
        return this;
    }

    public List<String> getSaleCategoriesNames() {
        List<WebElement> saleCategories = waitUntilVisibilityOfElementsLocated(SALE_SUBCATEGORIES);
        List<String> saleCategoriesNames = new ArrayList<>();
        for (WebElement w : saleCategories) {
            saleCategoriesNames.add(w.getText().trim());
        }
        return saleCategoriesNames;
    }

    public SaleDropdown brookClick() {
        waitUntilVisibilityOfElement(TITLE_BROOKS).click();
        return this;
    }

    public List<String> getSelections() {
        List<WebElement> saleSelection = waitUntilVisibilityOfElementsLocated(SELECTIONS);
        List<String> saleSelectionNames = new ArrayList<>();
        for (WebElement w : saleSelection) {
            saleSelectionNames.add(w.getText().toLowerCase().trim());
        }
        return saleSelectionNames;
    }
    public SaleDropdown firstProductClick(){
        waitUntilElementToBeClickable(FIRST_PRODUCT).click();
        return this;
    }


    }








