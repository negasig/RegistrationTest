package Selenium;
import org.openqa.selenium.By;

public class LoginPage extends Baseclass {
    ;
         private By usernam=By.xpath("/html/body/div/form/div[1]/input");
         private By password=By.xpath("/html/body/div/form/div[2]/input");
         private By login=By.xpath("/html/body/div/form/div[3]/input");
         private By error=By.xpath("/html/body/div/div");
         private By logoutbutton=By.xpath("/html/body/p/a[2]");
         private By loginheader=By.xpath("/html/body/div/h2");
    public void setUsernam(String username){
        set(usernam, username);
    }
    public void setPassword(String pass){
        set(password, pass);
    }
    public void setError(String err){
        set(error, err);
    }
    public void clickLogin(){
        click(login);
    }
    public void clickLogout(){
        click(logoutbutton);
    }
    public boolean isLogindisplayed(){
     return find(loginheader).isDisplayed();
    }

    public String getErrorMessage(){
        return find(error).getText();
    }
}
