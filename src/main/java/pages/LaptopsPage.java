package pages;

import framework.BaseForm;
import framework.elements.*;
import org.openqa.selenium.By;
import java.util.List;

public class LaptopsPage extends BaseForm {

    private static final String LAPTOPS_PAGE_UNIQ_ELEMENT_LOCATOR =
            "//div[@id='serpTop']";
    private final String MANUFACTURER_MORE_LOCATOR =
            "//span[contains(text(),'Производитель')]//ancestor::fieldset//span[@role='button']";
    private final String MANUFACTURER_SEARCH_LOCATOR =
            "//label[contains(text(),'Найти производителя')]//parent::div/input";
    private final String BOTTOM_PRICE_LOCATOR =
            "//span[contains(text(),'Цена')]//ancestor::fieldset//label[contains(text(),'от')]/following-sibling::input";
    private final String TOP_PRICE_LOCATOR =
            "//span[contains(text(),'Цена')]//ancestor::fieldset//label[contains(text(),'до')]/following-sibling::input";
    private final String SEARCH_LOCATOR =
            "//span[contains(@data-auto,'found')]/span";
    private final String LAPTOPS_NAMES_LOCATOR =
            "//div[@data-index]//a[@title]";
    private final String LAPTOPS_PRICES_LOCATOR =
            "//div[@data-index]//div[@data-zone-name='price']//span[@data-auto='mainPrice']";

    public LaptopsPage() {
        super(new Link(By.xpath(LAPTOPS_PAGE_UNIQ_ELEMENT_LOCATOR), "Laptops page uniq element"), "Laptops page");
    }

    public void clickManufacturerMoreLnk() {
        new Link(By.xpath(MANUFACTURER_MORE_LOCATOR), "Manufacturer more").click();
    }

    public void searchManufacturer(String newManufacturerName) {
        new TextBox(By.xpath(MANUFACTURER_SEARCH_LOCATOR), "Manufacturer search").clickAndClear();
        new TextBox(By.xpath(MANUFACTURER_SEARCH_LOCATOR), "Manufacturer search").inputText(newManufacturerName);
    }

    public void selectManufacturer(String manufacturerName) {
        String manufacturerNameLocator = String
                .format("//span[contains(text(),'%s')]//ancestor::label/input/following-sibling::span", manufacturerName);
        new CheckBox(By.xpath(manufacturerNameLocator), "Manufacturer with name '" + manufacturerName +  "'").click();
    }

    public void inputBottomPrice(String bottomPrice) {
        new TextBox(By.xpath(BOTTOM_PRICE_LOCATOR), "Bottom price").clickAndClear();
        new TextBox(By.xpath(BOTTOM_PRICE_LOCATOR), "Bottom price").inputText(bottomPrice);
    }

    public void inputTopPrice(String topPrice) {
        new TextBox(By.xpath(TOP_PRICE_LOCATOR), "Top price").clickAndClear();
        new TextBox(By.xpath(TOP_PRICE_LOCATOR), "Top price").inputText(topPrice);
    }

    public void clickSearchBtn() {
        new Button(By.xpath(SEARCH_LOCATOR), "Search").click();
    }

    public List<String> getLaptopsNames() {
        return this.getElementsText(By.xpath(LAPTOPS_NAMES_LOCATOR));
    }

    public List<String> getLaptopsPrices() {
        return this.getElementsText(By.xpath(LAPTOPS_PRICES_LOCATOR));
    }
}
