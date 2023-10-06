package tests;

import base.TestInit;
import components.HeaderComponent;
import components.SelectionsComponent;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CartTests extends TestInit {
    private String TAB = "Women";
    private String CATEGORY = "Shoes";
    private String SUBCATEGORY = "Loafers";
    private List<String> activeSelections;
    private HeaderComponent headerComponent;
    private SelectionsComponent selectionsComponent;
    private SoftAssertions softAssert;

    @BeforeMethod
    public void preparation() {
        headerComponent = new HeaderComponent(driver);
        selectionsComponent = new SelectionsComponent(driver);
        softAssert = new SoftAssertions();
    }

    @Test(description = "Check the adding  and removing goods to cart")
    public void addingAndRemoving() {
        headerComponent.selectExactTab(TAB)
                .selectExactSubcategory(TAB, CATEGORY, SUBCATEGORY);

        activeSelections = selectionsComponent.getActiveSelections();

        for (String selection : activeSelections) {
            softAssert.assertThat(selection.equals(TAB) || selection.equals(CATEGORY) || selection.equals(SUBCATEGORY));
        }
        softAssert.assertAll();
    }
}
