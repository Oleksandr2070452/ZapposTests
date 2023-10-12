package tests;

import base.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SaleDropdownPage;

import java.util.Arrays;
import java.util.List;

public class SalePriceTest extends TestInit {
    List<String> saleCategoriesList = Arrays.asList("Women's Sale", "Men's Sale", "Kids' Sale", "Brands on Sale", "Shop All Sale");

    @Test
    public void checkSalePrice() {
        SaleDropdownPage saleDropdownPage = new SaleDropdownPage(driver);

        saleDropdownPage.saleDropdownClick();

        Assert.assertEquals(saleDropdownPage.getSaleCategoriesNames(), saleCategoriesList);

        saleDropdownPage.brookClick();

        for (String str : saleDropdownPage.getSelections()) {
            Assert.assertTrue(str.contains("brooks"));
        }

        saleDropdownPage
                .firstProductClick();

        Assert.assertTrue(saleDropdownPage.check());


    }
}

