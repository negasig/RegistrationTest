package login.Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    WebDriver driver;
    By text = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/h3");
    By btn = By.xpath("//*[@id='signInForm']/div[3]/a");
    public WelcomePage(WebDriver driver) {
        this.driver=driver;
    }
    public String verifyPageHeading() {
        String getHeadtext = driver.findElement(text).getText();
        return  getHeadtext;
    }
    public void clickOnNewUser() {
        driver.findElement(btn).click();
    }
}