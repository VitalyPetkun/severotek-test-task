package tests;

import framework.browser.Browser;
import framework.utils.SmartLogger;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.HeaderMenuFormSteps;
import steps.LaptopsPageSteps;
import steps.MainPageSteps;

public class LaptopsSearchTest extends BaseTest {

    @Parameters({"url", "manufacturerName", "bottomPrice", "topPrice"})
    @Test
    public void laptopsSearch(@Optional("https://market.yandex.ru") String url,
                              @Optional("Lenovo") String manufacturerName,
                              @Optional("25000") String bottomPrice,
                              @Optional("30000") String topPrice) {
        SmartLogger.logStep(1, "Open main page");
        Browser.openUrl(url);
        MainPageSteps.assertIsOpen();

        SmartLogger.logStep(2, "Open laptop page");
        HeaderMenuFormSteps.clickCatalogBtn();
        HeaderMenuFormSteps.focusComputersPopMenu();
        HeaderMenuFormSteps.clickLaptopsPopMenuItem();
        LaptopsPageSteps.assertIsOpen();

        SmartLogger.logStep(3, "Laptops search");
        LaptopsPageSteps.clickManufacturerMoreLnk();
        LaptopsPageSteps.searchManufacturer(manufacturerName);
        LaptopsPageSteps.selectManufacturer(manufacturerName);
        LaptopsPageSteps.inputBottomPrice(bottomPrice);
        LaptopsPageSteps.inputTopPrice(topPrice);
        LaptopsPageSteps.clickSearchBtn();
        LaptopsPageSteps.assertIsCorrectLaptopsName(manufacturerName);
        LaptopsPageSteps.assertIsCorrectLaptopsPrice(bottomPrice, topPrice);
    }
}
