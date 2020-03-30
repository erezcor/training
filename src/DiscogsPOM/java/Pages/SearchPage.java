package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends HomePage {
    // Data Members
    @FindBy (className = "explore")
    private WebElement searchText;
    // The text of the element is "Exploring " + SEARCH_TEXT + " "

    @FindBy (className = "pagination_total")
    private WebElement totalSearchResultsNumber;
    // The text of the element is in pattern "1-50 of x"

    @FindBy (className = "search_result_title")
    private WebElement firstSearchResultLink;

    @FindBy (partialLinkText = "Release")
    private WebElement refineByReleaseButton;

    @FindBy (partialLinkText = "Artist")
    private WebElement refineByArtistButton;

    @FindBy (id = "sort_top")
    private WebElement sortSearch;

    // CONST definition
    private final String SEARCH_DEFAULT_URL = "https://www.discogs.com/search/?q=";

    // Constructor
    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    // Methods
    public String getNumberOfTotalSearchResults() {
        return (this.totalSearchResultsNumber.getText());
    }

    public String getFirstResultName() {
        return (this.firstSearchResultLink.getText());
    }

    // Refine search: show only releases/artists
    public void refineSearchByRelease() {
        click(this.refineByReleaseButton);
    }

    public void refineSearchByArtist() {
        click(this.refineByArtistButton);
    }

    // Sort search
    public void sortByHot() {
        Select sortSearchSelect = new Select(sortSearch);
        sortSearchSelect.selectByVisibleText("Hot");
    }

    // Confirming Methods - is the URL of page as expected after the search was made
    // Pattern of URL after search: "https://www.discogs.com/search/?q=" + SEARCH_TEXT + "&type=" + REFINEMENT_TYPE
    //                                                                                     (if you refined the search)
    public boolean confirmSearchURL(String searchText) {
        String expectedURL = SEARCH_DEFAULT_URL + searchText;

        return (this.getCurrentURL().equals(expectedURL));
    }

    public boolean confirmArtistSearchRefinementURL(String searchText) {
        String expectedURL = SEARCH_DEFAULT_URL + searchText + "&type=artist";

        return (this.getCurrentURL().equals(expectedURL));
    }

    public boolean confirmReleaseSearchRefinementURL(String searchText) {
        String expectedURL = SEARCH_DEFAULT_URL + searchText + "&type=release";

        return (this.getCurrentURL().equals(expectedURL));
    }
}
