package pirates.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    //Static Variables

    By submitButton = By.cssSelector("#search-button");

    By queryInputId = By.cssSelector("#search-input");
    private final static String DRIVER_PATH = "./src/main/resources/drivers/chromedriver";

    //Declare webDriver Object
    private WebDriver driver;

    //class constructor
    public Base (WebDriver driver){
        this.driver = driver;
    }

    //Google Chrome working method
    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public Boolean GetAtLeastOneElement(By locator){
        return driver.findElements(locator).size() > 0;
    }

    public Boolean GetOnlyOneElement(By locator){
        return driver.findElements(locator).size() == 1;
    }

    public void visit(String url){
        driver.get(url);
    }
}
