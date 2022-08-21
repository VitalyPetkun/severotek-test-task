package pages;

import framework.BaseForm;
import framework.elements.Link;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {

    private static final String UNIQ_ELEMENT = "//div[contains(@data-zone-data,'144076')]";

    private MainPage() {
        super(new Link(By.xpath(UNIQ_ELEMENT), "Main page uniq element"), "Main page");
    }
}
