package pages;

import framework.BaseForm;
import framework.elements.Button;
import framework.elements.PopMenu;
import framework.elements.PopMenuItem;
import org.openqa.selenium.By;

public class HeaderMenuForm extends BaseForm {

    private static final String CATALOG_BTN_LOCATOR = "//button[@id='catalogPopupButton']";
    private final String COMPUTERS_POP_MENU_LOCATOR = "//li[contains(@data-zone-data,'97009164')]/a";
    private final String LAPTOPS_POP_MENU_ITEM_LOCATOR = "//div[contains(@data-zone-data,'54544')]/a";

    public HeaderMenuForm() {
        super(new Button(By.xpath(CATALOG_BTN_LOCATOR), "Header menu form uniq element"), "Header menu form");
    }

    public void clickCatalogBtn() {
        new Button(By.xpath(CATALOG_BTN_LOCATOR), "Catalog").click();
    }

    public void focusComputersPopMenu() {
        new PopMenu(By.xpath(COMPUTERS_POP_MENU_LOCATOR), "Computers").focus();
    }

    public void clickLaptopsPopMenuItem() {
        new PopMenuItem(By.xpath(LAPTOPS_POP_MENU_ITEM_LOCATOR), "Laptops").click();
    }
}
