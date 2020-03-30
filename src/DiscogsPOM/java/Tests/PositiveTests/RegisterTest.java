package Tests.PositiveTests;

import Pages.HomePage;
import Pages.RegisterPage;
import Tests.BaseTest;

public class RegisterTest extends BaseTest {
    final String USERNAME = "Test_Automation_hello";
    final String EMAIL = "a12345@a12345.com";
    final String PASSWORD = "a123456789";


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
}
