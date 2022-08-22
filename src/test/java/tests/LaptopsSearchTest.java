package tests;

import framework.browser.Browser;
import framework.utils.PropertiesManager;
import framework.utils.SmartLogger;
import org.testng.annotations.Test;
import steps.HeaderMenuFormSteps;
import steps.LaptopsPageSteps;
import steps.MainPageSteps;

import static services.FilesName.TEST_DATA;
import static services.Paths.TEST_RESOURCES;
import static services.TestDataVariables.*;

public class LaptopsSearchTest extends BaseTest{

    private final String MANUFACTURER_NAME = PropertiesManager.getValue(TEST_RESOURCES.getPath(),
            TEST_DATA.getFileName(), manufacturerName.getVariable());
    private final String BOTTOM_PRICE = PropertiesManager.getValue(TEST_RESOURCES.getPath(),
            TEST_DATA.getFileName(), bottomPrice.getVariable());
    private final String TOP_PRICE = PropertiesManager.getValue(TEST_RESOURCES.getPath(),
            TEST_DATA.getFileName(), topPrice.getVariable());
    private final String RESULT_PAGE_NUMBER = PropertiesManager.getValue(TEST_RESOURCES.getPath(),
            TEST_DATA.getFileName(), resultPageNumber.getVariable());

    @Test
    public void laptopsSearch() {
        SmartLogger.logStep(1, "Open main page");
        Browser.openUrl(MARKET_YANDEX_URL);
        MainPageSteps.assertIsOpen();

        SmartLogger.logStep(2, "Open laptop page");
        HeaderMenuFormSteps.clickCatalogBtn();
        HeaderMenuFormSteps.focusComputersPopMenu();
        HeaderMenuFormSteps.clickLaptopsPopMenuItem();
        LaptopsPageSteps.assertIsOpen();

        SmartLogger.logStep(3, "Laptops search");
        LaptopsPageSteps.clickManufacturerMoreLnk();
        LaptopsPageSteps.searchManufacturer(MANUFACTURER_NAME);
        LaptopsPageSteps.selectManufacturer(MANUFACTURER_NAME);
        LaptopsPageSteps.inputBottomPrice(BOTTOM_PRICE);
        LaptopsPageSteps.inputTopPrice(TOP_PRICE);
        LaptopsPageSteps.clickSearchBtn();
        LaptopsPageSteps.assertIsCorrectLaptopsName(MANUFACTURER_NAME);
        LaptopsPageSteps.assertIsCorrectLaptopsPrice(BOTTOM_PRICE, TOP_PRICE);
    }
}
