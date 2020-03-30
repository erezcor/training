package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    // WebDriver definition
    protected WebDriver driver;

    // CONST definition
    private final String DRIVER_PATH = "C:\\Users\\Erez Corech\\Desktop\\chromedriver.exe";
    private final String PAGE_URL = "https://www.discogs.com/";

    {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
    }

    // Methods with no annotations
    protected void setUp() {
         driver = new ChromeDriver();
         driver.get(PAGE_URL);
         driver.manage().window().maximize();
    }

    protected void terminate() { driver.quit();
    }
}
