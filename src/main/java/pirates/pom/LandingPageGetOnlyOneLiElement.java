package pirates.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageGetOnlyOneLiElement extends Base{

    By liElement = By.tagName("li");

    public LandingPageGetOnlyOneLiElement(WebDriver driver) {
        super(driver);
    }

    public boolean GetOnlyOneElement(){
        type("port", queryInputId);
        click(submitButton);
        return GetOnlyOneElement(liElement);
    }
}
