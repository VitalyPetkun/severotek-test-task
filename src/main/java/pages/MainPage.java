package pages;

import framework.BaseForm;
import framework.elements.Link;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {

    private static final String MAIN_PAGE_UNIQ_ELEMENT = "//div[contains(@data-zone-data,'144076')]";

    private MainPage() {
        super(new Link(By.xpath(MAIN_PAGE_UNIQ_ELEMENT), "Main page uniq element"), "Main page");
    }
}
