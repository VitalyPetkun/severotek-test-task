package steps;

import org.testng.Assert;
import pages.LaptopsPage;

import java.util.List;

public class LaptopsPageSteps {

    private static final LaptopsPage laptopsPage = new LaptopsPage();

    private LaptopsPageSteps() {
    }

    public static void clickManufacturerMoreLnk() {
        laptopsPage.clickManufacturerMoreLnk();
    }

    public static void searchManufacturer(String manufacturerName) {
        laptopsPage.searchManufacturer(manufacturerName);
    }

    public static void selectManufacturer(String manufacturerName) {
        laptopsPage.selectManufacturer(manufacturerName);
    }

    public static void inputBottomPrice(String bottomPrice) {
        laptopsPage.inputBottomPrice(bottomPrice);
    }

    public static void inputTopPrice(String topPrice) {
        laptopsPage.inputTopPrice(topPrice);
    }

    public static void clickSearchBtn() {
        laptopsPage.clickSearchBtn();
    }

    public static void assertIsCorrectLaptopsName(String manufacturerName) {
        List<String> laptopsName = laptopsPage.getLaptopsNames();
        for (String laptopName: laptopsName) {
            Assert.assertTrue(laptopName.contains(manufacturerName),
                    "Laptops isn't correct name.");
        }
    }

    public static void assertIsCorrectLaptopsPrice(String bottomPrice, String topPrice) {
        boolean compare;
        float firstPrice = Float.parseFloat(bottomPrice);
        float secondPrice = Float.parseFloat(topPrice);
        List<String> laptopsPrice = laptopsPage.getLaptopsPrices();
        for (String laptopPrice: laptopsPrice) {
            float currentPrice = Integer.parseInt(laptopPrice.replaceAll("[^0-9.]",""));
            compare = firstPrice <= currentPrice && currentPrice <= secondPrice;
            Assert.assertTrue(compare, "Result laptops isn't correct price.");
        }
    }

    public static void assertIsOpen() {
        Assert.assertTrue(laptopsPage.isFormOpen(), "Laptops page isn't open.");
    }
}
