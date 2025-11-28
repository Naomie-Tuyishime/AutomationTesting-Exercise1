package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumCoursePage {
    private WebDriver driver;
    private By seleniumTraining = By.xpath("//a[@href=\"/selenium-training?q=menu\"]");
    public SeleniumCoursePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSeleniumTrainingLink (){
        WebElement element = driver.findElement(seleniumTraining);
    }
}
