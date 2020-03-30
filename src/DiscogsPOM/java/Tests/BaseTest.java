package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    private final String DRIVER_PATH = "chromedriver.exe";
    private final String PAGE_URL = "https://www.discogs.com/";

    {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
    }

    protected void setUp() {
         driver = new ChromeDriver();
         driver.get(PAGE_URL);
         driver.manage().window().maximize();
    }

    protected void terminate() { driver.quit();
    }
}
