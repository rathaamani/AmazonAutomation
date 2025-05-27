package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WaitUtils;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    //Locator
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");
    private By todaysDeals = By.linkText("Today's Deals");
    private By cartIcon = By.id("nav-cart");
    private By signInMenu = By.id("nav-link-accountList");
    private By primeLink = By.cssSelector("#nav-link-amazonprime");

    public void searchProduct(String productName) {
        WaitUtils.waitForElementToBeVisible(driver, searchBox).sendKeys(productName);
        WaitUtils.waitForElementToBeClickable(driver, searchButton).click();
    }
    public void goToTodaysDeals() {
        WaitUtils.waitForElementToBeClickable(driver, todaysDeals).click();
    }
    public void gotoCart(){
        WaitUtils.waitForElementToBeClickable(driver, cartIcon).click();
    }

    public void hoverOnSignInMenu(){
        Actions actions = new Actions(driver);
        WebElement signIn = WaitUtils.waitForElementToBeVisible(driver, signInMenu);
        actions.moveToElement(signIn).perform();
    }

    public void clickPrime(){
        WaitUtils.waitForElementToBeClickable(driver, primeLink).click();
    }
}