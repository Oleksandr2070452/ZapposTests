package tests;

import base.TestInit;
import components.HeaderComponent;
import enumes.ErrorMassages;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.NotFoundPage;

public class SearchWithInvalidDataTest extends TestInit {

    @DataProvider(name = "invalidDataForSearch")
    public Object[][] setInvalidEmail() {
        return new Object[][]{
                {"jbjhavsjf"},
                {"Кирилиця"},
                {"!@#$"},
        };
    }

    @Test(dataProvider = "invalidDataForSearch")
    public void SearchWithInvalidData(String searchText) {
        HeaderComponent headerComponent = new HeaderComponent(driver);
        NotFoundPage notFoundPage = new NotFoundPage(driver);

        headerComponent.setTextInSearchInput(searchText);
        headerComponent.clickSearchButton();


        Assert.assertTrue(notFoundPage.getErrorMessage().equals(ErrorMassages.NOT_FOUND.getUiName()));
    }
}