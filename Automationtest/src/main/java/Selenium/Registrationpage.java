package Selenium;

import Selenium.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage extends Baseclass{


        private By usernam=By.xpath("/html/body/div/form/div[1]/input");
        private By password=By.xpath("/html/body/div/form/div[2]/input");
        private By confirmpass=By.xpath("/html/body/div/form/div[3]/input");
        private By registerbtn=By.xpath("/html/body/div/form/div[5]/input[1]");
        private By successmege=By.xpath("//*[@id=\"successmsg\"]");
        private By isregisterd=By.xpath("//*[@id=\"userexist\"]");
        private  By country=By.xpath("/html/body/div/form/div[4]/select");
        public void setUsernam(String username){
            set(usernam, username);
        }
        public void setPassword(String pass){
            set(password, pass);
        }
        public void setConfirmpass(String confirmp){
            set(confirmpass, confirmp);
        }
          public void setCountry(String count) throws InterruptedException {
        selectCountry(country, count);
       }
        public void clicRegister(){
            click(registerbtn);
        }
        public String getSuccessMessage(){
            return find(successmege).getText();
        }
        public String checkuserisregisterd(){
           return find(isregisterd).getText();
        }

    }
