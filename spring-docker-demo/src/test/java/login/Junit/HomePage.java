package login.Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    HomePage(WebDriver driver){
        this.driver=driver;
    }
    By home=By.className("admin");
    public String WelcomeMessage(){
        String header=driver.findElement(home).getText();
        return header;
    }
}
