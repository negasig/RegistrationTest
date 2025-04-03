package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Baseclass {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public void setDriver(WebDriver driver){
        this.driver=driver;
    }
    public void setDriverWait(WebDriverWait wait){
        this.wait=wait;
    }
    protected WebElement find(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
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
