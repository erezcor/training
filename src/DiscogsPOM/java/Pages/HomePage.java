package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends PageObject {
    // Data Members
    @FindBy(id = "header_logo")
    protected WebElement mainPageButton;

    @FindBy(id = "search_q")
    protected WebElement searchBox;

    @FindBy(id = "do_site_search")
    protected WebElement searchButton;

    @FindBy(id = "cart_link")
    protected WebElement shoppingCartButton;

    @FindBy(id = "log_in_link")
    protected WebElement loginButton;

    @FindBy(partialLinkText = "Register")
    protected WebElement registerButton;

    @FindBy(partialLinkText = "Explore")
    protected WebElement exploreMenu;

    @FindBy(partialLinkText = "Marketplace")
    protected WebElement marketplaceMenu;

    @FindBy(partialLinkText = "Community")
    protected WebElement communityMenu;

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    // Methods
    public void setSearchText(String text) {
        type(this.searchBox, text);
    }

    public void clickOnSearchButton() {
        click(this.searchButton);
    }

    // Go to other pages
    public void goToMainPage() {
        click(this.mainPageButton);
    }

    public void goToLoginPage() {
        click(this.loginButton);
    }

    public void goToRegisterPage() {
        click(this.registerButton);
    }

    public void goToShoppingCartPage() {
        click(this.shoppingCartButton);
    }

    // Open menus
    public void openExploreMenu() {
        click(this.exploreMenu);
    }

    public void openMarketplaceMenu() {
        click(this.marketplaceMenu);
    }

    public void openCommunityMenu() {
        click(this.communityMenu);
    }
}
