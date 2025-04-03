package login.Junit;

import login.Baseclass;
import org.openqa.selenium.By;
public class Registrationpage extends Baseclass{


        private By usernam=By.xpath("/html/body/div/form/div[1]/input");
        private By password=By.xpath("/html/body/div/form/div[2]/input");
        private By confirmpass=By.xpath("/html/body/div/form/div[3]/input");
        private By registerbtn=By.xpath("/html/body/div/form/div[4]/input[1]");
        private By successmege=By.xpath("//*[@id=\"successmsg\"]");

        public void setUsernam(String username){
            set(usernam, username);
        }
        public void setPassword(String pass){
            set(password, pass);
        }
        public void setConfirmpass(String confirmp){
            set(confirmpass, confirmp);
        }
        public void clicRegister(){
            click(registerbtn);
        }

        public String getSuccessMessage(){
            return find(successmege).getText();
        }
    }
