package tests;

import framework.browser.Browser;
import framework.utils.PropertiesManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.FilesName;
import services.Paths;
import services.Url;

public class BaseTest {

    protected final String MARKET_YANDEX_URL = PropertiesManager.getValue(Paths.MAIN_RESOUCES.getPath(),
            FilesName.CONFIG.getFileName(), Url.MARKET_YANDEX.getUrl());

    @BeforeMethod
    protected void setup() {
        Browser.setMaximizeWindow();
        Browser.timeouts();
    }

    @AfterMethod
    protected void quitDriver() {
        Browser.quit();
    }
}
