package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NegativeTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @AfterMethod
    @Override
    public void terminate() {
        super.terminate();
    }
}
