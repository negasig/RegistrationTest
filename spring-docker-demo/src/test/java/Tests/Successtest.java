package Tests;


import login.Baseclass;
import login.Junit.Registrationpage;
import login.LoginPage;
import login.Products;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Successtest extends Registrationpage {
protected static Baseclass baseclass;
protected static LoginPage loginPage;
protected static WebDriver driver;
protected static Products products;
 protected static Registrationpage registrationpage;
@BeforeClass
public static void setDriver(){
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/MyProject/register.php");
 baseclass=new Baseclass();
 baseclass.setDriver(driver);
products=new Products();
registrationpage=new Registrationpage();
}
   @Test
    public void SuccessfulRegistrationTest(){
    registrationpage.setUsernam("Gebggrhihf");
    registrationpage.setPassword("1345786");
    registrationpage.setConfirmpass("1345786");
    registrationpage.clicRegister();
    String actualresult=registrationpage.getSuccessMessage();
    Assert.assertTrue(actualresult.toLowerCase().contains("successfully"));
    }
}
