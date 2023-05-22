package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckUtilTestNg {
    // Variables
    String pirateUrl = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";


    WebDriver driver;

    String emptyQuery = "";

    String islaQuery = "isla";

    String liElement = "li";

    String castleQuery = "castle";

    String portQuery = "port";

    By queryInputId = By.cssSelector("#search-input");
    By submitButton = By.cssSelector("#search-button");
    By ErrorEmptyQueryDivID = By.cssSelector("#error-empty-query");

    By NoResultsDivID = By.cssSelector("#error-no-results");

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

    public Boolean GetAtLeastOneIslandDiv(){
        return driver.findElements(By.tagName(liElement)).size() > 0;
    }

    public Boolean setIslaQuery(){
        driver.findElement(queryInputId).sendKeys(islaQuery);
        WebElement searchButton = driver.findElement(submitButton);
        searchButton.click();

        return GetAtLeastOneIslandDiv();
    }

    public Boolean GetANoResultsDiv(){
        return driver.findElement(NoResultsDivID).isDisplayed();
    }

    public Boolean setCastleQuery(){
        driver.findElement(queryInputId).sendKeys(castleQuery);
        WebElement searchButton = driver.findElement(submitButton);
        searchButton.click();

        return GetANoResultsDiv();
    }

    public Boolean GetOnlyOneLiElement(){
        return driver.findElements(By.tagName(liElement)).size() == 1;
    }

    public Boolean setPortQuery(){
        driver.findElement(queryInputId).sendKeys(portQuery);
        WebElement searchButton = driver.findElement(submitButton);
        searchButton.click();

        return GetOnlyOneLiElement();
    }

}
