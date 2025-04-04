package Tests;
import Selenium.Baseclass;
import Selenium.Registrationpage;
import Selenium.LoginPage;
import Selenium.Products;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;


public class RegistrationTest extends Registrationpage {

        protected static Baseclass baseclass;
        protected static LoginPage loginPage;
        protected static WebDriver driver;
        protected static Products products;
        protected static Registrationpage registrationpage;
        protected static WebDriverWait wait;
        @BeforeClass
        public static void setDriver(){
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://localhost/RegistrationTest/register.php");
            baseclass=new Baseclass();
            baseclass.setDriver(driver);
            products=new Products();
            registrationpage=new Registrationpage();
            wait=new WebDriverWait(driver,Duration.ofSeconds(15));
            baseclass.setDriverWait(wait);
        }
        @Test(priority = 2)
        public void SuccessfulRegistrationTest(){
            registrationpage.setUsernam("lemicvbmftyjutyufhgfosd");
            registrationpage.setPassword("1345786");
            registrationpage.setConfirmpass("1345786");
            registrationpage.clicRegister();

            Assert.assertTrue(registrationpage.getSuccessMessage().contains("suc"),"user is already registerd");
        }
        @Test(priority = 1)
        public void checkUserisAlreadyRegisterd(){
            registrationpage.setUsernam("negasi");
            registrationpage.setPassword("1345786");
            registrationpage.setConfirmpass("1345786");
            registrationpage.clicRegister();
            String actual=registrationpage.checkuserisregisterd();
            Assert.assertTrue(actual.toLowerCase().contains("taken"));
        }
    }


