package Tests;


import login.Baseclass;
import login.Junit.Registrationpage;
import login.LoginPage;
import login.Products;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Successtest extends Registrationpage {
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
driver.get("http://localhost/MyProject/register.php");
 baseclass=new Baseclass();
 baseclass.setDriver(driver);
 wait=new WebDriverWait(driver, Duration.ofSeconds(10));
products=new Products();
registrationpage=new Registrationpage();
baseclass.setDriverWait(wait);
}
   @Test(priority = 2)
    public void SuccessfulRegistrationTest(){
    registrationpage.setUsernam("lemaontt");
    registrationpage.setPassword("1345786");
    registrationpage.setConfirmpass("1345786");
    registrationpage.clicRegister();
    String actualresult=registrationpage.getSuccessMessage();
    Assert.assertFalse(actualresult.toLowerCase().contains("successfully"));
    }
    @Test(priority = 1)
 public void checkUserisAlkreadyRegisterd(){
     registrationpage.setUsernam("negasi");
     registrationpage.setPassword("1345786");
     registrationpage.setConfirmpass("1345786");
     registrationpage.clicRegister();
String actual=registrationpage.checkuserisregisterd();
Assert.assertTrue(actual.toLowerCase().contains("taken"));
    }
}
