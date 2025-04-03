    package login;

    import org.openqa.selenium.By;
    import org.springframework.util.Assert;

    public class Products extends Baseclass{

        private By prouctheader=By.xpath("/html/body/h1");
        public boolean isProductpagedisplayed(){
          return find(prouctheader).isDisplayed();
      }
    }

