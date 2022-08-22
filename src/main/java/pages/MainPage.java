package pages;

import framework.BaseForm;
import framework.elements.Link;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {

    private static final String MAIN_PAGE_UNIQ_ELEMENT_LOCATOR = "//div[contains(@data-zone-data,'144076')]";

    public MainPage() {
        super(new Link(By.xpath(MAIN_PAGE_UNIQ_ELEMENT_LOCATOR), "Main page uniq element"), "Main page");
    }
}
