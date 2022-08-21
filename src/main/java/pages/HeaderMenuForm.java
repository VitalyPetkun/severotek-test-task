package pages;

import framework.BaseForm;
import framework.elements.Button;
import org.openqa.selenium.By;

public class HeaderMenuForm extends BaseForm {

    private static final String CATALOG_BTN = "button[@id='catalogPopupButton']";

    private HeaderMenuForm() {
        super(new Button(By.xpath(CATALOG_BTN), "Header menu form uniq element"), "Header menu form");
    }

    public static void clickCatalogBtn() {
        new Button(By.xpath(CATALOG_BTN), "Catalog").click();
    }
}
