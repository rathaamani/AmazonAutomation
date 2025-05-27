package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitUtils;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SearchResultsPage {
    private WebDriver driver;
    public SearchResultsPage(WebDriver driver) {
            this.driver = driver;
        }

        public void applyFourStarFilter() {
            By filterLocator = By.xpath("//span[contains(text(),'4 Stars & Up') or contains(text(),'4 Stars & above')]");
            WebElement filter = WaitUtils.waitForElementToBeClickable(driver, filterLocator);
            filter.click();
        }

        public void clickOnRandomProduct() {
            List<WebElement> products = driver.findElements(By.cssSelector(".s-main-slot a.a-link-normal.s-no-outline"));
            if (!products.isEmpty()) {
                WebElement randomProduct = products.get(new Random().nextInt(products.size()));
                WaitUtils.waitForElementToBeClickable(driver, randomProduct).click();
            }
        }

        public void openFirstNonSponsoredProduct() {
            List<WebElement> products = driver.findElements(By.cssSelector(".s-main-slot a.a-link-normal.s-no-outline"));
            for (WebElement product : products) {
                if (product.isDisplayed()) {
                    WaitUtils.waitForElementToBeClickable(driver, product).click();
                    break;
                }
            }
        }
    }