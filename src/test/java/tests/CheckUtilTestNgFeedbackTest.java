package tests;
import feedbackPages.CheckUtilTestNgFeedback;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CheckUtilTestNgFeedbackTest {

    WebDriver driver;

    CheckUtilTestNgFeedback objCheckUtilTestNgFeedback;

    private final static String DRIVER_PATH = "/src/main/resources/drivers/chromedriver";

    private final static String BASE_URL = "https://codility-frontend-prod.s3.amazonaws.com/";

    private final static String PATH = "media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";

    @BeforeClass(alwaysRun = true)

    public void setup(){
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @BeforeMethod

    public void openURL(){

        driver.get(BASE_URL+PATH);

        //Create CheckUtilTestNgTest object
        objCheckUtilTestNgFeedback = new CheckUtilTestNgFeedback(driver);
    }

    /**
     * This case will check if query input and submit button are on the main screen of the application
     */
    @Test()

    public void query_input_and_submit_button_are_on_the_main_screen(){
        Assert.assertTrue(objCheckUtilTestNgFeedback.getInputId(),"Verify input text box is on main screen of the application");
        Assert.assertTrue(objCheckUtilTestNgFeedback.getSubmitButtonId(), "Verify submit button is on main screen of the application");
    }

    @Test()

    public void check_if_searching_with_empty_query_is_forbidden(){
        Assert.assertTrue(objCheckUtilTestNgFeedback.setEmptyQuery(), "Verify if searching with empty query is forbidden");
    }

    @Test()

    public void check_if_searching_with_isla_query_returns_at_least_one_island(){
        Assert.assertTrue(objCheckUtilTestNgFeedback.setIslaQuery(), "Verify if 'island' query is returned at least one <li> result element");
    }

    @Test()

    public void check_if_searching_with_castle_query_returns_no_results_feedback(){
        Assert.assertTrue(objCheckUtilTestNgFeedback.setCastleQuery(), "Verify if user gets feedback if there are no results");
    }

    @Test()

    public void check_if_results_match_the_query(){
        Assert.assertTrue(objCheckUtilTestNgFeedback.setPortQuery(), "Verify if querying for port should return only one result, Port Royal");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
