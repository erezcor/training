package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageObject {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected PageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    protected void type(WebElement element, String text) {
        //waitToBeVisible(element);
        element.sendKeys(text);
    }

    protected void click(WebElement element) {
        //waitToBeClickable(element);
        element.click();
    }

    protected String getCurrentURL() {
        return (driver.getCurrentUrl());
    }
}
