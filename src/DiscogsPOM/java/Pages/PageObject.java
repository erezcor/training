package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
    // Data Members
    protected WebDriver driver;
    protected WebDriverWait wait;

    // Constructor
    protected PageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    // Wait Methods
    protected void waitToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Methods on Elements
    protected void type(WebElement element, String text) {
        waitToBeVisible(element);
        element.sendKeys(text);
    }

    protected void click(WebElement element) {
        waitToBeClickable(element);
        element.click();
    }

    // Methods on Driver
    protected String getCurrentURL() {
        return (driver.getCurrentUrl());
    }
}
