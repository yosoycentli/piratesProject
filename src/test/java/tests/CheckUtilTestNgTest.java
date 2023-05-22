package tests;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.CheckUtilTestNg;

public class CheckUtilTestNgTest {

    String driverPath = "/src/main/resources/drivers/chromedriver";
    static String pirateUrl = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";
    WebDriver driver;

    CheckUtilTestNg objCheckUtilTestNg;

    @BeforeClass

    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod

    public void openURL(){
        driver.get(pirateUrl);
    }

    /**
     * This case will check if query input and submit button are on the main screen of the application
     */
    @Test(priority = 0)

    public void query_input_and_submit_button_are_on_the_main_screen(){
        //Create CheckUtilTestNgTest object

        objCheckUtilTestNg = new CheckUtilTestNg(driver);

        Assert.assertTrue(objCheckUtilTestNg.getInputId());
        Assert.assertTrue(objCheckUtilTestNg.getSubmitButtonId());
    }

    @Test(priority = 0)

    public void check_if_searching_with_empty_query_is_forbidden(){
        //Create CheckUtilTestNgTest object

        objCheckUtilTestNg = new CheckUtilTestNg(driver);

        Assert.assertTrue(objCheckUtilTestNg.setEmptyQuery());
    }

    @Test(priority = 0)

    public void check_if_searching_with_isla_query_returns_at_least_one_island(){
        //Create CheckUtilTestNgTest object

        objCheckUtilTestNg = new CheckUtilTestNg(driver);

        Assert.assertTrue(objCheckUtilTestNg.setIslaQuery());
    }

    @Test(priority = 0)

    public void check_if_searching_with_castle_query_returns_no_results_feedback(){
        //Create CheckUtilTestNgTest object

        objCheckUtilTestNg = new CheckUtilTestNg(driver);

        Assert.assertTrue(objCheckUtilTestNg.setCastleQuery());
    }

    @Test(priority = 0)

    public void check_if_results_match_the_query(){
        objCheckUtilTestNg = new CheckUtilTestNg(driver);

        Assert.assertTrue(objCheckUtilTestNg.setPortQuery());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}