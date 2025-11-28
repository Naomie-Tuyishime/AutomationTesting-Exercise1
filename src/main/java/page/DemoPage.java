package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoPage {
    private WebDriver driver;
    public DemoPage(WebDriver driver) {
        this.driver = driver;
    }
    public TexBoxPage clickTextBox (){
        getLinkD("Text Box");
        return new TexBoxPage(driver ) ;
    }
    public void getLinkD(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
