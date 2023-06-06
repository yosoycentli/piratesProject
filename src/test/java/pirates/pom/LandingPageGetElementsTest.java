package pirates.pom;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.CheckUtilTestNgFeedbackTest;

import java.util.concurrent.TimeUnit;

public class LandingPageGetElementsTest {

    private WebDriver driver;

    LandingPageGetElements landingPageGetElements;

    Logger logger = LoggerFactory.getLogger(CheckUtilTestNgFeedbackTest.class);

    private final static String BASE_URL = "https://codility-frontend-prod.s3.amazonaws.com/";

    private final static String PATH = "media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";

    @BeforeClass(alwaysRun = true)

    public void setup() throws Exception{
        logger.info("Setup starting");
        landingPageGetElements = new LandingPageGetElements(driver);
        driver = landingPageGetElements.chromeDriverConnection();
        landingPageGetElements.visit(BASE_URL+PATH);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @BeforeMethod

    public void openURL(){
        driver.get(BASE_URL+PATH);

    }

    @AfterClass

    public void tearDown() {
        logger.info("Close the browser");
        driver.quit();

    }

    @Test()

    public void query_input_and_submit_button_are_on_the_main_screen(){
        Assert.assertTrue(landingPageGetElements.getInputId(),"Verify input text box is on main screen of the application");
        Assert.assertTrue(landingPageGetElements.getSubmitButtonId(), "Verify submit button is on main screen of the application");
    }

}
