package Tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DefaultTest extends BaseTest {
    @BeforeTest
    @Override
    public void setUp() {
        super.setUp();
    }

    @AfterTest
    @Override
    public void terminate() {
        super.terminate();
    }
}

