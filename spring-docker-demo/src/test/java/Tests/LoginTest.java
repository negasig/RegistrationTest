package Tests;


import jakarta.annotation.Priority;
import login.Baseclass;
import login.Junit.Login;
import login.LoginPage;
import login.Products;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends LoginPage {
protected static Baseclass baseclass;
protected static LoginPage loginPage;
protected static WebDriver driver;
protected static Products products;
@BeforeClass
public static void setDriver(){
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/MyProject/login.php");
 baseclass=new Baseclass();
 baseclass.setDriver(driver);
 loginPage =new LoginPage();
products=new Products();

}
   @Test(priority = 1)
    public void testInvalidcredientials(){
    loginPage.setUsernam("negufkl");
    loginPage.setPassword("fxhgcj");
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
