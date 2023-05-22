package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckUtilTestNg {
    // Variables
    String pirateUrl = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";


    WebDriver driver;

    String emptyQuery = "";

    By queryInputId = By.cssSelector("#search-input");
    By submitButton = By.cssSelector("#search-button");
    By ErrorEmptyQueryDivID = By.cssSelector("#error-empty-query");

    public CheckUtilTestNg(WebDriver driver){
        this.driver = driver;
    }

    public Boolean getInputId(){
        return driver.findElement(queryInputId).isDisplayed();
    }

    public Boolean getSubmitButtonId(){
        return driver.findElement(submitButton).isDisplayed();
    }

    public Boolean getErrorEmptyQueryDiv(){
        return driver.findElement(ErrorEmptyQueryDivID).isDisplayed();
    }

    public Boolean setEmptyQuery(){
        driver.findElement(queryInputId).sendKeys(emptyQuery);
        WebElement searchButton = driver.findElement(submitButton);
        searchButton.click();

        return getErrorEmptyQueryDiv();
    }

}
