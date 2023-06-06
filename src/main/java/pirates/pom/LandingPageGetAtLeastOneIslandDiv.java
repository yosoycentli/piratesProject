package pirates.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageGetAtLeastOneIslandDiv extends Base{

    By liElement = By.tagName("li");

    public LandingPageGetAtLeastOneIslandDiv(WebDriver driver) {
        super(driver);
    }

    public boolean GetAtLeastOneIslandDiv(){
        type("isla", queryInputId);
        click(submitButton);
        return GetAtLeastOneElement(liElement);
    }

}
