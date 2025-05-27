package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public boolean isAvailable() {
        try {
            WebElement availability = driver.findElement(By.id("availability"));
            return availability.getText().toLowerCase().contains("in stock");
        } catch (Exception e) {
            return false;
        }
    }

    public void addToCart() {
        WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-button"));
        WaitUtils.waitForElementToBeClickable(driver, addToCartBtn).click();
    }
}