package Tests.DefaultTests;

import Pages.HomePage;
import Pages.SearchPage;
import Tests.DefaultTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SearchTest extends DefaultTest {
    private final String SEARCH_TEXT = "Alchemist";

    @Test
    public void searchTest() {
        HomePage homePage = new HomePage(driver);
        homePage.setSearchText(SEARCH_TEXT);
        homePage.clickOnSearchButton();

        SearchPage searchPage = new SearchPage(driver);
        System.out.println("Search results showing: " + searchPage.getNumberOfTotalSearchResults());
        System.out.println("First result name: " + searchPage.getFirstResultName());

        searchPage.refineSearchByRelease();
        searchPage.sortByHot();

        System.out.println("Search results showing after refining: " + searchPage.getNumberOfTotalSearchResults());
        System.out.println("First result name: " + searchPage.getFirstResultName());
    }

    @AfterClass
    public void goToHomePage() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.goToMainPage();
    }
}
