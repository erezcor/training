package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RegisterPage extends HomePage {
    // Data Members
    @FindBy (id = "username")
    WebElement usernameBox;

    @FindBy (id = "email")
    WebElement emailBox;

    @FindBy (id = "password")
    WebElement passwordBox;

    @FindBy (id = "password_confirm")
    WebElement passwordConfirmBox;

    @FindBy (id = "accept_user_agreements")
    WebElement acceptUserAgreementButton;

    @FindBy (name = "Action.CreateAccount")
    WebElement createAccount;

    // Constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),  this);
    }

    // Methods
    public void setUsername(String username) {
        type(this.usernameBox, username);
    }

    public void setEmail(String email) {
        type(this.emailBox, email);
    }

    public void setPassword(String password) {
        type(this.passwordBox, password);
    }

    public void setPasswordConfirm(String password) {
        type(this.passwordConfirmBox, password);
    }

    public void clickAcceptUserAgreement() {
        click(this.acceptUserAgreementButton);
    }

    public void clickCreateAccount() {
        click(this.createAccount);
    }
}
