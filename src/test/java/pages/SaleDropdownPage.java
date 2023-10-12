package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SaleDropdownPage extends BasePage {
    public SaleDropdownPage(WebDriver driver) {
        super(driver);
    }

    private final String TITLE_SALE = "//a[@href='/sale']";
    private final String SALE_SUBCATEGORIES = "//div[@data-headercategory='navSale']//div[@class='pi-z']//a[@data-hfsubnav]";

    private final String TITLE_BROOKS = "//a[text()='Brands on Sale']/following-sibling::ul//a[contains(@href,'brooks-sneakers-athletic-shoes')]";
    private final String SELECTIONS = "//div[@id='products']/article";
    private final String FIRST_PRODUCT = "//a[@data-style-id='5503631']";
    private final String ORIGINAL_PRICE = "//abbr/../following-sibling::span";
    private final String SALE_PRICE = "//span[@aria-label and @itemprop]/span[@aria-hidden]";


    public SaleDropdownPage saleDropdownClick() {
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

    public SaleDropdownPage brookClick() {
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

    public SaleDropdownPage firstProductClick() {
        waitUntilElementToBeClickable(FIRST_PRODUCT).click();
        return this;
    }

    public boolean check() {
        WebElement salePriceElement = waitUntilVisibilityOfElement(SALE_PRICE);
        WebElement originalPriceElement = waitUntilVisibilityOfElement(ORIGINAL_PRICE);

        String salePriceText = salePriceElement.getText();
        String originalPriceText = originalPriceElement.getText();

        double salePrice = Double.parseDouble(salePriceText.replaceAll("[^\\d.]+", ""));
        double originalPrice = Double.parseDouble(originalPriceText.replaceAll("[^\\d.]+", ""));
        System.out.println("Sale price: " + salePrice);
        System.out.println("Original price: " + originalPrice);

        if (salePrice < originalPrice) {
            return true;
        } else {
            return false;
        }
    }
}






