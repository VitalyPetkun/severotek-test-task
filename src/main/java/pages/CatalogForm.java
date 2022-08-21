package pages;

import framework.BaseForm;
import framework.elements.PopMenu;
import framework.elements.PopMenuItem;
import org.openqa.selenium.By;

public class CatalogForm extends BaseForm {

    private static final String COMPUTERS_POP_MENU = "//li[contains(@data-zone-data,'97009164')]/a";
    private static final String LAPTOP_POP_MENU_ITEM = "//div[contains(@data-zone-data,'54544')]/a";
    private static final String CATALOG_FORM_UNIQ_ELEMENT = "//div[@id='catalogPopup']";

    private CatalogForm() {
        super(new PopMenu(By.xpath(CATALOG_FORM_UNIQ_ELEMENT), "Catalog form uniq element"), "Catalog form");
    }

    public static void focusComputersPopMenu() {
        new PopMenu(By.xpath(COMPUTERS_POP_MENU), "Computers").focus();
    }

    public static void clickComputersPopMenu() {
        new PopMenuItem(By.xpath(LAPTOP_POP_MENU_ITEM), "Laptop").click();
    }
}
