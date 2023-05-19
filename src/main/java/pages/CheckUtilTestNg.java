package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckUtilTestNg {
    // Variables
    String pirateUrl = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";


    WebDriver driver;

    By queryInputId = By.cssSelector("#search-input");
    By submitButton = By.cssSelector("#search-button");
    By queryId = By.cssSelector("#search-button");
    By emptyQuery = By.cssSelector("#search-button");
    By divErrorId = By.cssSelector("#error-empty-query");

    public CheckUtilTestNg(WebDriver driver){
        this.driver = driver;
    }

    //Set empty query in the textbox

    public void setEmptyQuery(String strEmptyQuery){
        driver.findElement(queryId).sendKeys(strEmptyQuery);
    }

    //Get query input has id equal to search-input
    public Boolean getInputId(){
        return driver.findElement(queryInputId).isDisplayed();
    }

}
