package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import pages.CheckUtilTestNg;

public class CheckUtilTestNgTest {

    String driverPath = "/src/main/resources/drivers/chromedriver";
    static String pirateUrl = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";
    WebDriver driver;

    CheckUtilTestNg objCheckUtilTestNg;

    @BeforeTest

    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(pirateUrl);
    }

    /**
     * This case will check if query input and submit button are on the main screen of the application
     */
    @Test(priority = 0)

    public void query_input_and_submit_button_are_on_the_main_screen(){
        //Create CheckUtilTestNgTest object

        objCheckUtilTestNg = new CheckUtilTestNg(driver);

        System.out.println(objCheckUtilTestNg.getInputId());
        Assert.assertTrue(objCheckUtilTestNg.getInputId());


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}