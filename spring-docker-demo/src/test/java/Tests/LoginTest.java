package Tests;


import Selenium.Baseclass;
import Selenium.LoginPage;
import Selenium.Products;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends LoginPage {
protected static Baseclass baseclass;
protected static LoginPage loginPage;
protected static WebDriver driver;
protected static Products products;
 public static WebDriverWait wait;
@BeforeClass
public static void setDriver(){
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/RegistrationTest/login.php");
 baseclass=new Baseclass();
 baseclass.setDriver(driver);
 loginPage =new LoginPage();
products=new Products();
wait=new WebDriverWait(driver,Duration.ofSeconds(10));
baseclass.setDriverWait(wait);
}
   @Test(priority = 1)
    public void testInvalidcredientials(){
    loginPage.setUsernam("negufkl");
    loginPage.setPassword("rtfhgjhkn");
    loginPage.clickLogin();
    String actualresult=loginPage.getErrorMessage();
    Assert.assertTrue(actualresult.toLowerCase().contains("invalid"));
    }
    @Test(priority = 2)
 public void checkSucessfullLogin(){
 loginPage.setUsernam("negasi");
 loginPage.setPassword("123456");
 loginPage.clickLogin();
 Assert.assertTrue(products.isProductpagedisplayed());
    }

}
