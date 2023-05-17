package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;

public class CheckUtil {

    static String pirateUrl = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";
    static String chromeDriverPath = "/Users/centli.garcesencora.com/Documents/encora/pirate_task/piratesProject/src/main/resources/drivers/chromedriver";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/centli.garcesencora.com/Documents/encora/pirate_task/piratesProject/src/main/resources/drivers/chromedriver");

        // Initialize Browser
        WebDriver driver = new ChromeDriver();

        // Open url
        driver.get(pirateUrl);

        // Maximize browser
        driver.manage().window().maximize();

        // Find elements by id
        WebElement searchInput = driver.findElement(By.cssSelector("#search-input"));
        WebElement submitButton = driver.findElement(By.cssSelector("#search-button"));

        // Close Browser
        driver.quit();


    }

    public static Object searchQuery(String queryInputId) {

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        // Initialize Browser
        WebDriver driver = new ChromeDriver();

        // Open url
        driver.get(pirateUrl);

        try {
            // Find element by id
            WebElement searchInput = driver.findElement(By.cssSelector(queryInputId));
            // search-input id does exist
            return 0;
        } catch (NoSuchElementException e) {
            // search-input id doesn't exist
            return 1;
        }

    }
    public static Object submitButton(String buttonId) {

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        // Initialize Browser
        WebDriver driver = new ChromeDriver();

        // Open url
        driver.get(pirateUrl);

        try {
            // Find element by id
            WebElement submitButton = driver.findElement(By.cssSelector(buttonId));
            // search-input id does exist
            return 0;
        } catch (NoSuchElementException e) {
            // search-input id doesn't exist
            return 1;
        }

    }

    public static Object emptyQuery(String divId) {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.get(pirateUrl);

        try {
            WebElement inputField = driver.findElement(By.cssSelector("#search-input"));

            inputField.sendKeys("");

            WebElement searchButton = driver.findElement(By.id("search-button"));

            searchButton.click();

            WebElement submitButton = driver.findElement(By.cssSelector(divId));

            return 0;
        } catch (NoSuchElementException e) {

            return 1;
        }
    }

}
