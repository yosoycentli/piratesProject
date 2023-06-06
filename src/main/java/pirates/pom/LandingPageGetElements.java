package pirates.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageGetElements extends Base{

    By queryInputId = By.cssSelector("#search-input");

    By submitButtonId = By.cssSelector("#search-button");

    public LandingPageGetElements(WebDriver driver) {
        super(driver);
    }

    public Boolean getInputId(){
        return isDisplayed(queryInputId);
    }

    public Boolean getSubmitButtonId(){
        return isDisplayed(submitButtonId);
    }

}
