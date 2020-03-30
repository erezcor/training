package Tests.DefaultTests;

import Pages.HomePage;
import Pages.RegisterPage;
import Tests.DefaultTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class RegisterTest extends DefaultTest {
    final String USERNAME = "Test_Automation_hello";
    final String EMAIL = "a12345@a12345.com";
    final String PASSWORD = "a123456789";

    @Test
    public void registerTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToRegisterPage();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setEmail(EMAIL);
        registerPage.setUsername(USERNAME);
        registerPage.setPassword(PASSWORD);
        registerPage.setPasswordConfirm(PASSWORD);
        registerPage.clickAcceptUserAgreement();
        registerPage.clickCreateAccount();
    }

    @AfterClass
    public void goToHomePage() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToMainPage();
    }
}
