package pirates.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageGetANoResultDiv extends Base{

    By NoResultsDivID = By.cssSelector("#error-no-results");

    public LandingPageGetANoResultDiv(WebDriver driver) {
        super(driver);
    }

    public boolean GetANoResultsDiv(){
        type("castle", queryInputId);
        click(submitButton);
        return isDisplayed(NoResultsDivID);
    }

}
