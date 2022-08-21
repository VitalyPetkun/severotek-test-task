package framework;

import framework.browser.Browser;
import framework.browser.WaiterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import framework.utils.SmartLogger;

import java.util.List;

public abstract class BaseElement {

    private By locator;

    private String elementName;

    protected BaseElement(By locator, String elementName) {
        this.locator = locator;
        this.elementName = elementName;
    }

    public void click() {
        SmartLogger.logInfo("Click " + elementName + ".");
        try {
            WebElement element = WaiterUtils.elementToBeClickable(locator);
            ((JavascriptExecutor) Browser.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();
        } catch (Exception ex) {
            SmartLogger.logError("Don't click " + elementName + ".");
        }
    }

    public void clickAndClear() {
        this.click();
        this.findElement().clear();
    }

    public boolean isPresent() {
        return this.findElements().size() > 0;
    }

    public int sizeList() {
        return this.findElements().size();
    }

    public String getText() {
        return this.findElement().getText();
    }

    public String getTextElementForListElements(int index) {
        return this.findElements().get(index).getText();
    }

    public String getElementName() {
        return elementName;
    }

    public By getLocator() {
        return locator;
    }

    protected WebElement findElement() {
        return Browser.getDriver().findElement(locator);
    }

    protected List<WebElement> findElements() {
        return Browser.getDriver().findElements(locator);
    }
}
