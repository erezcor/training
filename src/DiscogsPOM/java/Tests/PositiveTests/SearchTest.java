package Tests.PositiveTests;

import Pages.HomePage;
import Pages.SearchPage;
import Tests.BaseTest;

public class SearchTest extends BaseTest {
    private final String SEARCH_TEXT = "alchemist";

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

        //Assert.assertEquals(driver.getCurrentUrl(),
         //       "https://www.discogs.com/search/?sort=hot%2Cdesc&q=" + SEARCH_TEXT + "&type=release");
    }
}
