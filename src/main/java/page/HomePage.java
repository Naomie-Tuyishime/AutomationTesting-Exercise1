package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By uploadpagelink = By.xpath("//*[@id=\"item-7\"]");
    private By elements = By.className("header-text");
    private By uploadFile = By.cssSelector("span.text");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public AboutPage clickAbout(){
        getLink("ABOUT");
        return null;
    }

    public SeleniumCoursePage clickSeleniumCoursePage (){
        getLink("SELENIUM TRAINING");
        return null;
    }

    public  void clickElement (){
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
    }

    /**
     * Clicks the 'Upload and Download' menu item robustly.
     * This uses Explicit Wait and JavaScript scrolling and clicking to resolve ElementNotInteractableException.
     */
    public Uploadpage clickUpload(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement uploadElement = wait.until(ExpectedConditions.presenceOfElementLocated(uploadpagelink));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", uploadElement);


        js.executeScript("arguments[0].click();", uploadElement);
                return new Uploadpage (driver);


    }

    public void getLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}