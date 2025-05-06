package Tests;
import Selenium.Baseclass;
import Selenium.Registrationpage;
import Selenium.LoginPage;
import Selenium.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
            driver.get("http://localhost/RegistrationTest/Frontend/register.php");
            baseclass=new Baseclass();
            baseclass.setDriver(driver);
            products=new Products();
            registrationpage=new Registrationpage();
            wait=new WebDriverWait(driver,Duration.ofSeconds(20));
            baseclass.setDriverWait(wait);
        }
        @Test(priority = 1)
        public void SuccessfulRegistrationTest() throws InterruptedException {
            registrationpage.setUsernam("Gidenu");
            registrationpage.setPassword("123456");
            registrationpage.setConfirmpass("123456");
            registrationpage.setCountry("Nigeria");
            registrationpage.setGender();
            registrationpage.clicRegister();

            Assert.assertTrue(registrationpage.getSuccessMessage().contains("registered"));
        }
        @Test(priority = 2)
        public void checkUserisAlreadyRegisterd() throws InterruptedException {
            registrationpage.setUsernam("geriso");
            registrationpage.setPassword("123456");
            registrationpage.setConfirmpass("123456");
            registrationpage.setCountry("USA");
            registrationpage.setGender();
            registrationpage.clicRegister();
            String actual=registrationpage.checkuserisregisterd();
            Assert.assertTrue(actual.toLowerCase().contains("taken"));
            driver.quit();
        }
    }


