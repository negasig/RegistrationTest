package login.Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    By text = By.xpath("//*[@id='signupForm']/h1");
    public RegisterPage(WebDriver driver) {
        this.driver=driver;
    }
    public String verifyPageHeading() {
        String getHeadtext = driver.findElement(text).getText();
        return  getHeadtext;
    }
}