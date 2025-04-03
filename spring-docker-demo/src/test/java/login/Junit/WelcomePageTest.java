package login.Junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class WelcomePageTest {
    WebDriver driver;
    WelcomePage objWelcomePage;
    RegisterPage objRegisterPage;
    HomePage homePage;
    Login login;
    @BeforeTest
    public void setup() {

        // Initiate the Webdriver
        driver = new EdgeDriver();

        // adding implicit wait of 12 secs
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Opening the webpage
        driver.get("http://localhost:3000/login");
    }
    @Test(priority = 1)
    public void verifyWelcomePageHeading() {

        // object of WelcomePage page class
        objWelcomePage = new WelcomePage(driver);
        String text = objWelcomePage.verifyPageHeading();
        System.out.println("Page heading in Welcome Page: " + text);

        // assertions to test case
        assertEquals("E-learning", text);
    }


    @Test(priority = 3)
    public void verifyLoginWithincorrectcredientials() {
        login=new Login(driver);
       String er= login.chechloginwithincorrect();
        assertEquals(er, "Incorrect Username or Password");
    }
    @Test(priority = 4)
    public void verifyHomePageHeading() {

        // object of RegisterPage page class
        homePage = new HomePage(driver);
        String text =homePage.WelcomeMessage();
        System.out.println("Page heading in Homepage Page: " + text);

        // assertions to test case
        assertTrue(text.toLowerCase().contains("welcome"),"you are not loged in");
    }

}