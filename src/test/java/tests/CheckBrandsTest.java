package tests;

import base.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;



public class CheckBrandsTest extends TestInit {

    @Test
    public void checkFiltration() {
        HomePage homePage = new HomePage(driver);
        homePage.clickBrandsButton();
        String brandLetterToCheck = "d";
        String brandName = "Diesel";

        Assert.assertTrue(homePage.isBrandsModalWindowDisplayed());

        homePage.clickBrandsByLetter(brandLetterToCheck);

        for (String brand : homePage.getBrandsList()) {
            Assert.assertTrue(brand.startsWith(brandLetterToCheck.toUpperCase()));
        }
        homePage.clickBrandButtonByName(brandName);

        for (String name : homePage.getBrandNamesList(brandName)) {
            Assert.assertTrue(name.contains(brandName));
            System.out.println("Product name : " + name + " match with " + brandName);
        }
    }
}
