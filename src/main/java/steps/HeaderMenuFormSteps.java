package steps;

import org.testng.Assert;
import pages.HeaderMenuForm;

public class HeaderMenuFormSteps {

    private static HeaderMenuForm headerMenuForm = new HeaderMenuForm();

    private HeaderMenuFormSteps() {}

    public static void clickCatalogBtn() {
        headerMenuForm.clickCatalogBtn();
    }

    public static void focusComputersPopMenu() {
        headerMenuForm.focusComputersPopMenu();
    }

    public static void clickLaptopsPopMenuItem() {
        headerMenuForm.clickLaptopsPopMenuItem();
    }

    public static void assertIsVisible() {
        Assert.assertTrue(headerMenuForm.isFormOpen(), "Header menu form isn't visible");
    }
}
