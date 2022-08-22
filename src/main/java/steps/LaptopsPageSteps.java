package steps;

import org.testng.Assert;
import pages.LaptopsPage;

import java.util.List;

public class LaptopsPageSteps {

    private static LaptopsPage laptopsPage = new LaptopsPage();

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

    public static void clickPageNumber(String pageNumber) {
        laptopsPage.clickPageNumber(pageNumber);
    }

    public static void assertIsCorrectLaptopsName(String manufacturerName) {
        List<String> laptopsName = laptopsPage.getLaptopsNames();
        for (int i = 0; i < laptopsName.size(); i++) {
            Assert.assertTrue(laptopsName.get(i).contains(manufacturerName),
                    "Laptops isn't correct name.");
        }
    }

    public static void assertIsCorrectLaptopsPrice(String bottomPrice, String topPrice) {
        boolean compare;
        int firstPrice = Integer.parseInt(bottomPrice);
        int secondPrice = Integer.parseInt(topPrice);
        List<String> laptopsPrice = laptopsPage.getLaptopsPrices();

        for (int i = 0; i < laptopsPrice.size(); i++) {
            int currentPrice = Integer.parseInt(laptopsPrice.get(i));
            if (firstPrice <= currentPrice && currentPrice <= secondPrice) {
                compare = true;
            } else {
                compare = false;
            }
            Assert.assertTrue(compare, "Result laptops isn't correct price.");
        }
    }

    public static void assertIsOpen() {
        Assert.assertTrue(laptopsPage.isFormOpen(), "Laptops page isn't open.");
    }
}
