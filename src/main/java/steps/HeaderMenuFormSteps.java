package steps;

import pages.HeaderMenuForm;

public class HeaderMenuFormSteps {

    private static final HeaderMenuForm headerMenuForm = new HeaderMenuForm();

    private HeaderMenuFormSteps() {
    }

    public static void clickCatalogBtn() {
        headerMenuForm.clickCatalogBtn();
    }

    public static void focusComputersPopMenu() {
        headerMenuForm.focusComputersPopMenu();
    }

    public static void clickLaptopsPopMenuItem() {
        headerMenuForm.clickLaptopsPopMenuItem();
    }
}
