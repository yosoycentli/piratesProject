package pirates.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageEmptySearch extends Base{

    By ErrorEmptyQueryDivID = By.cssSelector("#error-empty-query");

    By submitButton = By.cssSelector("#search-button");

    public LandingPageEmptySearch(WebDriver driver) {
        super(driver);
    }

    public boolean getErrorEmptyQueryDiv(){
        type("", queryInputId);
        click(submitButton);
        return isDisplayed(ErrorEmptyQueryDivID);
    }
}
