package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
   public AboutPage clickAbout(){
       getLink("ABOUT");
       return new AboutPage (driver);
   }
   public SeleniumCoursePage clickSeleniumCoursePage (){
        getLink("SELENIUM TRAINING");
        return new SeleniumCoursePage(driver);

    }
    public Uploadpage clickUpload(String s){
        getLink("Upload and Download");
        return new  Uploadpage(driver);
    }


    public void getLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }



}
