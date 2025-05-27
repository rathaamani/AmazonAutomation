package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import utils.WebDriverFactory;

public class SearchTest {

//    private WebDriver driver;
//    private HomePage homePage;
//    private SearchResultsPage searchResultsPage;
//    private ProductPage productPage;
//
//    @BeforeClass
//    public void setUp() {
//        driver = WebDriverFactory.createDriver();
//        homePage = new HomePage(driver);
//        searchResultsPage = new SearchResultsPage(driver);
//        productPage = new ProductPage(driver);
//    }
//
//    @Test
//    public void testSearchAndAddRandomProductToCart() {
//        homePage.open();
//        homePage.search("Adidas Cricket Bat");
//        searchResultsPage.applyFourStarFilter();
//        searchResultsPage.clickOnRandomProduct();
//    }
//
//    @Test
//    public void testAddInStockProductToCart() {
//        homePage.open();
//        homePage.search("Adidas Cricket Bat");
//        searchResultsPage.applyFourStarFilter();
//        searchResultsPage.openFirstNonSponsoredProduct();
//
//        String title = productPage.getTitle();
//        System.out.println("Product Title: " + title);
//
//        Assert.assertTrue(title.toLowerCase().contains("cricket"), "Product title doesn't match expected keyword.");
//        Assert.assertTrue(productPage.isAvailable(), "Product is not available.");
//
//        productPage.addToCart();
//    }
//
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
