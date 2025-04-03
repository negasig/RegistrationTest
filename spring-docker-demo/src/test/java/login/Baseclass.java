package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass {
    public static WebDriver driver;
    public void setDriver(WebDriver driver){
        this.driver=driver;
    }
    protected WebElement find(By locator){
        return driver.findElement(locator);
    }
    protected void set(By locator, String value){
        find(locator).clear();
        find(locator).sendKeys(value);
    }
    protected void click(By locator){
        find(locator).click();
    }

}
