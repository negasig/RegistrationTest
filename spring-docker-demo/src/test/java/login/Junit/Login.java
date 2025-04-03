package login.Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    WebDriver driver;
    By username=By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/input[1]");
    By password=By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/input[2]");
    By logibutton=By.xpath("//*[@id=\"btn\"]");
    By error=By.id("er");
   public Login(WebDriver driver){
        this.driver=driver;
    }
    public void chechlogin(){
        driver.findElement(username).sendKeys("negasi");
        driver.findElement(password).sendKeys("1234");
        driver.findElement(logibutton).click();
    }
    public String chechloginwithincorrect(){
        driver.findElement(username).sendKeys("negas");
        driver.findElement(password).sendKeys("1234");
        driver.findElement(logibutton).click();
        return driver.findElement(error).getText();
    }
}
